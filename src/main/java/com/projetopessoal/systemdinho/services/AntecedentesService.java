package com.projetopessoal.systemdinho.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetopessoal.systemdinho.entities.Antecedentes;
import com.projetopessoal.systemdinho.repositories.AntecedentesRepository;

@Service
public class AntecedentesService {
	@Autowired
	private AntecedentesRepository repository;

	public List<Antecedentes> findAll() {
		return repository.findAll();
	}

	public Antecedentes findById(Long id) {
		Optional<Antecedentes> obj = repository.findById(id);
		return obj.get();
	}
	
}
