package com.xworkz.collectionapp.sanitizer;

import java.io.Serializable;

public class SanitizerDTO implements Serializable{

	private int id;
	private int price;
	private String brand;
	private String color;
	
	public SanitizerDTO() {
		
	}
	
	public SanitizerDTO(int id, int price, String brand, String color) {
		super();
		this.id = id;
		this.price = price;
		this.brand = brand;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
