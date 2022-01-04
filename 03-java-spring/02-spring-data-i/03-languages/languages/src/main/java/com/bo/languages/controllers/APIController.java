package com.bo.languages.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bo.languages.models.Language;
import com.bo.languages.services.LanguageService;

@RestController		// @RestController used because we are building an API
@RequestMapping("/api")		// all paths will have 'api' to denote the API Controller
public class APIController {
	@Autowired
	private LanguageService lService;
	
	@GetMapping("")
	public List<Language> allLanguages() {
		return this.lService.getAllLanguages();
	}
	
	@GetMapping("/{id}")
	public Language getOneLanguage(@PathVariable("id") Long id) {
		return this.lService.getOneLanguage(id);
	}
	
	@PostMapping("/create")
	public Language create(Language language) {
		return this.lService.saveLanguage(language);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteLanguage(@PathVariable("id") Long id) {
		this.lService.deleteLanguage(id);
		return "Language Deleted";
	}
	
}






























