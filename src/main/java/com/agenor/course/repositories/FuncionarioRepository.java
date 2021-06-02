package com.agenor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenor.course.entities.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
	
	

}
