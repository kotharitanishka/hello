package com.demo.hello;
import jakarta.persistence.*;

@Entity
@Table(name = "tasks")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String created_at;
    private String due_date;
    private Boolean completed;

    // Constructors, Getters, and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

     public String getDesc() {
        return description;
    }

    public void setDesc(String d) {
        this.description = d;
    }
     public String getCreated() {
        return created_at;
    }

    public void setCreated(String c) {
        this.created_at = c;
    }
     public String getDue() {
        return due_date;
    }

    public void setDue(String due) {
        this.due_date = due;
    }
     public Boolean getComp() {
        return completed;
    }

    public void setComp(Boolean cmp) {
        this.completed = cmp;
    }

}