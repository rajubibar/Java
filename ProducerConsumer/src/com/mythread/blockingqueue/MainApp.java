package com.mythread.blockingqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	BlockingQueue<Message> queue = new ArrayBlockingQueue<Message>(10);	
		BlockingQueue queue = new ArrayBlockingQueue(10);	
		Producer producer = new Producer(queue);		
		Consumer consumer1 = new Consumer(queue);
		Consumer consumer2 = new Consumer(queue);
		Consumer consumer3 = new Consumer(queue);
		new Thread(producer,"Producer 1").start();
		new Thread(consumer1,"Consumer 1").start();	
		new Thread(consumer2,"Consumer 2").start();	
		new Thread(consumer3, "Consumer 3").start();	
		System.out.println("Producer and Consumer has been started");
	}

}
