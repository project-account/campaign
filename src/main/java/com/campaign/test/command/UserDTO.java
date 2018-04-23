package com.campaign.test.command;

import com.campaign.test.annotation.PasswordMatch;
import lombok.Data;
import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/**
 * Created by soner.ustel on 18/04/2018.
 */
@Data
@Getter
@PasswordMatch(password = "password", passwordConfirm = "passwordConfirm")
public class UserDTO {

    @NotEmpty(message = "Lütfen isminizi girin")
    private String name;

    @NotEmpty(message = "Lütfen email adresinizi girin")
    @Email(message = "Lütfen geçerli bir email adresi girin")
    private String email;

    @NotEmpty(message = "Lütfen şifrenizi girin")
    private String password;

    @NotEmpty(message = "Lütfen şifrenizi doğrulayın")
    private String passwordConfirm;
}
