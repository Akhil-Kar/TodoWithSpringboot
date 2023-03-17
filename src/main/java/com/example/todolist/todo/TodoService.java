package com.example.todolist.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getAllTodos() {
        return (List<Todo>) todoRepository.findAll();
    }

    public Optional<Todo> getTodo(Integer id) {
        return todoRepository.findById(id);
    }

    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public Todo updateTodo(Integer id, Todo todo) {
        return todoRepository.save(todo);
    }

    public void deleteTodo(Integer id) {
//        Optional<Todo> temp = ;
        return todoRepository.delete(id);
    }
}
