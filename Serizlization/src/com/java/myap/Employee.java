package com.java.myap;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Employee extends Person  implements Externalizable{

	private String department;
	private String address;
	private int empid;
	
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		
		//own fileds
		out.writeObject(department);
		out.writeInt(empid);
		
		//parents field
		out.writeObject(name);
		out.writeObject(nationality);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		// TODO Auto-generated method stub
		
		//own fields
		empid= in.readInt();
		department = (String)in.readObject();
		
		//parents field
		name = (String)in.readObject();
		nationality = (String) in.readObject();
		
		
	}
	
	
}
