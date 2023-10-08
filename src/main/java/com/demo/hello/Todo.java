package com.demo.hello;
import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "tasks")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private LocalDate due_date;
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

     public String getDue() {
        return due_date.toString();
    }

    public void setDue(String due) {
        CharSequence s = due;
        this.due_date = LocalDate.parse(s);
    }
     public Boolean getComp() {
        return completed;
    }

    public void setComp(Boolean cmp) {
        this.completed = cmp;
    }

}