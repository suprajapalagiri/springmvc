package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.login.dao.LoginDao;

@Controller
public class LoginController {
	@Autowired
	LoginDao loginDao;
	
	@GetMapping("/get")
	public void get(){
		System.out.println("welcome");
	}
	
     @GetMapping("/loginpage")
	public String getLoginPage(){
    	 System.out.println("login");
		return "login";	
	}
     @PostMapping("/dologin")
 	public String sumbitCredential(@RequestParam String username,@RequestParam String password){
    	 boolean flag = loginDao.loginCheck(username, password);
    	
    	 if(flag==true){
    		 return "success";
    	 }
    	 else{
    		 return "faiure";	 
    	 }
    
 	}
}
