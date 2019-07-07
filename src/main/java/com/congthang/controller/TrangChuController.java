package com.congthang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.congthang.entity.User;

@Controller
@RequestMapping("/")
public class TrangChuController {
	@GetMapping
	public String Main() {
		return "Main";
	}
	@PostMapping("/Login")
	public String Login(@ModelAttribute User user, ModelMap modelMap) {
		
		return "Login";
	}
}
