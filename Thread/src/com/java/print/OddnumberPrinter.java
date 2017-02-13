package com.java.print;

public class OddnumberPrinter implements Runnable{

	private NumberPrinter printer;
	int max;
	
	public OddnumberPrinter(NumberPrinter printer, int max){
		this.printer = printer;
		this.max = max;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=max;i=i+2){
			try {
				printer.oddPrint(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
