package xom.shop.Exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AdviceException {

	public AdviceException() {
		super();
	}

	public String idException(Integer id) {
		
		return null;
	}

	@ExceptionHandler(value = NullPointerException.class)
	public void somthing() {
		// TODO Auto-generated method stub
		System.out.println("this is somthing exception method");
	}

}
