package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.LeaveDao;
import com.demo.model.Leave;

@Service
public class LeaveServiceImpl implements LeaveService{
	@Autowired
	private LeaveDao ldao;

	@Override
	public List<Leave> getAllleave() {
		return ldao.getAllLeave();
	}

	@Override
	public void addnewLeave(Leave l) {
		ldao.addLeave(l);
		
	}
	
	
}
