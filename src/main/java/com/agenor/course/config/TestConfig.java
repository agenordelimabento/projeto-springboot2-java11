package com.agenor.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.agenor.course.entities.Cliente;
import com.agenor.course.entities.Funcionario;
import com.agenor.course.entities.Pedido;
import com.agenor.course.repositories.ClienteRepository;
import com.agenor.course.repositories.FuncionarioRepository;
import com.agenor.course.repositories.PedidoRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private PedidoRepository pedidoRepository;

	@Override
	public void run(String... args) throws Exception {
		Funcionario f1 = new Funcionario(null, "Diogo", "De Souza", "Gerente", "44444", "5555");
		Funcionario f2 = new Funcionario(null, "Pedro", "Pereira", "Programador", "44444", "33333");
		Funcionario f3 = new Funcionario(null, "Rafael", "Silva", "Programador", "77777", "444444");
		
		funcionarioRepository.saveAll(Arrays.asList(f1, f2, f3));
		
		Cliente c1 = new Cliente(null, "Maria da Silva", "Rua João XXIII, 12, Centro", "889955", "maria@gmail.com");
		Cliente c2 = new Cliente(null, "Carlos Souza", "Avenida Antonio da Silva", "77884455", "carlos@gmail.com");
		Cliente c3 = new Cliente(null, "Rodrigo dos Santos", "Av. Pedro dos Santos", "123654", "rodrigo@exmail.com");
		
		Pedido p1 = new Pedido(null, Instant.parse("2021-06-05T12:02:07Z"), c1); 
		Pedido p2 = new Pedido(null, Instant.parse("2021-05-10T05:41:10Z"), c2); 
		Pedido p3 = new Pedido(null, Instant.parse("2021-04-22T19:20:22Z"), c1);
		Pedido p4 = new Pedido(null, Instant.parse("2021-02-10T19:41:55Z"), c3);
		
		clienteRepository.saveAll(Arrays.asList(c1, c2, c3));
		
		pedidoRepository.saveAll(Arrays.asList(p1, p2, p3, p4));
	}

}
