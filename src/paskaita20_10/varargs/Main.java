package paskaita20_10.varargs;

public class Main {
	
	public static void main(String[] args) {
		
	}
	public static int sudetiSkaicius(int... skaiciai ) {
		int rez = 0;
		for( int i : skaiciai ) {
			rez += i;
		}
		return rez;
	}
	
}

