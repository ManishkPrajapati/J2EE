package com.demo.dao;

import com.demo.beans.MyUser;

public interface LoginDao {

	MyUser finduser(String uname, String pass);

	boolean addnewUser(String uname, String pass, String nm);

}
