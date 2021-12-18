package com.bo.gettingfamiliarwithrouting.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CodingController {
	@RequestMapping("/coding")
	public String coding() {
		return "Hello Coding Dojo!";
	}
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/coding/python")
	public String python() {
		return "Python/Django was awesome!";
	}
	
	@RequestMapping("/coding/java")
	public String java() {
		return "Java/Spring is better!";
	}
}
