package com.satish.java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	@RequestMapping("/")
	public String welcome()
	{
		return "index.jsp";
		
	}
	@RequestMapping("/login")
	public String loginPage()
	{
		return "login.jsp";
	}
	
	@RequestMapping("/logout-success")
	public String logoutPage()
	{
		return "logout.jsp";
	}
}
