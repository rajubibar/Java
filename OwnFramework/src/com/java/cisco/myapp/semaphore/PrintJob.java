package com.java.cisco.myapp.semaphore;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class PrintJob implements Runnable {

	private PrinterQueue queue;
	
	public PrintJob(PrinterQueue queue){
		this.queue = queue;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		ThreadMXBean mbean = ManagementFactory.getThreadMXBean();
		long[] deadlockedThreadIds = mbean.findDeadlockedThreads();
		
      System.out.println("Printer queue going to print the job "+Thread.currentThread().getName());
      queue.printJob(new Object());
	}

}
