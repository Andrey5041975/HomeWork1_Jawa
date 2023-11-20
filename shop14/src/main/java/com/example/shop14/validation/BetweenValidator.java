package com.example.shop14.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.math.BigDecimal;

public class BetweenValidator implements ConstraintValidator<Between, BigDecimal> {
    private BigDecimal from = BigDecimal.ZERO;
    private BigDecimal to = BigDecimal.ZERO;

    @Override
    public void initialize(Between c) {
        // параметры из аннотации Between
        from = BigDecimal.valueOf(c.from());
        to = BigDecimal.valueOf(c.to());
    }

    @Override
    public boolean isValid(BigDecimal v, ConstraintValidatorContext c) {
        return v.compareTo(from) >= 0 && v.compareTo(to) <= 0;
    }
}
