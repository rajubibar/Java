package com.java.print;

import java.util.concurrent.atomic.AtomicInteger;

public class MainApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object obj = new Object();
		AtomicInteger number = new AtomicInteger();
		
		Thread th1 = new Thread(new EvenOddPrint(1, obj, number));
		Thread th2 = new Thread(new EvenOddPrint(2, obj, number));
		
		th1.start();
		th2.start();
		
	}

}
