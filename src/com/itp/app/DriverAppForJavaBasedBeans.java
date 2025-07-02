package com.itp.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.itp.config.MyAppConfig;
import com.itp.model.Car;
import com.itp.model.Engine;
import com.itp.model.Gear;

public class DriverAppForJavaBasedBeans {

	public static void main(String[] args) {
		ApplicationContext beanFactory = new AnnotationConfigApplicationContext(MyAppConfig.class);
		Engine engine1=beanFactory.getBean("engy1",Engine.class);
		System.out.println(engine1);
		
		Gear gear1=beanFactory.getBean("gear1",Gear.class);
		System.out.println(gear1);
		
		Car car1=beanFactory.getBean("car1",Car.class);
		System.out.println(car1);
		

		
	}
}
