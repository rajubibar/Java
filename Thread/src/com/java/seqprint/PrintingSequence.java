package com.java.seqprint;

import java.util.concurrent.atomic.AtomicInteger;

public class PrintingSequence implements Runnable {

	private int thid;
	private int numberOfTh;
	private Object monitor;
	private AtomicInteger number;
	
	public PrintingSequence(int thid,int numberOfTh,Object monitor,AtomicInteger number){
		this.thid = thid;
		this.numberOfTh = numberOfTh;
		this.monitor = monitor;
		this.number = number;
	}
	
	public void run(){
		print();
	}
	
	private void print(){
		try{
			while(true){
				Thread.sleep(5000);
				synchronized(monitor){
					
					if(number.get() % numberOfTh != thid){
						monitor.wait();
					}else{
						System.out.println("ThreadID :" +thid+ " Printing ---->"+number.getAndIncrement());
						monitor.notifyAll();
					}
					if(number.get() == 20){
						break;
					}
				}
			}
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
	}
}
