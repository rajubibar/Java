package com.java.print;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberPrinter np = new NumberPrinter();
		
		EvennumberGenerator eg = new EvennumberGenerator(np, 20);
		OddnumberPrinter op = new OddnumberPrinter(np, 20);
		
		new Thread(eg,"Even").start();
		new Thread(op,"odd").start();
		
	}

}
