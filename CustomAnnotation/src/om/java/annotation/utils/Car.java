package om.java.annotation.utils;

public class Car implements Cloneable {
	int speed;
	public  void speed(){
		System.out.println("Speed " +speed);
	}
	
	public Object clone(){
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
