package az.developia.springjpagunel.exception;

import org.springframework.validation.BindingResult;

import lombok.Getter;
import lombok.Setter;
@SuppressWarnings("serial")
@Getter
@Setter
public class MyValidationException extends RuntimeException {

	private BindingResult br;

	public MyValidationException(BindingResult br) {
		
		this.br = br;
	}
	
}
