package com.atuldwivedi.springseason.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String studentRegistration(Model model) {
		model.addAttribute("student", new Student());
		return "student-form";
	}

	@RequestMapping("/processForm")
	public String processStudentRegistration(@ModelAttribute("student") Student newStudent, @RequestParam("password") char[] password) {
		System.out.println(password);
		return "student-confirmation";
	}
}
