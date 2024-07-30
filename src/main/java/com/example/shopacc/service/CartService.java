package com.example.shopacc.service;

import com.example.shopacc.dto.CartDto;
import com.example.shopacc.model.Cart;
import com.example.shopacc.repository.IRepoAccount;
import com.example.shopacc.repository.IRepoCart;
import com.example.shopacc.repository.IRepoProduct;
import com.example.shopacc.service.ipl.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CartService implements ICartService {
    @Autowired
    private IRepoCart iRepoCart;
    @Autowired
    private IRepoProduct iRepoProduct;
    @Autowired
    private IRepoAccount iRepoAccount;

    @Override
    public Page<Cart> findAll(Pageable pageable) {
        return iRepoCart.findAll(pageable);
    }

    @Override
    public Optional<Cart> findById(int id) {
        return iRepoCart.findById(id);
    }

    @Override
    public Cart save(CartDto cartDto) {
        Cart cart = cartDto.toCart();
        cart.setProduct(iRepoProduct.findById(cartDto.getIdProduct()).get());
        cart.setAccount(iRepoAccount.findById(cartDto.getIdAccount()).get());
        iRepoCart.save(cart);
        return cart;
    }

    @Override
    public void delete(int id) {

    }
}
