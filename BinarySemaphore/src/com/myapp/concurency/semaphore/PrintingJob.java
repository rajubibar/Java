package com.myapp.concurency.semaphore;

public class PrintingJob implements Runnable {
    
	private PrinterQueue printerQueue;
	
	public PrintingJob(PrinterQueue printerQueue){
		this.printerQueue = printerQueue;
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
        System.out.printf("%s: Going to print a document\n", Thread.currentThread().getName());
		printerQueue.printJob(new Object());	
	}

}
