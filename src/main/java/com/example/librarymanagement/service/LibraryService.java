package com.example.librarymanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.librarymanagement.model.Library;
import com.example.librarymanagement.repository.LibraryRepository;

@Service
public class LibraryService {

	@Autowired  
	LibraryRepository libraryRepository;  
	
	public List<Library> getAll() {
		return libraryRepository.findAll();
	}

	public Library addBook(Library library) {
		return libraryRepository.save(library);
	}

	public List<Library> findAuthor(String author) {
		return libraryRepository.findByAuthor(author);
	}

	public List<Library> findBookName(String book) {
		return libraryRepository.findByBook(book);
	}

	public List<Library> findPublisher(String publisher) {
		return libraryRepository.findByPublisher(publisher);
	}

	public List<Library> findBookCategory(String category) {
		return libraryRepository.findByBookCategory(category);
	}

	public void deleteRecord(int pk) {
		 libraryRepository.deleteById(pk);
	}

	public Library updateRecord(Library library) {
		return libraryRepository.save(library);
	}


}
