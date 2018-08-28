package com.campaign.controller;

import com.campaign.converter.CampaignConverter;
import com.campaign.dao.CampaignDao;
import com.campaign.dto.CampaignDTO;
import com.campaign.model.Campaign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "rest/campaign")
public class CampaignController {

    @Autowired
    private CampaignDao campaignDao;

    @Autowired
    private CampaignConverter campaignConverter;

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public void createCampaign(@RequestBody CampaignDTO campaignDTO){
        Campaign campaign = campaignConverter.convert(campaignDTO);
        if(campaign == null){
            return;
        }
        campaignDao.save(campaign);
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<CampaignDTO> retrieveCampaigns(){
        return campaignConverter.convert(campaignDao.findAll());
    }

}
