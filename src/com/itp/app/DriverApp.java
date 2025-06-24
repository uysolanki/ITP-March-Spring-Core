package com.itp.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itp.model.Car;
import com.itp.model.Engine;

public class DriverApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/application-context.xml");
		Car car1=beanFactory.getBean("c1",Car.class);
		System.out.println(car1);
		
		Car car2=beanFactory.getBean("c2",Car.class);
		System.out.println(car2);
	}
}
