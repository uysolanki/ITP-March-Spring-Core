package com.itp.app;

import java.beans.Customizer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itp.model.Car;
import com.itp.model.Customer;
import com.itp.model.Engine;

public class DriverAppForBeanScope {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/application-context.xml");
		
		System.out.println("Hi");
		
		Customer customer1=beanFactory.getBean("cust1",Customer.class);
		System.out.println(customer1);
		Customer customer2=beanFactory.getBean("cust1",Customer.class);
		System.out.println(customer2);
		
		System.out.println(customer1==customer2);  //true
		
	}
}
//singleton scope
//No Args
//Hi
//18 Virat 35
//18 Virat 35
//true

//protoype
//Hi
//No Args Constructor of Customer class
//Customer [custId=18, custName=Virat, custAge=35]
//No Args Constructor of Customer class
//Customer [custId=18, custName=Virat, custAge=35]
//false
