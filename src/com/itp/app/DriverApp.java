package com.itp.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itp.model.Engine;

public class DriverApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/application-context.xml");
		Engine engine1=beanFactory.getBean("e1",Engine.class);
		System.out.println(engine1);
		
		Engine engine2=beanFactory.getBean("e2",Engine.class);
		System.out.println(engine2);

	}

}
