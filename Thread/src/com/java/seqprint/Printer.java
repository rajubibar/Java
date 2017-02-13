package com.java.seqprint;

public class Printer {

	public void print(int number){
		synchronized(this){
			System.out.println(Thread.currentThread().getName() +" : "+number);
		}
	}
}
