package com.app.todo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "tasks")
public class Task {
    @Id                                                 //ID
    @GeneratedValue(strategy = GenerationType.AUTO)     //has to autogenerate the id
    private Long id;
    private String title;
    private boolean completed;
}
