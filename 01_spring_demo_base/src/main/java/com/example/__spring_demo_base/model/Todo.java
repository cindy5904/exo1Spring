package com.example.__spring_demo_base.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@AllArgsConstructor
@Data
@Getter
@Setter
public class Todo {
    private Long id;
    private String name;
    private String description;
    private boolean isDone;

    public Todo() {
    }
}
