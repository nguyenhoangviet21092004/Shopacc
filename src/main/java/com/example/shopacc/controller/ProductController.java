package com.example.shopacc.controller;

import com.example.shopacc.model.Product;
import com.example.shopacc.repository.IRepoProduct;
import com.example.shopacc.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController("apiProductController")
@RequestMapping("/api/shopacc")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("")
    public ResponseEntity<Page<Product>> getAllProducts(Pageable pageable) {
        System.out.println();
          Page<Product> page =   productService.findAll(pageable);
          if (page.isEmpty()){
              return new ResponseEntity<>(HttpStatus.NO_CONTENT);
          }
        return new ResponseEntity<>(page,HttpStatus.OK);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {
       Optional<Product> product = productService.findById(id);
       if (product.isEmpty()){
           return new ResponseEntity<>( HttpStatus.NOT_FOUND);
       }
        return new ResponseEntity<>(product.get(),HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        productService.save(product);
        return new ResponseEntity<>(product, HttpStatus.CREATED);
    }


//    @DeleteMapping("/{id}")
//    public ResponseEntity<Product> deleteProduct(@RequestBody Product product) {
//        productService.delete(product.getId());
//        return new ResponseEntity<>(product, HttpStatus.OK);
//    }
}
