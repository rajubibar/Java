import java.util.concurrent.Semaphore;

public  class PrinterQueue {
	
	private Semaphore queue;

	public PrinterQueue(){
		queue = new Semaphore(1);
	}
	
	public void printJob(Object obj){
		
		try{
			queue.acquire();
			System.out.println(Thread.currentThread().getName() +"is printing the document");
			Thread.sleep(4000);
			
		}catch(InterruptedException iex){
			iex.printStackTrace();
		}finally{
			queue.release();
		}
	}
}
