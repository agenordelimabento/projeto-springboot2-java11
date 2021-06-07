package com.agenor.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agenor.course.entities.Funcionario;
import com.agenor.course.services.FuncionarioService;

@RestController
@RequestMapping(value = "/funcionarios")
public class FuncionarioRecurso {
	//FuncionárioRecurso: serve para disponibilizar recurso web correspondente a entidade Funcionário
	
	@Autowired
	private FuncionarioService service;
	
	@GetMapping
	public ResponseEntity<List<Funcionario>> findAll() {
		List<Funcionario> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Funcionario> findById(@PathVariable Long id) {
		Funcionario obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}
