
public class PrintingJob implements Runnable {

	private PrinterQueue queue;
	public PrintingJob(PrinterQueue queue){
		this.queue = queue;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			System.out.println(Thread.currentThread().getName() +"is going to printing the job");
			queue.printJob(new Object());
		}catch(Exception ex){
			
		}
	}

}
