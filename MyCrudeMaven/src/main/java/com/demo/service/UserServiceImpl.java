package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.dao.UserDao;
import com.demo.dao.UserDaoImpl;
import com.demo.models.Address;
import com.demo.models.MyUser;

public class UserServiceImpl implements UserService {
	private UserDao udao;
	public UserServiceImpl() {
		udao = new UserDaoImpl();
	}
	@Override
	public void addnewUser() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr user id");
		int uid=sc.nextInt();
		System.out.println("enetr user name");
		String uname=sc.next();
		System.out.println("enetr address id");
		int aid=sc.nextInt();
		System.out.println("enetr street");
		String street=sc.next();
		System.out.println("enetr city");
		String city=sc.next();
		MyUser u=new MyUser(uid,uname,new Address(aid,street,city));
		udao.save(u);
		sc.close();
	}
	@Override
	public List<MyUser> getAllUsers() {
		return udao.findAll();
	}
	@Override
	public MyUser getById(int uid) {
		
		return udao.findbyid(uid);
	}
	@Override
	public boolean removeById(int uid) {
		return udao.deleteById(uid);
	}
	@Override
	public boolean modifyById(int uid, String unm, String street) {
		return udao.updateByid(uid,unm,street);
		
	}
	@Override
	public List<MyUser> sortById() {
		// TODO Auto-generated method stub
		return udao.getSorted();
	}
	@Override
	public void closeMySessionFactory() {
		udao.closeMySessionFactory();
		
	}
}
