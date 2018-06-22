package com.asahi.shop;

import java.util.Collection;

public interface IOrder {
	boolean addProductToCart(Product p);
	boolean removeProductFromCart(String pid) throws ProductNotFoundException;
	Collection getCartDetails();
	Product getProductFromCart(String pid) throws ProductNotFoundException;
	int productCount();
    double getCartPrice();
}