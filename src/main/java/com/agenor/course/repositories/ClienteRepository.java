package com.agenor.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agenor.course.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
