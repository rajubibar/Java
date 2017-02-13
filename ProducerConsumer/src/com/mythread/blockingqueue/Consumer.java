package com.mythread.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

	private BlockingQueue<Message> queue;
	
	public Consumer(BlockingQueue<Message> queue){
		this.queue = queue;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			Message msg;
			while((msg=queue.take()).getMsg() != "Exit"){
				Thread.sleep(5);
				System.out.println("Consumed "+msg.getMsg()+" by "+Thread.currentThread().getName());
			}
			
		}catch(InterruptedException iex){
			System.out.println(iex.getMessage());
		}
	}

}
