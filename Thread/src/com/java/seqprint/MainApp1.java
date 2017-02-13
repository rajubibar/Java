package com.java.seqprint;

import java.util.concurrent.atomic.AtomicInteger;

public class MainApp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object monitor = new Object();
		AtomicInteger number = new AtomicInteger(1);
		
		Thread th1= new Thread(new PrintingSequence(0, 3, monitor, number));
		Thread th2= new Thread(new PrintingSequence(1, 3, monitor, number));
		Thread th3= new Thread(new PrintingSequence(2, 3, monitor, number));
		th1.start();
		th2.start();
		th3.start();
		
		while(th3.isAlive()){
			
		}
		System.out.println("All thread finished therir job");
	}

}
