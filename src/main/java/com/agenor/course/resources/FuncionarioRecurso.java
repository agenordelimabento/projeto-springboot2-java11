package com.agenor.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agenor.course.entities.Funcionario;

@RestController
@RequestMapping(value = "/funcionarios")
public class FuncionarioRecurso {
	//FuncionárioRecurso: serve para disponibilizar recurso web correspondente a entidade Funcionário
	
	@GetMapping
	public ResponseEntity<Funcionario> findAll() {
		Funcionario f = new Funcionario(1L, "João", "Da Silva", "Diretor", "44444", "123456");
		return ResponseEntity.ok().body(f);
		// Retornar
		
	}
	
}
