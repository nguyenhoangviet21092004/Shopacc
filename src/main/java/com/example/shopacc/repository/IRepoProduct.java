package com.example.shopacc.repository;

import com.example.shopacc.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepoProduct extends JpaRepository<Product,Integer> {
}
