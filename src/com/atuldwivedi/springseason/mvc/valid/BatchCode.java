package com.atuldwivedi.springseason.mvc.valid;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = BatchCodeConstraintValidator.class)
@Retention(RUNTIME)
@Target(FIELD)
public @interface BatchCode {

	public String value() default "Male";

	public String message() default "suffix should be Male";

	public Class<?>[] groups() default {};

	public Class<? extends Payload>[] payload() default {};

}
