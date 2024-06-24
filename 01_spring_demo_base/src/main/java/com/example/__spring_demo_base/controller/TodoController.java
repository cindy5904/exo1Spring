package com.example.__spring_demo_base.controller;

import com.example.__spring_demo_base.model.Todo;
import com.example.__spring_demo_base.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TodoController {

    private TodoService todoService;


    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Page Home");
        return "home";
    }


    @RequestMapping("/todos")
    @ResponseBody
    public List<Todo> getAllTodo(){
        return todoService.getAllTodos();
    }

    @RequestMapping("/todos/{id}")
    public String getOneTodo(@PathVariable Integer id, Model model){
        Todo todo = todoService.getOneTodo(id);
        model.addAttribute("todo", todo);
        return "todo";
    }




}
