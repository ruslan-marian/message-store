package com.backend.messagestore.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.backend.messagestore.entities.Message;
import com.backend.messagestore.repositories.MessageRepository;

@RestController
@RequestMapping("/message")
public class MessageController {

	@Autowired
	MessageRepository messageRepository;

	@GetMapping("/messageid:{message_id}")
	public Optional<Message> findById(@PathVariable("message_id") Long messageId) {
		return messageRepository.findById(messageId);
	}

	@GetMapping("/messageid:{message_id}/clientid:{client_id}")
	public Optional<Message> findByIdAndClientId(@PathVariable("message_id") Long messageId,
			@PathVariable("client_id") Long clientId) {
		return messageRepository.findByIdAndClientId(messageId, clientId);
	}

	@GetMapping("/clientid:{client_id}")
	public List<Message> findByClientId(@PathVariable("client_id") Long clientId) {
		return messageRepository.findByClientId(clientId);
	}

	@PostMapping("/clientid:{client_id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Message create(@RequestBody Message message) {
		return messageRepository.save(message);
	}

	@PutMapping("/messageid:{message_id}/clientid:{client_id}")
	public Message update(@RequestBody Message message, @PathVariable("message_id") Long messageId,
			@PathVariable("client_id") Long clientId) {
		return messageRepository.save(message);
	}

}
