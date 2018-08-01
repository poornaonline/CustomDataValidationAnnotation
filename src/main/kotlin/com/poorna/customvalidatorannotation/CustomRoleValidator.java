package com.poorna.customvalidatorannotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomRoleValidator implements ConstraintValidator<CustomRole, String> {

    public String[] myRoles = { "EMPLOYEE", "BUSINESSMAN" };

    @Override
    public void initialize (CustomRole constraintAnnotation) {}

    @Override
    public boolean isValid (String value, ConstraintValidatorContext context) {

        if (value == null) return false;

        for (String myRole: myRoles) {
            if (value.equalsIgnoreCase(myRole) == true) {
                return true;
            }
        }

        return false;
    }
}
