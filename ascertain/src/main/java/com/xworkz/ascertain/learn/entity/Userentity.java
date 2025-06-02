package com.xworkz.ascertain.learn.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "User_Table")
public class Userentity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "email")
    private String email;



}
