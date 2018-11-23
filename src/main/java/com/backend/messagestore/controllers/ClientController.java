package com.backend.messagestore.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.config.EnableHypermediaSupport;
import org.springframework.hateoas.config.EnableHypermediaSupport.HypermediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.messagestore.entities.Client;
import com.backend.messagestore.repositories.ClientRepository;

@RestController
@RequestMapping("/client")
@EnableHypermediaSupport(type = HypermediaType.HAL)
public class ClientController {

	@Autowired
	ClientRepository clientRepository;

	@GetMapping("/{client_id}")
	public Optional<Client> findById(@PathVariable("client_id") Long clientId) {
		return clientRepository.findById(clientId);
	}

}
