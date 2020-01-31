package com.franz.components;

import java.util.ArrayList;
import java.util.List;

public class ToDo {
    private List<String> todo;

    public ToDo(List<String> todo) {
        this.todo = todo;
    }

    public void printTodo() {
        todo.forEach(t -> System.out.println(t));
    }
}
