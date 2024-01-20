package com.demo.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Leave;
import com.demo.service.LeaveService;


@Controller
@RequestMapping("/")
public class LeaveController {
	
	@Autowired
	private LeaveService pservice;
	
	@GetMapping("/")
	public String Home() {
		return "Home";
	}
	@GetMapping("/Home")
	public String HomePage() {
		return "Home";
	}
	
	@GetMapping("/displayLeave")
	public ModelAndView getProducts() {
			List<Leave> llist=pservice.getAllleave();
			return new ModelAndView("displayLeave","llist",llist);
	}
	
	@GetMapping("/applyleave")
	public String Applyleave() {
		return "applyleave";
	}
	
	@PostMapping("/applyleave")
	public ModelAndView insertProduct( @RequestParam String leaveid,@RequestParam String start,@RequestParam String end,@RequestParam String leaveType,@RequestParam String LeaveReason) {
		
		Leave l=new Leave(leaveid,start, end, leaveType,LeaveReason);
		pservice.addnewLeave(l);
		return new ModelAndView("redirect:/displayLeave");
	}
	
	
}
