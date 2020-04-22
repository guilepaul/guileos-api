package com.guiledev.guileos.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guiledev.guileos.domain.model.Cliente;

@RestController
public class ClienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setNome("Guilherme Di Paula");
		cliente1.setEmail("guilepaul@gmail.com");
		cliente1.setTelefone("95530-3615");
		
		
		var cliente2 =new Cliente();
		cliente2.setId(2L);
		cliente2.setNome("Luanda Oliveira");
		cliente2.setEmail("luanda230282@gmail.com");
		cliente2.setTelefone("97127-5114");
		
		return Arrays.asList(cliente1, cliente2);
	}

}