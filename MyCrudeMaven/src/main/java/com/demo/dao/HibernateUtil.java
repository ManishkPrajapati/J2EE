package com.demo.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	static SessionFactory sf;
	static SessionFactory getMySession() {
		if(sf == null) {
			sf = new Configuration().configure().buildSessionFactory();
		}
		return sf;
	}
	
	static void closeMySession() {
		if(sf!=null) {
			sf.close();
		}
	}
}
