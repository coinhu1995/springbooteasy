package com.nhunh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	@ResponseBody
	@RequestMapping("/home")
	public String hello() {
		return "Hello";
	}

	@RequestMapping("/login")
	public String doLogin() {
		return "loginPage";
	}
}
