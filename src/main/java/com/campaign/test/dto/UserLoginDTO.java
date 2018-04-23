package com.campaign.test.dto;

import com.campaign.test.validator.LoginValidate;
import lombok.Data;
import lombok.Getter;

/**
 * Created by soner.ustel on 23/04/2018.
 */
@Data
@Getter
@LoginValidate
public class UserLoginDTO {

    private String email;
    private String password;

}
