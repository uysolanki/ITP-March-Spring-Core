package com.itp.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	private String carModelName;
	private String carMfgName;
	private String carColor;
	private double carPrice;
	
	@Autowired
	@Qualifier("engy1")
	private Engine engine;  //Dependency  com.itp.model.Engine
	@Autowired
	private Gear gear;      //Dependency  com.itp.model.Gear
	
	public Car() {}
	public Car(String carModelName, String carMfgName, String carColor, double carPrice, Engine engine, Gear gear) {
		this.carModelName = carModelName;
		this.carMfgName = carMfgName;
		this.carColor = carColor;
		this.carPrice = carPrice;
		this.engine = engine;
		this.gear = gear;
	}
	
	@Override
	public String toString() {
		return "Car [carModelName=" + carModelName + ", carMfgName=" + carMfgName + ", carColor=" + carColor
				+ ", carPrice=" + carPrice + ", engine=" + engine + ", gear=" + gear + "]";
	}
	public String getCarModelName() {
		return carModelName;
	}
	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}
	public String getCarMfgName() {
		return carMfgName;
	}
	public void setCarMfgName(String carMfgName) {
		this.carMfgName = carMfgName;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Gear getGear() {
		return gear;
	}
	public void setGear(Gear gear) {
		this.gear = gear;
	}
	
	
	public void startCar()
	{
		engine.startEngine();
	}

}
