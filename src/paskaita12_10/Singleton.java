package paskaita12_10;

import java.util.ArrayList;
//Singleton pattern
public class Singleton {
	ArrayList<String> someList = new ArrayList<>();
	private static Singleton instance;
	
	private Singleton() {};
	
	public static Singleton getInstance() {
		if( instance == null ) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public ArrayList<String> getSomeList(){
		return someList;
	}
}
