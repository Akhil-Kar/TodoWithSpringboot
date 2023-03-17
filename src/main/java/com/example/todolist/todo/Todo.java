package com.example.todolist.todo;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Todo {

    @Id
    private Integer id;
    private String name;
    private String summary;
    private String description;

    public Todo() {
    }

    public Todo(Integer id, String name, String summary, String description) {
        this.id = id;
        this.name = name;
        this.summary = summary;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
