package com.campaign.test.command;

import lombok.Data;
import lombok.Getter;

import javax.validation.constraints.NotNull;

/**
 * Created by soner.ustel on 18/04/2018.
 */
@Data
@Getter
public class UserDTO {

    private String name;
    private String email;
    private String password;
    private String passwordSecond;
}
