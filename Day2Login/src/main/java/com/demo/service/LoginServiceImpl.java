package com.demo.service;

import com.demo.beans.MyUser;
import com.demo.dao.LoginDao;
import com.demo.dao.LoginDaoImpl;

public class LoginServiceImpl implements LoginService {
	LoginDao ldao=new LoginDaoImpl();
	

	@Override
	public MyUser validateUser(String uname, String pass) {
		return ldao.finduser(uname,pass);
	}

	@Override
	public boolean registeruser(String uname, String pass, String nm) {
		return ldao.addnewUser(uname,pass,nm);
	}
}
