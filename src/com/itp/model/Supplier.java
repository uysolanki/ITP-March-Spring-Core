package com.itp.model;

import org.springframework.stereotype.Component;

@Component
public class Supplier {
	
	private int supplierNo;
	private String supplierName;
	private boolean isPrimeSupplier;
	
	
	public Supplier()  //No Args
	{
		this.supplierNo = 101;
		this.supplierName ="Classic Supplier";
		this.isPrimeSupplier = true;
	}


	@Override
	public String toString() {
		return "Supplier [supplierNo=" + supplierNo + ", supplierName=" + supplierName + ", isPrimeSupplier="
				+ isPrimeSupplier + "]";
	}
	
	

}
