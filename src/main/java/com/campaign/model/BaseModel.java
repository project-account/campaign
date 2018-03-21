package com.campaign.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Data
@Builder
public class BaseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Version
    private Long luc;

    @Column
    private boolean deleted;

    public BaseModel(){
    }

}
