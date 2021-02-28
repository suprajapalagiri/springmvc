package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloworldController {

	@GetMapping("/hello")
	public ModelAndView getHelloWorldPage(){
		return new ModelAndView("helloworld");
	}
}
