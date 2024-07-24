package com.example.shopacc.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private String password;
    private String role;
}
