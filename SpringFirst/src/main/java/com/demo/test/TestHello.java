package com.demo.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.demo.model.MyUser;

@SuppressWarnings("deprecation")
public class TestHello {
	public static void main(String[] args) {
		BeanFactory bc = new XmlBeanFactory(new ClassPathResource("springconfig.xml"));
		MyUser user1 = (MyUser)bc.getBean("u1");
		System.out.println(user1);
		MyUser user2 =(MyUser)bc.getBean("u2");
		System.out.println(user2);
	}
}
