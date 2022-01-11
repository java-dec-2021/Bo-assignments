package com.bo.dojosandninjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bo.dojosandninjas.models.Dojo;
import com.bo.dojosandninjas.models.Ninja;
import com.bo.dojosandninjas.repositories.DojoRepository;
import com.bo.dojosandninjas.repositories.NinjaRepository;

@Service
public class DojoNinjaService {
	@Autowired
	private DojoRepository dRepo;
	
	@Autowired
	private NinjaRepository nRepo;
	
	public Dojo createDojo(Dojo dojo) {
		return dRepo.save(dojo);
	}
	
	public List<Dojo> getAllDojos() {
		return dRepo.findAll();
	}
	
	public Dojo getOneDojo(Long id) {
		return this.dRepo.findById(id).orElse(null);	// findById returns an Optional therefore we need to specity orElse(null)
	}
	
	public Ninja createNinja(Ninja ninja) {
		return nRepo.save(ninja);
	}
	
	public List<Ninja> getAllNinjas() {
		return nRepo.findAll();
	}

}




















