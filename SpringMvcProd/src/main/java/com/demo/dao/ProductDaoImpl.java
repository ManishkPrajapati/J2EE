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

	@Override
	public void addProd(Product p) {
		String str="insert into products values(?,?,?,?)";
		jt.update(str,new Object[] {p.getPid(),p.getName(),p.getPrice(),p.getImage()});
		
	}

	@Override
	public Product getbyid(int pid) {
		Product p = jt.queryForObject("select * from products where pid=?",new Object[] {pid},
				(rs,num)->{
					Product r = new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4));
					return r;
				});
		return p;		
	}

	@Override
	public void modifybyId(Product p) {
		jt.update("update products set name=?,price=?,image=? where pid=?", new Object[] {p.getName(),p.getPrice(),p.getImage(),p.getPid()});
		
	}

	@Override
	public void removeByID(int pid) {
		jt.update("delete from products where pid=?", new Object[] {pid});
	}
	
	
}
