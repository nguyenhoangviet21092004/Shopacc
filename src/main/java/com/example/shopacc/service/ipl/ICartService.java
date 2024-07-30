package com.example.shopacc.service.ipl;

import com.example.shopacc.dto.CartDto;
import com.example.shopacc.model.Cart;
import com.example.shopacc.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface ICartService {
    Page<Cart> findAll(Pageable pageable);

    Optional<Cart> findById(int id);

    Cart save(CartDto cartDto);

    void delete(int id);
}
