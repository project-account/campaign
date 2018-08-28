package com.campaign.converter;

import com.campaign.dao.CategoryDao;
import com.campaign.dao.SellerDao;
import com.campaign.dto.CampaignDTO;
import com.campaign.model.Campaign;
import com.campaign.model.Category;
import com.campaign.model.Seller;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class CampaignConverter {

    @Autowired
    private SellerDao sellerDao;

    @Autowired
    private CategoryDao categoryDao;

    public List<CampaignDTO> convert(List<Campaign> campaignList){
        if(CollectionUtils.isEmpty(campaignList)){
            return null;
        }
        return campaignList.stream().map(e -> convert(e)).collect(Collectors.toList());
    }

    public CampaignDTO convert(Campaign campaign){
        if(campaign == null){
            return null;
        }
        return CampaignDTO.builder().id(campaign.getId())
                .createdDate(campaign.getCreateDate())
                .endDate(campaign.getEndDate())
                .html(campaign.getHtml())
                .startDate(campaign.getStartDate())
                .modifiedDate(campaign.getModifiedDate())
                .sellerId(campaign.getSeller().getId())
                .title(campaign.getTitle())
                .build();
    }

    public Campaign convert(CampaignDTO campaignDTO){
        if(campaignDTO == null){
            return null;
        }
        Optional<Seller> sellerResult = sellerDao.findById(campaignDTO.getSellerId());
        Optional<Category> cateogoryResult = categoryDao.findById(campaignDTO.getCategoryId());

        return Campaign.builder().createDate(campaignDTO.getCreatedDate())
                .startDate(campaignDTO.getStartDate())
                .endDate(campaignDTO.getEndDate())
                .html(campaignDTO.getHtml())
                .createDate(new Date())
                .title(campaignDTO.getTitle())
                .seller(sellerResult.isPresent() ? sellerResult.get() : null)
                .category(cateogoryResult.isPresent() ? cateogoryResult.get() : null)
                .build();
    }
}
