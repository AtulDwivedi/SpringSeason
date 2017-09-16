package com.atuldwivedi.springseason;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	@RequestMapping("/")
	public String showHelloWorldPage() {
		return "hello-world";
	}
}
