package com.projetopessoal.systemdinho.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.projetopessoal.systemdinho.entities.Antecedentes;
import com.projetopessoal.systemdinho.entities.User;
import com.projetopessoal.systemdinho.repositories.AntecedentesRepository;
import com.projetopessoal.systemdinho.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private AntecedentesRepository antecedentesRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		User u1 = new User(
				null,
				"Iára Bezerra Amorim",
				"Iára",
				"179464152",
				"30388863196",
				"24/07/1958",
				"Sergino Falcão Amorim",
				"Soraya Barboza Bezerra",
				"Rua R 6",
				"Setor Solar Santa Rita",
				"Goiânia",
				"GO");
		User u2 = new User(
				null,
				"Mayane Holanda Couto",
				"Mayane",
				"361676839",
				"41615281401",
				"22/08/1944",
				"Sergino Falcão Amorim",
				"Soraya Barboza Bezerra",
				"Rua R 6",
				"Setor Solar Santa Rita",
				"Goiânia",
				"GO");
		
		Antecedentes a1 = new Antecedentes(
				null,
				Instant.parse("2024-12-12T15:50:00Z"),
				"Descrição do caso",
				"Rua Cinco",
				"Vila Asem",
				"SP",
				"Itapetininga",
				u2) ;
		Antecedentes a2 = new Antecedentes(
				null,
				Instant.parse("2024-12-12T15:50:00Z"),
				"Descrição do caso",
				"Rua Cinco",
				"Vila Asem",
				"SP",
				"Itapetininga",
				u1) ;
		Antecedentes a3 = new Antecedentes(
				null,
				Instant.parse("2024-12-12T15:50:00Z"),
				"Descrição do caso",
				"Rua Cinco",
				"Vila Asem",
				"SP",
				"Itapetininga",
				u2) ;
		
		userRepository.saveAll(Arrays.asList(u1,u2));
		antecedentesRepository.saveAll(Arrays.asList(a1,a2,a3));
	}
	
	
}
