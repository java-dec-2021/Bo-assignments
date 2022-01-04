package com.bo.languages.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bo.languages.models.Language;
import com.bo.languages.services.LanguageService;

@Controller
public class HomeController {
	
	@Autowired
	private LanguageService lService;
	
	@GetMapping("/")
	public String index(Model viewModel) {
		viewModel.addAttribute("allLanguages", this.lService.getAllLanguages());
		return "index.jsp";
	}
	
	@GetMapping("/dashboard")
	public String dashboard() {
		return "redirect:/";
	}
	
//	@GetMapping("/new")
//	public String add(@ModelAttribute("language") Language language) {
//		return "redirect:/index.jsp";
//	}
//	
//	@PostMapping("/new")
//	public String addLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result) {
//		if(result.hasErrors()) {
//			return "redirect:/";
//		}
//		this.lService.saveLanguage(language);
//		return "redirect:/";
//	}

	
	
	@PostMapping("/htmladd")
	public String htmlAdd(@RequestParam("name") String name, @RequestParam("creator") String creator, @RequestParam("currentVersion") String currentVersion) {
		Language saveLanguage = new Language(name, creator, currentVersion);
		this.lService.saveLanguage(saveLanguage);
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String editLanguage(@PathVariable("id") Long id, @ModelAttribute("language") Language language, Model viewModel) {
		viewModel.addAttribute("language", this.lService.getOneLanguage(id));
		return "edit.jsp";
	}
	
	@PostMapping("/edit/{id}")
	public String edit(@Valid @ModelAttribute("language") Language language, BindingResult result, @PathVariable("id") Long id, Model viewModel) {
		if(result.hasErrors()) {
			viewModel.addAttribute("language", this.lService.getOneLanguage(id));
			return "edit.jsp";
		}
		this.lService.updateLanguage(language);
		return "redirect:/";
	}
	
	@GetMapping("/details/{id}")
	public String languageDetail(@PathVariable("id") Long id, @ModelAttribute("language") Language language, Model viewModel) {
		viewModel.addAttribute("language", this.lService.getOneLanguage(id));
		return "show.jsp";
	}
	
	
	
//	@DeleteMapping("/delete/{id}")
//	public String deleteLanguage(@PathVariable("id") Long id) {
//		this.lService.deleteLanguage(id);
//		return "redirect:/";
//	}
	
	// Delete 
	@GetMapping("/delete/{id}")
	public String deleteLanguage(@PathVariable("id") Long id) {
		this.lService.deleteLanguage(id);
		return "redirect:/";
	}
	
		
}




























