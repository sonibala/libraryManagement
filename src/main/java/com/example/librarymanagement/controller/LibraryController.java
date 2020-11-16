package com.example.librarymanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.librarymanagement.model.Library;
import com.example.librarymanagement.repository.LibraryRepository;
import com.example.librarymanagement.service.LibraryService;

import java.util.List; 

@RestController
public class LibraryController {

	@Autowired
	private LibraryService libraryService;
	
	
	@GetMapping(path="/books")
	public List<Library> getAll() {
      return libraryService.getAll();
	}
	
	@PostMapping("/add")
	public Library addBook(@RequestBody Library library) {
		return libraryService.addBook(library);				
	}
	
	@GetMapping(path="/findAuthor")
	public List<Library> findAuthor(@RequestParam String author) {
      return libraryService.findAuthor(author);
	}
	
	@GetMapping(path="/findBookName")
	public List<Library> findBookName(@RequestParam String book) {
      return libraryService.findBookName(book);
	}
	
	@GetMapping(path="/findPublisher")
	public List<Library> findPublisher(@RequestParam String publisher) {
      return libraryService.findPublisher(publisher);
	}
	
	@GetMapping(path="/findBookCategory")
	public List<Library> findBookCategory(@RequestParam String category) {
      return libraryService.findBookCategory(category);
	}
	
	@DeleteMapping(path="/delete/{id}")
	public void deleteRecord(@PathVariable(value = "id") int pk) {
       libraryService.deleteRecord(pk);
	}
	
	@PutMapping(path="/update")
	public Library updateRecord(@RequestBody Library library) {
       return libraryService.updateRecord(library);
	}
	
}
