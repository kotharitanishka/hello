package com.demo.hello;

import java.util.HashMap;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    @Autowired
    private TodoService todoService;

    @PostMapping("/create")
    public Map<String , Object> createTodo(@RequestBody Todo t) {
        Map<String, Object> map = new HashMap<>();
        map.put("Status", "created successfully!");
        map.put("data", todoService.createTodo(t));
        return map;
    }

    @PutMapping("/{id}")
    public Map<String, Object> updateTodo(@PathVariable Long id, @RequestBody Todo t) {
        Map<String, Object> map = new HashMap<>();
       if (todoService.getTodoById(id).isPresent() == false) {
            map.put("Status", "failed , id not present");
        }
        else {
            map.put("Status", "updated successfully!");
            map.put("data", todoService.updateTodo(id, t));
        }
        return map;
    }


    // Get all users
    @GetMapping("/get")
    public Map<String, Object> getAllTodo(){
        Map<String, Object> map = new HashMap<>();
        map.put("Status", "working");
        map.put("data", todoService.getAllTodos() );
        return map;
    }

    // Get user by ID
    @GetMapping("/get/{id}")
    public Map<String, Object> getTodoById(@PathVariable Long id) {
        Map<String, Object> map = new HashMap<>();
        if (todoService.getTodoById(id).isPresent() == false) {
            map.put("Status", "failed , id not present");
        }
        else {
            map.put("Status", "working");
            map.put("data", todoService.getTodoById(id) );
        }
        return map;
    }

    // Delete user by ID
    @DeleteMapping("/{id}")
    public Map<String, Object> deleteTodo(@PathVariable Long id)  {
        Map<String, Object> map = new HashMap<>();
        if (todoService.getTodoById(id).isPresent() == false) {
            map.put("Status", "failed , id not present");
        }
        else {
            todoService.deleteTodo(id);
            map.put("Status", "deleted successfully");
        }
        return map;
    }

}
