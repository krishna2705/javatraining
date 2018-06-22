package com.asahi.shop;

public class Product {
	private String productId;
    private String productName;
    private String productDesc;
	private String productSize;
	private String productImage;
	private int productQty;
	private double amount;
	private static int DEFAULT_QTY = 1; 
	
	
	public Product(){}
	
	public Product(String pid, String pname, String pdesc, String psize, String pimage, double price) {
		this.productId = pid;
		this.productName = pname;
		this.productDesc = pdesc;
		this.productSize = psize;
		this.productImage = pimage;
		this.productQty = DEFAULT_QTY;
		this.amount = price;
	}
	
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getProductSize() {
		return productSize;
	}
	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}
	public int getProductQty() {
		return productQty;
	}
	public void setProductQty(int productModel) {
		this.productQty = productModel;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
