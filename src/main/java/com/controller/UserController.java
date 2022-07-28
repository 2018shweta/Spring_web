package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.UserBean;
import com.dao.UserDao;

@Controller
public class UserController {
    
	@Autowired
	UserDao userDao;
	@GetMapping("/listusers")
	public String getAllUsers(Model model)
	{
		
		
		List<UserBean> users = userDao.getAllUsers();
		model.addAttribute("users",users);
		return "ListUser";
		
	}
	@GetMapping("/deleteuser")
	public String deleteuser(Model model,@RequestParam("userid") int userId)
	{
		
		userDao.deleteuser(userId);
		return "redirect:/listusers";
		
	}
	@GetMapping("/viewsuser")
	public String viewsUser(Model model,@RequestParam("userid") int userId)
	{
		UserBean user=userDao.getUserByUserId(userId);
		model.addAttribute("user",user);
		return "Views";
		
	}
	@GetMapping("/searchuser")
	public String searchUser()
	{
		
		return "SearchUser";
		
	}
	
	@PostMapping("/searchuser")
	public String searchUser(Model model,@RequestParam("name") String name)
	{
		System.out.println(name);
		List<UserBean> user=userDao.getSearchUser(name);
		model.addAttribute("users",user);
		
		return "ListUser";
	}
	@GetMapping("/edituser")
	public String editUser(@RequestParam("userid") int userId, Model model) {
		System.out.println(userId);
		UserBean user = userDao.getUserByUserId(userId);
		model.addAttribute("user",user);
		return "EditUser";
	}
	
	@PostMapping("/updateuser")
	public String updateUser(UserBean user) {
		userDao.updateUser(user);
		return "redirect:/listusers";
	}
	
}
