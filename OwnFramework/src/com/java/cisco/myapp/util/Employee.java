package com.java.cisco.myapp.util;

public class Employee implements Cloneable {
	private String lastName;
	private String firstName;
	private Double salary;
	public Address address;
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

	public synchronized void abc(){
		
	}
	 
	public Object clone() throws CloneNotSupportedException{
		Employee emp;
		
		emp = (Employee)super.clone();
		emp.address = (Address) address.clone();
		return emp;
	}
}
