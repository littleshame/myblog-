package com.myblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PageController {
	
	@RequestMapping("/hello")
	public String hello(){
		return "hello";
	}
}
