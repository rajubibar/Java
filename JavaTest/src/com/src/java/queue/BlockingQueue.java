package com.src.java.queue;

import java.util.LinkedList;

public class BlockingQueue<T> {
	
	private final LinkedList<T> queue= new LinkedList<T>();
	private int limit = Integer.MAX_VALUE;
	
	public BlockingQueue(int limit){
		this.limit = limit;
	}
	
	public synchronized void add(T t){
		try{
			while(this.queue.size()== limit){
				wait();
			}
			if(this.queue.size() == 0){
				notifyAll();
			}
			
			queue.add(t);
		}catch(InterruptedException iex){
			iex.printStackTrace();
		}
	}
	
	public synchronized T remove() throws InterruptedException{
		while(this.queue.size()==0){
			wait();
		}
		if(this.queue.size() == limit){
			notifyAll();
		}
		T t= queue.poll();
		return t;
	}

}
