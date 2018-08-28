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

    @Column
    private Date startDate;

    @Column
    private Date endDate;

    @Column
    private String title;

    @Column
    @Lob
    private String html;

    @Column
    private Date createdDate;

    @Column
    private Date modifiedDate;

    @ManyToOne
    private Seller seller;

    @ManyToOne
    private Category category;

}
