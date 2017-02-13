package com.src.java.queue;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BlockingQueue<Message> queue = new BlockingQueue<Message>(10);
		
		Producer producer1 = new Producer(queue);
		Producer producer2 = new Producer(queue);
		
		Consumer consumer1 = new Consumer(queue);
		Consumer consumer2 = new Consumer(queue);
		Consumer consumer3 = new Consumer(queue);
		
		new Thread(producer1,"Producer 1").start();
		new Thread(producer2,"Producer 2").start();
		
		new Thread(consumer1,"Consumer 1").start();
		new Thread(consumer2,"Consumer 2").start();
		new Thread(consumer3,"Consumer 3").start();
		
		System.out.println("All thread finised their jobs");
	}

}
