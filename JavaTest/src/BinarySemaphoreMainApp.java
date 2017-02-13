
public class BinarySemaphoreMainApp {

	public static void main(String args[]){
		
		Thread[] thread = new Thread[10];
		PrinterQueue queue = new PrinterQueue();
		for(int i=0;i<10;i++){
			thread[i] = new Thread(new PrintingJob(queue),"Thread "+i);
			
		}
		
		for(int i=0;i<10;i++){
			thread[i].start();
			
		}
	}
}
