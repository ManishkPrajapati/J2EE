package com.demo.dao;

import java.util.List;

import com.demo.model.Leave;

public interface LeaveDao {

	List<Leave> getAllLeave();

	void addLeave(Leave l);

}
