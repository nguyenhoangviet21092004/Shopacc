package com.example.shopacc.service.ipl;

import com.example.shopacc.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IProductService {
    Page<Product> findAll(Pageable pageable);

    Optional<Product> findById(int id);

    void save(Product product);

    void delete(int id);
}
