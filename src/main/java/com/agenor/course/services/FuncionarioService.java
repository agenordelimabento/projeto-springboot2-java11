package com.agenor.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenor.course.entities.Cliente;
import com.agenor.course.entities.Funcionario;
import com.agenor.course.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository repository;
	
	public List<Funcionario> findAll(){
		return repository.findAll();
		//Operação na camada de serviço que repassa a chamada para repository.findAll
	}
	
	public Funcionario findById(Long id) {
		Optional<Funcionario> obj = repository.findById(id);
		return obj.get();
		// Retornar objeto Funcionario que estiver dentro do Optional
	}
	
	public Funcionario insert(Funcionario obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public Funcionario update(Long id, Funcionario obj) {
		Funcionario entity = repository.getOne(id);
		updateData(entity, obj);
		return repository.save(entity);
		
	}

	private void updateData(Funcionario entity, Funcionario obj) {
		entity.setNome(obj.getNome());
		entity.setSobrenome(obj.getSobrenome());
		entity.setCargo(obj.getCargo());
		entity.setTelefone(obj.getTelefone());
		
	}
}
