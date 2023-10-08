package com.demo.hello;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private TodoService todoService;

    // Get all users
    @GetMapping("/get")
    public List<Todo> getAllTodo() {
        return todoService.getAllTodos();
    }

    // Get user by ID
    @GetMapping("/get/{id}")
    public Optional<Todo> getTodoById(@PathVariable Long id) {
        return todoService.getTodoById(id);
    }

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/json")
    public Map<String, Object> get() {
        Map<String, Object> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("results", 123);
        return map;
    }
}
