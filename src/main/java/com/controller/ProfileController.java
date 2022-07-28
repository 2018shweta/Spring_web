package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.MultipartFile;

import com.bean.ProfileBean;
import com.bean.SecQueAnsBean;
import com.bean.UserBean;
import com.dao.ProfileDao;
import com.dao.SecQueAnsDao;
import com.services.FileUploadService;

@Controller
public class ProfileController {
    @Autowired
	FileUploadService fileUploadService;
    @Autowired
	ProfileDao profileDao;
	@Autowired
	SecQueAnsDao secQueAnsDao;

	@GetMapping("/setsecquestion")
	public String setSecQuestionAns() {
		System.out.println("calling ans que jsp");
		return "SetsecQuestionAns";
	}

	@PostMapping("/savequestionans")
	public String saveQuestionAns(SecQueAnsBean ansBean, HttpSession session, Model model) {

		UserBean user = (UserBean) session.getAttribute("user");
		ansBean.setUserId(user.getUserId());
		secQueAnsDao.addQuestion(ansBean);

		model.addAttribute("msg","question added");
		return "Home";
	}
	@GetMapping("/newprofile")
	public String newProfile()
	{
		return "NewProfile";
	}
	@PostMapping("/saveprofile")
	public String saveProfile(@RequestParam("profile") MultipartFile file,HttpSession session)
	{
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		
		UserBean user=(UserBean)session.getAttribute("user");
		int userId=user.getUserId();
		try {
			fileUploadService.imageUpload(file,userId);
			ProfileBean profileBean=new ProfileBean();
			profileBean.setUserId(userId);
			profileBean.setImgUrl("resources\\images\\"+userId+"\\"+file.getOriginalFilename());
			profileBean.setActive(true);
			profileDao.addImg(profileBean);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "NewProfile";
	}
	
	
	@GetMapping("/listprofileimages")
	public String getAllImg(HttpSession session,Model model) {
	  UserBean user=(UserBean)session.getAttribute("user");
	  int userId=user.getUserId();
	  List<ProfileBean> profiles=profileDao.getAllProfileImgByUser(userId);
	  System.out.println(profiles);
		model.addAttribute("profiles",profiles);
		return "ListProfileImages";
	}
	
}
