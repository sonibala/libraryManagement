package com.example.librarymanagement.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.librarymanagement.model.Library;
import com.example.librarymanagement.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	User findByUserType(String name);

}
