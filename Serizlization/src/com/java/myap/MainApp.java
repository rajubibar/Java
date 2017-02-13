package com.java.myap;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainApp {

	public static void main(String args[]) throws IOException, ClassNotFoundException{
		FileOutputStream fout = new FileOutputStream("D:/a.txt");
		ObjectOutputStream oout = new ObjectOutputStream(fout);
		
		Employee emp = new Employee();
		emp.setName("Raju Bibar");
		emp.setDepartment("CSE");
		emp.setEmpid(123);
		emp.setNationality("Indian");
		oout.writeObject(emp);
		
		oout.flush();
		oout.close();
		
		
		FileInputStream fin = new FileInputStream("D:/a.txt");
		ObjectInputStream ois= new ObjectInputStream(fin);
		
		Employee emp1= (Employee)ois.readObject();
		System.out.println("Emp Name :"+ emp1.getName() +" dept "+emp1.getDepartment()+" add "+emp1.getAddress());
		System.out.println("Emp id :"+ emp1.getEmpid() +" nationality "+emp1.getNationality());
		fin.close();
		
		
	}
}
