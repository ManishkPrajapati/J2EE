package com.demo.dao;

import java.util.List;

import com.demo.model.Product;

public interface Productdao {

	List<Product> getallproducts();

	void addProd(Product p);

	Product getbyid(int pid);

	void modifybyId(Product product);

	void removeByID(int pid);

}
