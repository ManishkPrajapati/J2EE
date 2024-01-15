package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.MyUser;

@Repository
public class LoginDaoImpl implements LoginDao{
	@Autowired
	private JdbcTemplate jt;

	public MyUser checkUser(String unm, String pass) {
		try {
			String str="select username,password,Role from user where username=? and password=?";
			return jt.queryForObject(str, new Object[] {unm,pass},BeanPropertyRowMapper.newInstance(MyUser.class));
		} catch(EmptyResultDataAccessException e) {
			System.out.println("not found"+e.getMessage());
			return null;
		}
	}
}
