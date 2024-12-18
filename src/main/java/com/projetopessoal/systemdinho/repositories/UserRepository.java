package com.projetopessoal.systemdinho.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetopessoal.systemdinho.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
