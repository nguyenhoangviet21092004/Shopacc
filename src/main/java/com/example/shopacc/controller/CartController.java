package com.example.shopacc.controller;

import com.example.shopacc.dto.CartDto;
import com.example.shopacc.model.Cart;
import com.example.shopacc.model.Product;
import com.example.shopacc.service.CartService;
import com.example.shopacc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cart")
public class CartController {

    @Autowired
    private CartService cartService;
    @Autowired
    private ProductService productService;

    @GetMapping()
    public ResponseEntity<Page<Cart>> getCart(Pageable pageable) {
        Page<Cart> page =   cartService.findAll(pageable);
        if (page.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(page,HttpStatus.OK);
    }

    @PostMapping("/{id}")
    public ResponseEntity<Cart> addProduct(@RequestBody CartDto cartDto) {

        return new ResponseEntity<>( cartService.save(cartDto),HttpStatus.OK);
    }

}
