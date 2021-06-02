package com.agenor.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.agenor.course.entities.Funcionario;
import com.agenor.course.repositories.FuncionarioRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;

	@Override
	public void run(String... args) throws Exception {
		Funcionario f1 = new Funcionario(null, "Diogo", "De Souza", "Gerente", "44444", "5555");
		Funcionario f2 = new Funcionario(null, "Pedro", "Pereira", "Programador", "44444", "33333");
		Funcionario f3 = new Funcionario(null, "Rafael", "Silva", "Programador", "77777", "444444");
		
		funcionarioRepository.saveAll(Arrays.asList(f1, f2, f3));
	}
	
	

}
