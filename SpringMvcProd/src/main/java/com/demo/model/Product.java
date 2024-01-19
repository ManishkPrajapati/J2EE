package com.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Product {
	private int pid;
	private String name;
	private int price;
	private String image;
	public Product() {
		super();
	}
	public Product(int pid, String name, int price, String image) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.image = image;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + ", image=" + image + "]";
	}
	
	
	
}
