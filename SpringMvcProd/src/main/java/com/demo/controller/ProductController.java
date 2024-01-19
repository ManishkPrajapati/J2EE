package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.service.ProductService;
import com.demo.model.MyUser;
import com.demo.model.Product;

@Controller
public class ProductController {
	@Autowired
	ProductService pserv;
	
	@GetMapping("/products")
	public ModelAndView getAllProducts(HttpSession ses) {
		MyUser u = (MyUser) ses.getAttribute("user");
		if(u!=null) {
			List<Product> plist = pserv.getallProd();
			return new ModelAndView("displayproducts","plist",plist);
		}
		return new ModelAndView("redirect:/login");
	}
}
