package com.backend.messagestore.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.backend.messagestore.entities.Message;

public interface MessageRepository extends CrudRepository<Message, Long> {

	Optional<Message> findByIdAndClientId(Long messageId, Long clientId);

	List<Message> findByClientId(Long clientId);

}
