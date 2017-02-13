package com.myapp.concurency.semaphore;

import java.sql.Date;
import java.util.concurrent.Semaphore;

public class PrinterQueue{

	private final Semaphore semaphore;
	
	public PrinterQueue(){
		semaphore = new Semaphore(1);
	}

	
	public void printJob(Object document){
		try{
			semaphore.acquire();
			Long duration = (long) (Math.random() * 10000);
	         System.out.println(Thread.currentThread().getName() + ": PrintQueue: Printing a Job during " + (duration / 1000) + " seconds :: Time - " + new Date(duration));
	         Thread.sleep(duration);
		}catch(InterruptedException iex){
			iex.printStackTrace();
		}finally{
			 System.out.printf("%s: The document has been printed\n", Thread.currentThread().getName());
			semaphore.release();
		}
	}
}
