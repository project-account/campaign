package com.campaign.dao;

import com.campaign.model.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignDao extends JpaRepository<Campaign, Long>{

}
