package com.myapp.java.executorservice;

public class WorkerThread implements Runnable {

	private String msg; 
	 public WorkerThread(String msg) {
		this.msg= msg;
	}
	@Override
	public void run() {
		try{
			System.out.println(Thread.currentThread().getName()+" Start. msg = "+msg);
			Thread.sleep(5000);
			System.out.println(Thread.currentThread().getName()+" End.");
		}catch(InterruptedException iex){
			iex.printStackTrace();
		}
		

	}

}
