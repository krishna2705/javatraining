package com.asahi.shop;

import java.util.*;

public class Order implements IOrder {

	public String uname;
	public Map map;
	
	public Order(){}
	public Order(User user){
		this.uname= user.getFirstName() + " " + user.getLastName();
		map = new HashMap();
	}//Order

	public boolean addProductToCart(Product p){
		
		//For update the product price based on Qty in Cart page
//		if(map.containsKey(p.getProductId())){
//			Product p1 = (Product) map.get(p.getProductId());
//			p1.setAmount((double) p1.getProductQty() * p1.getAmount());
//			p1.setProductQty(p1.getProductQty()+p.getProductQty());
//			return true;
//		}
		
		//Add the product price based on Qty in Cart page
		p.setAmount( p.getProductQty() * p.getAmount());
		map.put(p.getProductId(), p );
		return false;
	}//addProduct

	public boolean addQtyToProduct(String pid, int pQty) {
		if(map.containsKey(pid)){
			Product p1 = (Product) map.get(pid);
			int qty = ( p1.getProductQty() == 1 ) ? pQty : p1.getProductQty() + pQty ;
			p1.setProductQty(qty);
			p1.setAmount( p1.getProductQty() * p1.getDefaultAmt());
		}
		return true;
	}
	
	public boolean removeProductFromCart(String pid)
    throws ProductNotFoundException {
		if(map.containsKey(pid)){
			map.remove(pid);
			return true;
		}else throw new ProductNotFoundException(
      "Product with ID "+pid+" is not Found.");
	}

	public Collection getCartDetails(){
		return map.values();
		//[objetc1,objetc2,]
	}

	public Product getProductFromCart(String pid)
    throws ProductNotFoundException {
		if(map.containsKey(pid)){
			return (Product) map.get(pid);
		}else {
			throw new ProductNotFoundException(
        "Product with ID "+pid+" is not Found.");
		}
	}

	public int productCount(){
		return map.size();
	}

	public double getCartPrice() {
	    
		double price = 0.0d;  
		
	    for(Object obj: getCartDetails()){
			Product p = (Product) obj;
			price+= p.getAmount();
		}
	    return price;
	}
	
	public void getAllProductDetails() {
		
		for(Object obj: getCartDetails()){
			Product p = (Product) obj;
			System.out.println ("\n Product Id : "+ p.getProductId());
			System.out.println ("\n Product Name : "+ p.getProductName());
			System.out.println ("\n Product Desc : "+ p.getProductDesc());
			System.out.println ("\n Size : "+ p.getProductSize());
			System.out.println ("\n Image : "+ p.getProductImage());
			System.out.println ("\n Qty : "+ p.getProductQty());
			System.out.println ("\n Amount : "+ p.getAmount());
			System.out.println ("\n\n");
		}
	    
	}
}
