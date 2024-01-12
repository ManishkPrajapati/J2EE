package com.demo.dao;

import java.util.List;

import com.demo.models.MyUser;

public interface UserDao {

	void save(MyUser u);

	List<MyUser> findAll();

	MyUser findbyid(int uid);

	boolean deleteById(int uid);

	boolean updateByid(int uid, String unm, String street);

	List<MyUser> getSorted();

	void closeMySessionFactory();

	
}
