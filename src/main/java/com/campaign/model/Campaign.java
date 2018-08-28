package com.campaign.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CAMPAIGN")
public class Campaign extends BaseModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "START_DATE")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "HTML")
    @Lob
    private String html;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name  = "modified_date")
    private Date modifiedDate;

    @ManyToOne
    private Seller seller;

    @ManyToOne
    private Category category;

}
