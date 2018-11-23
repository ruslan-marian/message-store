package com.backend.messagestore.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity(name = "client")
public class Client {

	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String name;

}
