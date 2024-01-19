package com.demo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/addprod")
	public String displayaddform(HttpSession session) {
		MyUser u=(MyUser) session.getAttribute("user");
		if(u!=null) 
		   return "addprod";
		return "redirect:/login/";
	}
	
	@PostMapping("/insertprod")
	public ModelAndView insertProduct(@RequestParam int pid,@RequestParam String pname,@RequestParam int price,@RequestParam String image) {
		Product p=new Product(pid,pname,price,image);
		pserv.addnewProduct(p);
		return new ModelAndView("redirect:/products");
		
	}
	
	@GetMapping("/editprod/{pid}")
	public ModelAndView editProduct(@PathVariable int pid) {
		Product p =pserv.getById(pid);
		return new ModelAndView("updateprod","p",p);
	}
	
	
	@PostMapping("/update")
	public ModelAndView updateProduct(@RequestParam int pid,@RequestParam String pname,@RequestParam int price,@RequestParam String image) {
		pserv.updatebyID(new Product(pid,pname,price,image));
		return new ModelAndView("redirect:/products");
	}
	
	@GetMapping("/deleteprod/{pid}")
	public ModelAndView deleteProduct(@PathVariable int pid) {
		pserv.deleteByID(pid);
		return new ModelAndView("redirect:/products");
	}
}
