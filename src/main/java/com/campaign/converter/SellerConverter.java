package com.campaign.converter;

import com.campaign.dto.SellerDTO;
import com.campaign.model.Seller;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class SellerConverter {

    public SellerDTO convert(Seller seller){
        if(seller == null){
            return null;
        }
        return SellerDTO.builder().id(seller.getId())
                .version(seller.getVersion())
                .deleted(seller.getDeleted())
                .name(seller.getName())
                .password(seller.getPassword())
                .emailAddress(seller.getEmailAddress())
                .createdDate(seller.getCreatedDate())
                .modifiedDate(seller.getModifiedDate())
                .build();
    }

    public Seller convert(SellerDTO sellerDTO, Seller seller){
        if(sellerDTO == null ||  seller == null){
            return null;
        }
        seller.setName(sellerDTO.getName());
        seller.setPassword(sellerDTO.getPassword());
        seller.setEmailAddress(sellerDTO.getEmailAddress());
        seller.setModifiedDate(new Date());
        return seller;
    }

}
