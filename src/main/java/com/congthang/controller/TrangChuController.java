package com.congthang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TrangChuController {
	@GetMapping
	public String Main() {
		return "Main";
	}
}