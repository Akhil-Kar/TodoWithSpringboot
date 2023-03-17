package com.example.todolist.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public ResponseEntity<List<Todo>> getAllTodo() {
        return new ResponseEntity<>(todoService.getAllTodos(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Todo>> getTodo(@PathVariable Integer id) {
        return new ResponseEntity<>(todoService.getTodo(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Todo> createTodo(@RequestBody Todo todo) {
        return new ResponseEntity<>(todoService.createTodo(todo), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Todo> updateTodo(@PathVariable Integer id, @RequestBody Todo todo) {
        return new ResponseEntity<>(todoService.updateTodo(id, todo), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<void> deleteTodo(@PathVariable Integer id) {
        return new ResponseEntity<>(todoService.deleteTodo(id), HttpStatus.OK);
    }

}
