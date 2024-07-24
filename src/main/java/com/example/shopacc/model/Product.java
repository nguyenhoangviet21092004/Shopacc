package com.example.shopacc.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    private String nameGame;
    private double price;
    private String description;
    private String detail;
    private String userName;
    private String password;
    private String image;
    private String general;
    private String ranks;
    private String skin;
    private String status;



}
