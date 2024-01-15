package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.LoginDao;
import com.demo.model.MyUser;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	private LoginDao ldao;

	@Override
	public MyUser validateUser(String unm, String pass) {
		return ldao.checkUser(unm,pass);
	}

}
