package az.developia.springjdbc;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class StudentCodeValidator implements ConstraintValidator<MyVaridation, String> {
	private String studentCode;
	
	
@Override
public void initialize(MyVaridation g) {
	
	studentCode = g.value();
}

@Override
public boolean isValid(String value, ConstraintValidatorContext context) {
	boolean result=true;
	if(value.startsWith(studentCode)) {
		result=true;
	}
	else {
		result=false;
	}
	return result;
}
}
