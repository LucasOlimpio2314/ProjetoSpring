package com.projetopessoal.systemdinho.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetopessoal.systemdinho.entities.Antecedentes;
import com.projetopessoal.systemdinho.services.AntecedentesService;


@RestController
@RequestMapping(value = "/antecedentes")
public class AntecedentesResource {
	
	@Autowired
	private AntecedentesService service;
	
	@GetMapping
	public ResponseEntity<List<Antecedentes>> findAll(){
		List<Antecedentes> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Antecedentes> findById(@PathVariable Long id){
		Antecedentes obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
