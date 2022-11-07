package az.developia.springjpagunel.exception;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyGlobalExceptionHandler {

	@ExceptionHandler
	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
	public List<String> handleValidationException(MyValidationException exc){
		BindingResult br = exc.getBr();
		
		List<String> errors = new ArrayList<String>();
		for (FieldError e : br.getFieldErrors()) {
			errors.add(e.getField()+":::"+e.getDefaultMessage());
		}		
		return errors;
	}
	
	
}
