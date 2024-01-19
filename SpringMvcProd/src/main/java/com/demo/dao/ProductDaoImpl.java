package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Product;

@Repository
public class ProductDaoImpl implements Productdao{
	@Autowired
	JdbcTemplate jt;

	@Override
	public List<Product> getallproducts() {
		return jt.query("select * from products",(rs,num)->{
			Product p =new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4));
			return p;
		});
	}
	
	
}
