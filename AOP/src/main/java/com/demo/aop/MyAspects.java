package com.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspects {
	
	@Before("execution(* com.demo.model.*.*(..))")
	public void deductPoints() {
		System.out.println("Points Are Deducted");
	}
	
	@After("execution(* com.demo.model.*.*(..))")
	public void AddPoint() {
		System.out.println("Points are Added");
	}
	
	@After("execution(* com.demo.model.*.*(..))")
	public void AddLegger() {
		System.out.println("Entery in Legger");
	}
	
	@Around("execution(* com.demo.model.*.m11(..))")
	public Object aroundAdvice(ProceedingJoinPoint joinpoint) {
		System.out.println("line1 before function call in around advice");
		System.out.println("line1 before function call in around advice");
		Object ob=null;
		try {
			ob=joinpoint.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("line1 after function call in around advice");
		System.out.println("line1 after function call in around advice");
		return ob;
	}
	
}
