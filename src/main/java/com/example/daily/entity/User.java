package com.example.daily.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Table(name = "user")
@Entity
public class User {

    @Id
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private int age;
    @Column(name="birthday")
    private Date birthday;
}