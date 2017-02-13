package com.src.java.queue;

public class Producer implements Runnable {

	private BlockingQueue<Message> queue;
	
	public Producer(BlockingQueue<Message> queue){
		this.queue= queue;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Message msg;
		try{
			for(int i=0;i<100;i++){
				msg = new Message("Thread "+i);
				Thread.sleep(100);
				queue.add(msg);
				System.out.println("Produced msg " +msg.getMsg() +" by "+Thread.currentThread().getName());
			}
			
		}catch(InterruptedException iex){
			iex.printStackTrace();
		}

	}

}
