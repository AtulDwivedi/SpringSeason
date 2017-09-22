package com.atuldwivedi.springseason.mvc.valid;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BatchCodeConstraintValidator implements ConstraintValidator<BatchCode, String> {

	private String batchCodePrefix;

	@Override
	public void initialize(BatchCode theBatchCode) {
		this.batchCodePrefix = theBatchCode.value();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean result = false;

		if (value != null) {
			result = value.startsWith("JM3");
		} else {
			result = true;
		}
		return result;
	}

}
