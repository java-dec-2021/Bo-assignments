package com.bo.projectone.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//public class HomeController {
//	@RequestMapping("/")
//	public String index() {
//		return "Hello World";
//	}
//}

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
}