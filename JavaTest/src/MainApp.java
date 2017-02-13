

public class MainApp {

	public static void main(String[] args) {
	//System.out.println(null);
	
		MainApp app= new MainApp();
		app.check(null);
		
	}
	
	void check(Object obj){
		System.out.println(obj);
		System.out.println(obj.toString());
	}
}
