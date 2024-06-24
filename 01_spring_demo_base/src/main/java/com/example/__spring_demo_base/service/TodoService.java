package com.example.__spring_demo_base.service;

import com.example.__spring_demo_base.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private List<Todo>  todos;

    public TodoService() {
        todos = new ArrayList<>();

        Todo todo1 = new Todo();
        todo1.setId(1L);
        todo1.setName("todo 1 ");
        todo1.setDescription("Description todo 1");
        todo1.setDone(false);

        Todo todo2 = new Todo();
        todo2.setId(2L);
        todo2.setName("Todo 2");
        todo2.setDescription("Description todo 2");
        todo2.setDone(false);

        Todo todo3 = new Todo();
        todo3.setId(3L);
        todo3.setName("Todo 3");
        todo3.setDescription("Description todo 3");
        todo3.setDone(true);

        todos.add(todo1);
        todos.add(todo2);
        todos.add(todo3);
    }

    public List<Todo> getAllTodos() {
        return todos;
    }

    public Todo getOneTodo(Long id) {
        return todos.get(1);
    }

}
