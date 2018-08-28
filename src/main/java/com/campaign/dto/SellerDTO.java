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
public class SellerDTO {

    private Long id;
    private Long version;
    private Boolean deleted;
    private String name;
    private String emailAddress;
    private String password;
    private Date createdDate;
    private Date modifiedDate;

}
