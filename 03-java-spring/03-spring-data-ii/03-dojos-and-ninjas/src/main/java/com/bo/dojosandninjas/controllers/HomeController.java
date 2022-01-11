package com.bo.dojosandninjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.bo.dojosandninjas.models.Dojo;
import com.bo.dojosandninjas.models.Ninja;
import com.bo.dojosandninjas.services.DojoNinjaService;

import net.bytebuddy.asm.Advice.This;

@Controller
public class HomeController {
	@Autowired
	private DojoNinjaService dnService;	
	
	@GetMapping("/")
	public String index(Model viewModel) {
		viewModel.addAttribute("dojos", this.dnService.getAllDojos());
		return "index.jsp";
	}
	
	@GetMapping("/dojo")
	public String dojo() {
		return "dojo.jsp";
	}
	
	
	@PostMapping("/createDojo")
	public String create(@RequestParam("name") String name) {
		Dojo addDojo = new Dojo(name);
		this.dnService.createDojo(addDojo);
		return "redirect:/";
	}	
	
	
	
	
	
	
	
	
	
	
	@GetMapping("/ninja")	
	public String createNinja(@ModelAttribute("ninja") Ninja ninja, Model viewModel) {
		viewModel.addAttribute("dojos", this.dnService.getAllDojos());
		return "ninja.jsp";
	}
	
	@PostMapping("/createNinja")
	public String addSong(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
//		Long dojoId = ninja.getDojoLocation().getId();	
		if(result.hasErrors()) {
			return "ninja.jsp";
		}
		this.dnService.createNinja(ninja);
		return "redirect:/";
	}
	
	
	
	
	
	
	
	
	
	@GetMapping("/showDojoWithNinjas/{id}")
	public String show(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("dojoWithNinjas", this.dnService.getOneDojo(id));
		return "show.jsp";
	}
	
	
	
}








