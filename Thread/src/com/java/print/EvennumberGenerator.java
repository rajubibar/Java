package com.java.print;

public class EvennumberGenerator implements Runnable{

	private NumberPrinter printer;
	private int max;
	public EvennumberGenerator(NumberPrinter printer,int max){
		this.printer = printer;
		this.max = max;
	}
	
	public void run(){
		
		for(int i=2;i<=max;i=i+2){
			try{
				printer.evenPrint(i);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}
}
