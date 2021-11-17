package springmvcsearch;

import java.io.FileNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController extends RuntimeException{


	private static final long serialVersionUID = 1L;

	// using PathVariable annotation we can Map our parameter
	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetails(@PathVariable("userId") int userId, @PathVariable("userName") String userName) {

		System.out.println(userId);
		System.out.println(userName);

		/*
		 * // created Number format Exception here 
		 * Integer.parseInt(userName);
		 */

		return "home";

	}

	@RequestMapping("/home")
	public String home() {
		System.out.println("Going to home view");
		// processing area...
		/*
		 *  // created Null Pointer Exception here 
		 *  String str = null;
		 *  System.out.println(str.length());
		 */
		return "home";
	}

//	@RequestMapping("/search")
//	public RedirectView search(@RequestParam("quarybox") String query) {
//		String url = "https://www.google.com/search?q="+query;
//		RedirectView redirectView = new RedirectView();
//		redirectView.setUrl(url);
//		
//		return redirectView;
//		
//	}

	@RequestMapping("/search")
	public RedirectView search(@RequestParam("quarybox") String query) {
		// String url;
		RedirectView redirectView = new RedirectView();

		redirectView.setUrl("https://www.google.com/search?q=" + query);

		return redirectView;

	}

//	// Handling Exception in spring mvc
//
//	// @ExceptionHandler({NullPointerException.class, NumberFormatException.class})
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value = NullPointerException.class)
//	public String exceptionHandlerNull(Model m) {
//		m.addAttribute("msg", "Null Pointer Exception has occured");
//		return "null_page";
//
//	}
//
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value = NumberFormatException.class)
//	public String exceptionHandlerNumberFormat(Model m) {
//		m.addAttribute("msg", "Number format Exception has occured");
//		return "null_page";
//
//	}
//	
//	@ResponseStatus(value = HttpStatus.NOT_FOUND)
//	@ExceptionHandler(value = FileNotFoundException.class)
//	public String exceptionHandlerFileNotFound(Model m) {
//		m.addAttribute("msg", "404"); 
//		m.addAttribute("msg", "File Not Found Exception has occured");
//		return "null_page";
//
//	}
//
//	// Handling All Exception in spring mvc
//	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler(value = Exception.class)
//	public String exceptionHandler(Model m) {
//		m.addAttribute("msg", "An Exception has occured");
//		return "null_page";
//
//	}

}
