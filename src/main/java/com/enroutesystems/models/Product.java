package com.enroutesystems.models;

public class Product {
	private int code;
	private String name;
	private int price;
	private int amount;
	
	public Product(int code, String name, int price, int amount) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	
	
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
}
