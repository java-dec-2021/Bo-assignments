package com.bo.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(Model model, @RequestParam(value="fname", required=false, defaultValue="Human") String fname, 
			Model mod, @RequestParam(value="lname", required=false, defaultValue="Human") String lname) {
		model.addAttribute("fname", fname);
		mod.addAttribute("lname", lname);
		return "index.jsp";
	}
}

