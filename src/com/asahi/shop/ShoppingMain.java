package com.asahi.shop;

public class ShoppingMain{

	public static void main (String[] s) throws Exception {
		
		//Create customer
		User u = new User(100 ,"krishna@asahitechnologies.com","Test@123","Krishna","Moorthy", 'M', "customer");

		Order o = new Order(u);
		o.addProductToCart(new Product("p101","Monitor","Office Use","small","https://image3.mouthshut.com/images/imagesp/925004727s.jpg", 2000.0));
		o.addProductToCart(new Product("p102","CPU","Office Use","large","https://image3.mouthshut.com/images/imagesp/925933040s.jpg", 5000.0));
		o.addProductToCart(new Product("p103","Mouse & KeyBoard","Office Use","small","https://image3.mouthshut.com/images/imagesp/925933040s.jpg", 1200.0));
		o.addProductToCart(new Product("p104","Cabinet","Office Use","small","http://asahitechnologies.com/assets/images/home_story/round_img_3.png", 2000.0));
		o.addProductToCart(new Product("p105","WiFi Modam","Office Use","large","http://asahitechnologies.com/assets/images/blog/blog_2.png", 5000.0));
		o.addProductToCart(new Product("p106","Telephone","Office Use","small","http://asahitechnologies.com/assets/images/blog/blog_2.png", 1200.0));
		
		
	    o.addQtyToProduct("p101", 5);
	    o.addQtyToProduct("p101", 5);
	    o.addQtyToProduct("p101", 5);
	    o.addQtyToProduct("p101", 5);
		System.out.println("\nNo. of Product : "+o.productCount());
		System.out.println ("Order Places By: "+o.uname);

	    // code to remove product from Cart
	    // o.removeProductFromCart("p101");
	    // Get Product By its Id
	    // Product p = o.getProductFromCart("p101");
		// System.out.println("\nNo. of Product : "+o.productCount());
	    // System.out.println("\nGet Product By its Id : "+ p.getProductId());
		// System.out.println("\nGet Specific Product from Cart : "+ p.getProductName());
		System.out.println("\n\n");
		 
		//Get all product from cart
		o.getAllProductDetails();
		 	 
	    System.out.println ("\n Get Cart Total Price : "+ o.getCartPrice());
         
	}
	
}
