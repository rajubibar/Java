
public class MainApp2 extends Thread implements Runnable{

	public void run(){
		System.out.println("Ok");
	}
	
	
	public static void main(String a[]){
		
		MainApp2 t1= new MainApp2();
		t1.run();
	}
}
