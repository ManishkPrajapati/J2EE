package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.LoginDao;
import com.demo.model.MyUser;

@Service
public class LoginServiceImpl implements LoginService{
	@Autowired
	LoginDao ldao;

	@Override
	public MyUser validate(String uname, String pass) {
		return ldao.validate(uname,pass);
	}
	
	
	
	
}
