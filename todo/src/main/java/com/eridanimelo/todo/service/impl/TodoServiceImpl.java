package com.eridanimelo.todo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eridanimelo.todo.entity.Todo;
import com.eridanimelo.todo.repository.TodoRepository;
import com.eridanimelo.todo.service.TodoService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class TodoServiceImpl implements TodoService {

    private final TodoRepository repository;

    @Override
    public List<Todo> getAll() {
        return repository.findAll();
    }

    @Override
    public Todo getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Todo create(Todo todo) {
        return repository.save(todo);
    }

    @Override
    public Todo update(String id, Todo todo) {
        todo.setId(id);
        return repository.save(todo);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

}
