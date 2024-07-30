package com.example.shopacc.repository;

import com.example.shopacc.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepoCart extends JpaRepository<Cart,Integer> {
}
