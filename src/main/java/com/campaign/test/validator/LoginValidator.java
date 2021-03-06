package com.campaign.test.validator;

import com.campaign.model.Seller;
import com.campaign.test.dto.UserLoginDTO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by soner.ustel on 22/04/2018.
 */
public class LoginValidator implements ConstraintValidator<LoginValidate, Object>{

    @Override
    public void initialize(LoginValidate constraintAnnotation) {

    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {

        UserLoginDTO userLoginDTO = (UserLoginDTO) o;
        return retreiveSeller(userLoginDTO) != null;
    }

    // callService
    private Seller retreiveSeller(UserLoginDTO userLoginDTO){
        Seller seller = null;
        return seller;
    }
}
