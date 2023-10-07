package com.example.springBoot_html.service;


import org.springframework.stereotype.Service;

import com.example.springBoot_html.entity.LoginInfo;
import com.example.springBoot_html.repository.LoginRepository;

@Service
public class LoginService 
{
	private LoginRepository repository;
	
	public String registration(LoginInfo info)
	{
		repository.save(info);
		return "registerd successfully";
	}
}
