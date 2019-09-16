package com.hqyj.collection;

public class Book {
	private String name;
	private String bid;
	private double price;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String name, String bid, double price) {
		super();
		this.name = name;
		this.bid = bid;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
//	@Override
//	public String toString() {
//		return "Book [name=" + name + ", bid=" + bid + ", price=" + price + "]";
//	}
	
	
	
	

}
