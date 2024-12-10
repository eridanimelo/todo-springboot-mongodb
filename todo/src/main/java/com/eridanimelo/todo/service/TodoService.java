package com.eridanimelo.todo.service;

import java.util.List;

import com.eridanimelo.todo.entity.Todo;

public interface TodoService {

    List<Todo> getAll();

    Todo getById(String id);

    Todo create(Todo todo);

    Todo update(String id, Todo todo);

    void deleteById(String id);

}
