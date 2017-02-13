package com.java.cisco.myapp.designpattern;

public class MainApp {

	public static void main(String args[]){
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1= shapeFactory.getShape("RECTANGLE");
		shape1.draw();
	}
}
