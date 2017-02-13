package com.java.seqprint;

public class PrintingNumber implements Runnable {
	Printer printer;
	PrintingNumber(Printer printer){
		this.printer = printer;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
          for(int i=1;i<=100;i++){
        	  printer.print(i);
        	  try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
          }
	}

}
