package com.bugtracker.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bugtracker.model.User;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	private Logger logger = Logger.getLogger(UserController.class);

	@RequestMapping(value = "/showUserRegister")
	public String showUserRegistrationPage(
			@ModelAttribute("userDetails") User user, Model model) {
		logger.info("Request received to show User Registration page");
		model.addAttribute("userDetails", new User());

		return "userRegistration";
	}

}
