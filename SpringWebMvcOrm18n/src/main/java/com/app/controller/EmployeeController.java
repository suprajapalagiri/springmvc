package com.app.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.Employee;
import com.app.service.EmployeeService;
import com.app.validator.EmployeeValidator;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService service;
	@Autowired
	private EmployeeValidator validator;
	@Autowired
	private MessageSource message;

	@RequestMapping(value = "/reg", method = RequestMethod.GET)
	public String showRegPage(ModelMap map) {
		map.addAttribute("employee", new Employee());
		return "EmployeeRegister";
	}


//	@RequestMapping(value = "/insert", method = RequestMethod.POST)
//	// ***read modelAttribute, next param must be Errors
//	public String saveEmp(Model model) {
//
//		model.addAttribute("employee", new Employee());
//		return "EmployeeRegister";
//	}

	@RequestMapping(value = "/insert", method = RequestMethod.POST)
	// ***read modelAttribute, next param must be Errors
	public String saveEmp(@ModelAttribute("employee") Employee emp, Errors errors, ModelMap map, Locale locale,
			BindingResult bind) {
		System.out.println("saveEMp");
		// check validation errors
		validator.validate(emp, errors);
		// if no errors
		if (!errors.hasErrors()) {
			// save data to DB
			int empId = service.saveEmployee(emp);
			// show success message
			String msg = message.getMessage("success", new Object[] { empId }, locale);
			map.addAttribute("message", msg);
			// clear form
			map.addAttribute("employee", new Employee());
		} else {// if errors exist
			String msg = message.getMessage("fail", null, locale);
			map.addAttribute("message", msg);
		}
		// finally goto UI page
		return "EmployeeRegister";
	}
}
