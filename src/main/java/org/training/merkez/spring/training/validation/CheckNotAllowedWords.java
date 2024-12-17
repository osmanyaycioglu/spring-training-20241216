package org.training.merkez.spring.training.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD,ElementType.METHOD})
@Constraint(validatedBy = {CheckNotAllowedWordsImpl.class })
public @interface CheckNotAllowedWords {

    String[] value();

    String message() default "String can not contain {value}";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };

}
