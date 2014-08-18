package com.webfactore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@RequestMapping("/hello")
	public ModelAndView helloworld(){
		
		String message = "Hello World";
		return new ModelAndView("hello", "message", message);
	}

}
