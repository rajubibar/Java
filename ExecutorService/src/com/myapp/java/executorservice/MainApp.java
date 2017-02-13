package com.myapp.java.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class MainApp{

	public static void main(String args[]){
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		for(int i=1;i<=10;i++){
			Runnable runable = new Thread(new WorkerThread(""+i));
			executorService.execute(runable);
		}
		
		executorService.shutdown();
		while(!executorService.isTerminated()){
			
		}
		System.out.println("All thread finished their job");
	}
	

}
