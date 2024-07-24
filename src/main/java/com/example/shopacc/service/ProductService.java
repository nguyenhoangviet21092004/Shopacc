package com.example.shopacc.service;

import com.example.shopacc.model.Product;
import com.example.shopacc.repository.IRepoProduct;
import com.example.shopacc.service.ipl.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService implements IProductService {

    @Autowired
    private IRepoProduct iRepoProduct;

    @Override
    public Page<Product> findAll(Pageable pageable) {
        return iRepoProduct.findAll(pageable);
    }

    @Override
    public Optional<Product> findById(int id) {
       return iRepoProduct.findById(id);
    }

    @Override
    public void save(Product product) {
        iRepoProduct.save(product);
    }

    @Override
    public void delete(int id) {
        iRepoProduct.deleteById(id);
    }
}
