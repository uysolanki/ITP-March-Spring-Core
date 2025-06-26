package com.itp.model;

public class Customer {

		private int custId;
		private String custName;
		private String custAge;
		
		public Customer() {
			System.out.println("No Args Constructor of Customer class");
		}
		public Customer(int custId, String custName, String custAge) {
			this.custId = custId;
			this.custName = custName;
			this.custAge = custAge;
		}
		public int getCustId() {
			return custId;
		}
		public void setCustId(int custId) {
			this.custId = custId;
		}
		public String getCustName() {
			return custName;
		}
		public void setCustName(String custName) {
			this.custName = custName;
		}
		public String getCustAge() {
			return custAge;
		}
		public void setCustAge(String custAge) {
			this.custAge = custAge;
		}
		@Override
		public String toString() {
			return "Customer [custId=" + custId + ", custName=" + custName + ", custAge=" + custAge + "]";
		}
		
		
}
