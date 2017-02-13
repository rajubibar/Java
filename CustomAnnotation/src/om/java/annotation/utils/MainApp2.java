package om.java.annotation.utils;

import java.util.TreeMap;

public class MainApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car = new Car();
		

		Car suv = (Car) car.clone();
		
		
		car.speed=100;
		
		//System.out.println();
		suv.speed();
		car.speed();
		
		
		
		//TreeMap s = new TreeMap();
	}

}
