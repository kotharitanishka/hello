package com.demo.hello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    @Autowired
    private TodoRepository todoRepository;

    // Create a new todo
    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    // Get all users
    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    // Get todo by ID
    public Optional<Todo> getTodoById(Long id) {
        return todoRepository.findById(id);
    }

    // // Update todo
    // public Todo updateUser(Long id, Todo userDetails) {
    //     Optional<Todo> todo = todoRepository.findById(id);
    //     if (todo.isPresent()) {
    //         Todo existingUser = todo.get();
    //         existingUser.setName(userDetails.getName());
    //         existingUser.setEmail(userDetails.getEmail());
    //         return todoRepository.save(existingUser);
    //     }
    //     return null;
    // }

    // Delete all users
    public void deleteAllTodos() {
        todoRepository.deleteAll();
    }

    // Delete todo
    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }

    // Other business logic related to users
}