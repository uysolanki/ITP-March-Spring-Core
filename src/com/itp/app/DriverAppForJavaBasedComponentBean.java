package com.itp.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.itp.config.MyAppConfig;
import com.itp.model.Engine;
import com.itp.model.Supplier;

public class DriverAppForJavaBasedComponentBean {

	public static void main(String[] args) {
		ApplicationContext beanFactory = new AnnotationConfigApplicationContext(MyAppConfig.class);
		
		Supplier supplier1=beanFactory.getBean(Supplier.class);
		System.out.println(supplier1);
		
	}
}
