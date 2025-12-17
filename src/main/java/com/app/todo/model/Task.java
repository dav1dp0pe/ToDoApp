package com.app.todo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Task {
    @Id                                                 //ID
    @GeneratedValue(strategy = GenerationType.AUTO)     //has to autogenerate the id
    private Long id;
    private String title;
    private boolean completed;

}
