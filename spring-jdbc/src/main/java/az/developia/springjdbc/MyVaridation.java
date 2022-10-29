package az.developia.springjdbc;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = StudentCodeValidator.class)
@Target( { ElementType.FIELD})
@Retention( RetentionPolicy.RUNTIME )
@Documented

public @interface MyVaridation {
	
 public String value() default "Best";

 public String message() default "Kod Best ilə başlamalıdır!!!";
 
 Class<?>[] groups() default {};
 Class<? extends Payload>[] payload() default {};
	
}
