package com.itp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.itp.model.Car;
import com.itp.model.Engine;
import com.itp.model.Gear;

@Configuration
@ComponentScan(basePackages = "com.itp.model")
public class MyAppConfig {
	
	@Bean(name = "engy1")
	public Engine EngineUsingCDI()
	{
		Engine engine=new Engine("Tesla", 15, 1500);
		return engine;
	}
	
	@Bean(name = "engy2")
	public Engine EngineUsingCDI2()
	{
		Engine engine=new Engine("Merc", 15, 1500);
		return engine;
	}

	@Bean(name = "gear1")
	public Gear gearUsingSDI()
	{
		Gear gear=new Gear();
		gear.setGearLever(10);
		gear.setGearMfgName("Tata");
		gear.setGearType("Manual");
		return gear;
	}
	
	@Bean(name = "car1")
	public Car gearCarSDI()
	{
		Car car=new Car();
		car.setCarColor("Blue");
		car.setCarMfgName("Honda");
		car.setCarModelName("Amaze");
		car.setCarPrice(300.0);
		return car;
	}

}
