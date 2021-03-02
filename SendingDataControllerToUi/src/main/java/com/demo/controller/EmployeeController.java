package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Employee;

@Controller
public class EmployeeController {
@GetMapping("/show")
	public ModelAndView showMsg(){
	ModelAndView mav=new ModelAndView();
	mav.setViewName("home");
	Employee e=new Employee();
	e.setEmpId(1);
	e.setEmpName("supraja");
	e.setEmpSal(100000.00);
	mav.addObject("data", e);
	return mav;
		
	}
}
