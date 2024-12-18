package com.projetopessoal.systemdinho.services;

import java.lang.foreign.Linker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectUpdateSemanticsDataAccessException;
import org.springframework.stereotype.Service;

import com.projetopessoal.systemdinho.entities.User;
import com.projetopessoal.systemdinho.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setNomeCompleto(obj.getNomeCompleto());
		entity.setApelido(obj.getApelido());
		entity.setRg(obj.getRg());
		entity.setCpf(obj.getCpf());
		entity.setDataNacimento(obj.getDataNacimento());
		entity.setNomePai(obj.getNomePai());
		entity.setNomeMae(obj.getNomeMae());
		entity.setEndereco(obj.getEndereco());
		entity.setBairro(obj.getBairro());
		entity.setCidade(obj.getCidade());
		entity.setEstado(obj.getEstado());
	}
}
