package com.java.cisco.myapp.util;


 class Student implements Cloneable{
	String name;
	int rollno;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + "]";
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

public class CloneApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		
		Student std1 = new Student();
		std1.setName("Raju");
		std1.setRollno(123);
		
		Student std2= (Student)std1.clone();
		
		std2.setName("Raj");
		System.out.println("Std1 :"+std1.toString());
		System.out.println("Std2 :"+std2.toString());
		
	}

}
