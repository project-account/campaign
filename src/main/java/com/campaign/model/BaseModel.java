package com.campaign.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;

@Data
@MappedSuperclass
public class BaseModel {

    @Version
    private Long version;

    @Column
    private Boolean deleted;

    public BaseModel() {
    }

}
