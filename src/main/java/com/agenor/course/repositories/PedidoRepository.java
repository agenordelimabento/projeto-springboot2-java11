package com.agenor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenor.course.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
	
}
