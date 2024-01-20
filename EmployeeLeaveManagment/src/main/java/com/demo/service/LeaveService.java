package com.demo.service;

import java.util.List;

import com.demo.model.Leave;

public interface LeaveService {

	List<Leave> getAllleave();

	void addnewLeave(Leave l);

}
