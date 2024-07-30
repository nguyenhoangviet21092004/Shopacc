package com.example.shopacc.dto;

import com.example.shopacc.model.Cart;

public class CartDto {
    private int id ;
    private int idProduct;
    private int idAccount;

    public CartDto() {
    }

    public Cart toCart(){
        Cart cart = new Cart();
        cart.setId(id);
        return cart;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(int idAccount) {
        this.idAccount = idAccount;
    }
}
