package com.campaign.test.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * Created by soner.ustel on 20/04/2018.
 */
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = LoginValidator.class)
@Documented
public @interface LoginValidate {

    String message() default "Giriş Başarısız!";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
