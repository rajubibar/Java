package com.java.seqprint;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer = new Printer();
		
		PrintingNumber pn = new PrintingNumber(printer);
		
		new Thread(pn,"First").start();
		new Thread(pn,"Second").start();
		new Thread(pn,"Third").start();
	}

}
