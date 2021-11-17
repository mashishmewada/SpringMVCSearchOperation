package springmvcsearch;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/fileform")
	public String showUploadForm() {
		return "fileform";

	}

	@RequestMapping(path = "/uploadimage", method = RequestMethod.POST)
	public String fileupload(@RequestParam("profile") CommonsMultipartFile file, HttpSession httpSession, Model m) {
		System.out.println("success.......");
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());

		// get file data
		byte[] data = file.getBytes();

		// we have to save this file to server
		String path = httpSession.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "recources"
				+ File.separator + "image" + File.separator + file.getOriginalFilename();

		System.out.println(path);

		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.println("file uploaded !");

			m.addAttribute("msg", "Upload successfully");
			m.addAttribute("filename", file.getOriginalFilename());

		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Uploading error...");
			m.addAttribute("msg", "Uploading error...");
		}

		return "filesuccess";

	}

}
