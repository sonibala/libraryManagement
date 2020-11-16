package com.example.librarymanagement.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.librarymanagement.model.Library;

@Repository
public interface LibraryRepository extends CrudRepository<Library, Integer>{

	List<Library> findAll();

	List<Library> findByAuthor(String author);

	List<Library> findByBook(String book);

	List<Library> findByPublisher(String publisher);

	List<Library> findByBookCategory(String category);

	void deleteByPk(int pk);

}
