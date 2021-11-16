package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {

	@RequestMapping(path = "/complex")
	public String showForm() {
		return "complex_form";
	}

	@RequestMapping(path = "/handle", method = RequestMethod.POST)
	public String formHandle(@ModelAttribute("student") Student student) {
		System.out.println(student);
		return "success";

	}

}
