package com.campaign.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.sql.Clob;
import java.util.Date;

//@Entity
//@Table(name = "CAMPAIGNS")
//@Data
//@Builder
public class Campaigns extends BaseModel{

    @Column(name = "START_DATE")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "HTML")
    private Clob html;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name  = "modified_date")
    private Date modifiedDate;

    @ManyToOne
    private Sellers seller;


}
