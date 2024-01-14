package com.demo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.model.MyGame;
import com.demo.model.MyGunGame;

public class TestAspects {
	public static void main(String[] args) {
		ApplicationContext ct = new ClassPathXmlApplicationContext("springconfig.xml");
		MyGame g1 = (MyGame)ct.getBean("myGame");
		g1.m1();
		MyGunGame gg1 = (MyGunGame)ct.getBean("myGunGame");
		gg1.m11(10);
		gg1.game1();
	}
}
