package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.Productdao;
import com.demo.model.Product;

@Service
public class ProductServicempl implements ProductService{
	
	@Autowired
	Productdao pdao;

	@Override
	public List<Product> getallProd() {
		return pdao.getallproducts();
	}
	
	
}
