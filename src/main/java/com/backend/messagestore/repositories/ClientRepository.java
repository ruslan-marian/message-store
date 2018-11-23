package com.backend.messagestore.repositories;

import org.springframework.data.repository.CrudRepository;

import com.backend.messagestore.entities.Client;

public interface ClientRepository extends CrudRepository<Client, Long> {

}
