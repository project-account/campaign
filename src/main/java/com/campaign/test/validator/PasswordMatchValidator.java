package com.campaign.test.validator;

import org.apache.commons.beanutils.BeanUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by soner.ustel on 20/04/2018.
 */
public class PasswordMatchValidator implements ConstraintValidator<PasswordMatch, Object>{

    private String password;
    private String passwordConfirm;
    private String message;

    @Override
    public void initialize(PasswordMatch passwordMatch) {
        this.password = passwordMatch.password();
        this.passwordConfirm = passwordMatch.passwordConfirm();
        this.message = passwordMatch.message();
    }

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {

        boolean isPasswordValid = Boolean.FALSE;
        try {
            final String password = BeanUtils.getProperty(o, this.password);
            final String passwordConfirm = BeanUtils.getProperty(o, this.passwordConfirm);
            isPasswordValid = password.equals(passwordConfirm);
        } catch (Exception e) {
            e.printStackTrace();
        }

        constraintValidatorContext.buildConstraintViolationWithTemplate(message).addPropertyNode("password").addConstraintViolation();
        return isPasswordValid;
    }
}
