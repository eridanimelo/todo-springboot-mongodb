package com.eridanimelo.todo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.eridanimelo.todo.entity.Todo;

@Repository
public interface TodoRepository extends MongoRepository<Todo, String> {

}