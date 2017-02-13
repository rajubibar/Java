package com.mythread.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	private BlockingQueue<Message> queue;
	
	public Producer(BlockingQueue<Message> queue){
		this.queue = queue;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			Message msg = new Message(""+i);
			try {
				Thread.sleep(i);
				queue.put(msg);
				System.out.println("Produced "+msg.getMsg()+" by "+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}		
		Message exitMsg = new Message("Exit");	
		try {
			queue.put(exitMsg);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
