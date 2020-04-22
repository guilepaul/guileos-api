package com.guiledev.guileos.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.guiledev.guileos.domain.model.Cliente;
import com.guiledev.guileos.domain.repository.ClienteRepository;

@RestController
public class ClienteController {
	
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping("/clientes")
	public List<Cliente> listar() {
		return clienteRepository.findAll();
	}

}
