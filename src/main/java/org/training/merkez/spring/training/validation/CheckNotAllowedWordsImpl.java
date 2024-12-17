package org.training.merkez.spring.training.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;

public class CheckNotAllowedWordsImpl implements ConstraintValidator<CheckNotAllowedWords,String> {

    private CheckNotAllowedWords anno;

    @Override
    public void initialize(final CheckNotAllowedWords constraintAnnotation) {
        anno = constraintAnnotation;
    }

    @Override
    public boolean isValid(final String fieldValue,
                           final ConstraintValidatorContext context) {
        return Arrays.stream(anno.value()).noneMatch(fieldValue::contains);
    }
}
