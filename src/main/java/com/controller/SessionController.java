package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class SessionController {

	@RequestMapping(value="/SignUp",method = RequestMethod.GET)
	public String signUp() {
		return "SignUp";
		
	}
	
	
	
}
