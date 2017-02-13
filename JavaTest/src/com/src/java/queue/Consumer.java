package com.src.java.queue;



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
		while(true){
			msg = queue.remove();
			Thread.sleep(500);
			System.out.println("Consumed "+msg.getMsg()+" by "+Thread.currentThread().getName());
		}
		}catch(InterruptedException iex){
			iex.printStackTrace();
		}
	}

}
