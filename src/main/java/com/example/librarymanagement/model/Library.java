package com.example.librarymanagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
@Table(name="library")
public class Library {

	@Id
	private int pk;
	
	@Column(name="book")
	private String book;
	
	@Column(name="user")
	private String user;
	
	@Column(name="author")
	private String author;
	
	@Column(name="publisher")
	private String publisher;
	
	@Column(name="book_category")
	private String bookCategory;

	
}
