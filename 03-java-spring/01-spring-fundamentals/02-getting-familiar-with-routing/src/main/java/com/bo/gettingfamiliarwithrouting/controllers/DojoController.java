package com.bo.gettingfamiliarwithrouting.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/dojo") 
	public String dojo() {
		return "The dojo is awesome!";
	}
	
	@RequestMapping("/dojo/burbank") 
	public String dojoburbank() {
		return "Burbank Dojo is located in Southern California";
	}
	
	@RequestMapping("/dojo/san-jose") 
	public String dojosanjose() {
		return "SJ dojo is the headquarters";
	}
}
