package com.example.springBoot_html.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.springBoot_html.entity.LoginInfo;
import com.example.springBoot_html.service.LoginService;

@Controller
public class LoginController 
{
	private LoginService service;
	
	@GetMapping("/show")
	public String loginForm()
	{
		return "login_form";
	}
	
	@PostMapping("/register")
	public String userRegistarion(@ModelAttribute LoginInfo login)
	{
		service.registration(login);
		return "login_form";
	}
}