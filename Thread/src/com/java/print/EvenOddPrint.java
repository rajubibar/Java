package com.java.print;

import java.util.concurrent.atomic.AtomicInteger;

public class EvenOddPrint implements Runnable {

	private int thid;
	private Object monitor;
	private AtomicInteger number;
	
	public EvenOddPrint(int thid,Object monitor,AtomicInteger number){
		this.thid = thid;
		this.monitor = monitor;
		this.number = number;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		print();
	}

	
	public void print(){
		try{
			while(true){
				Thread.sleep(5000);
				synchronized(monitor){
					if(number.get() %2 !=0){
						if(thid != 1){
							monitor.wait();
						}else{
							System.out.println("ThreadID :"+thid+" printing ---->"+number.getAndIncrement());
							monitor.notify();
						}
					}else{
						if(thid != 2){
							monitor.wait();
						}else{
							System.out.println("ThreadID :"+thid+" printing ---->"+number.getAndIncrement());
							monitor.notify();
						}
					}
				}
			}
			
		}catch(InterruptedException ie){
			ie.printStackTrace();
		}
	}
}
