package com.campaign.test.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by soner.ustel on 20/04/2018.
 */
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordMatchValidator.class)
@Documented
public @interface PasswordMatch {

    String message() default "Şifreler eşleşmiyor.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

    String password();
    String passwordConfirm();

}
