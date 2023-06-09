package com.example.seckilldemo.validator;

import com.example.seckilldemo.utils.ValidatorUtil;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.Validator;
import javax.validation.constraints.NotNull;
import java.lang.annotation.*;

/**
 * Verify phone number
 *
 * @author: boshen
 * @ClassName: isMobile
 */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(
        validatedBy = {
            IsMobileValidator.class
        }
)
public @interface IsMobile {

    boolean required() default true;

    String message() default "Wrong format of cell phone number";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
