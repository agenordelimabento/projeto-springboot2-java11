package com.agenor.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenor.course.entities.Pedido;
import com.agenor.course.repositories.PedidoRepository;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repository;
	
	public List<Pedido> findAll(){
		return repository.findAll();
		//Operação na camada de serviço que repassa a chamada para repository.findAll
	}
	
	public Pedido findById(Long id) {
		Optional<Pedido> obj = repository.findById(id);
		return obj.get();
		// Retornar objeto Pedido que estiver dentro do Optional
	}
}
