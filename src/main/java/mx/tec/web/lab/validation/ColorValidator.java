package mx.tec.web.lab.validation;

import java.util.Arrays;
import java.util.List;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ColorValidator implements ConstraintValidator<ValidSize, String> {
	private final List<String> validColors = Arrays.asList("Red", "Blue", "Green", "Black", "Grey", "Light Grey");

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		return validColors.contains(value);
	}
}
