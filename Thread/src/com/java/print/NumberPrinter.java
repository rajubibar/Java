package com.java.print;

public class NumberPrinter {
	private boolean isEvenPrinted = true;
	
	public void evenPrint(int number) throws InterruptedException{
		synchronized(this){
			while(isEvenPrinted){
				wait();				
			}
			System.out.println(Thread.currentThread().getName() +" : "+number);
			isEvenPrinted = true;
			notify();
		}
	}
	
	public void oddPrint(int number) throws InterruptedException{
		synchronized(this){
			while(!isEvenPrinted){
				wait();
			}
			System.out.println(Thread.currentThread().getName() +" : "+ number);
			isEvenPrinted = false;
			notify();
		}
	}

}
