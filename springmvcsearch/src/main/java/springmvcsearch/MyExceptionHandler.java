package springmvcsearch;

import java.io.FileNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler {
	
	// Handling Exception in spring mvc

	// @ExceptionHandler({NullPointerException.class, NumberFormatException.class})
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NullPointerException.class)
	public String exceptionHandlerNull(Model m) {
		m.addAttribute("msg", "500 <br> Null Pointer Exception has occured");
		return "null_page";

	}

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = NumberFormatException.class)
	public String exceptionHandlerNumberFormat(Model m) {
		m.addAttribute("msg", "500 <br>Number format Exception has occured");
		return "null_page";

	}
	
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@ExceptionHandler(value = FileNotFoundException.class)
	public String exceptionHandlerFileNotFound(Model m) {
		m.addAttribute("msg", "404 <br> File Not Found Exception has occured");
		return "null_page";

	}

	// Handling All Exception in spring mvc
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value = Exception.class)
	public String exceptionHandler(Model m) {
		m.addAttribute("msg", "An Exception has occured");
		return "null_page";

	}

}
