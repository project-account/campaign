package com.campaign.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CampaignDTO {

    private Long id;
    private Long version;
    private Boolean deleted;
    private Long sellerId;
    private Date startDate;
    private Date endDate;
    private String title;
    private String html;
    private Date createdDate;
    private Date modifiedDate;
    private Long categoryId;

}
