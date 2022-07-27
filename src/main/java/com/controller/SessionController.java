package com.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.UserBean;
import com.dao.UserDao;


@Controller

public class SessionController {
@Autowired
	
	UserDao userDao;
	@RequestMapping(value="/SignUp",method = RequestMethod.GET)
	public String signUp(Model model) {
		UserBean user=new UserBean();
		model.addAttribute("user",user);
		return "SignUp";
		
	}
	@RequestMapping(value="/saveuser",method=RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") @Valid UserBean user,BindingResult result,Model model)
	{
		System.out.println(result);
		if(result.hasErrors())
		{model.addAttribute("user",user);
			return "SignUp";
		}
		else {
			user.setUserType("customer");
			userDao.addUser(user);
			model.addAttribute("msg", "signup success");
			System.out.println(user.getFirstName());
			return "Login";
			
		}
	}
	
	
	
}
