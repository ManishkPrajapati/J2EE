package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService {

	List<Product> getallProd();

	void addnewProduct(Product p);

	Product getById(int pid);

	void updatebyID(Product product);

	void deleteByID(int pid);

}
