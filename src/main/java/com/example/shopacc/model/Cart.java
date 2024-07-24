package com.example.shopacc.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn
    private Account account;

    @ManyToOne
    @JoinColumn
    private Product product;

}
