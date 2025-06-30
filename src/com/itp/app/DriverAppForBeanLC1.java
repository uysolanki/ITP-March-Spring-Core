package com.itp.app;

import java.beans.Customizer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itp.model.Car;
import com.itp.model.Customer;
import com.itp.model.Engine;
import com.itp.model.Player;

public class DriverAppForBeanLC1 {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/application-context.xml");
		System.out.println("Hiiii");
		Player player1=beanFactory.getBean("p1",Player.class);
		System.out.println(player1);
		player1=null;
		beanFactory.close();
		Runtime.getRuntime().gc();
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
