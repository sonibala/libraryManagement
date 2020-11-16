package com.example.librarymanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="user")
public class User {

	@Id
	private int pk;
	
	@Column(name="user_type")
	private String userType;
}
