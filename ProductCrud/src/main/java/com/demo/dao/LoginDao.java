package com.demo.dao;

import com.demo.beans.MyUser;

public interface LoginDao {

	MyUser findUSer(String uname, String pass);

	boolean addnewuser(String uname, String pass, String name);

	

}
