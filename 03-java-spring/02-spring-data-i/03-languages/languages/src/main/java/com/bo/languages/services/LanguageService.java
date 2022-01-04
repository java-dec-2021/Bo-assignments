package com.bo.languages.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bo.languages.models.Language;
import com.bo.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	@Autowired
	private LanguageRepository lRepo;
	
	// Display all Languages
	public List<Language> getAllLanguages() {
		return this.lRepo.findAll();
	}
	
	// Create-Save a Language
	public Language saveLanguage(Language language) {
		return this.lRepo.save(language);
	}
	
	// Read - CRUD repository returns an OPTIONAL meaning if there is nothing in the database, it will return nothing.  We need to add the orElse();
	public Language getOneLanguage(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	
	// Update
	public Language updateLanguage(Language language) {
		return this.lRepo.save(language);
	}
	
	// Delete
	public String deleteLanguage(Long id) {
		this.lRepo.deleteById(id);
		return "Language " + id + " has been deleted.";
	}
	
	
}
































