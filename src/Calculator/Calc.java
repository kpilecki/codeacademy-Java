package Calculator;

public class Calc {
	
	private int someInt = 6;
	
	private static int someStaticInt = 8;
	
	public void greet() {
		System.out.println("Hello World!!!");
	}
	
	public static int sum(int a, int b) {
		return a + b + someStaticInt;
	}
	public int sudeti(int a, int b) {
		return a + b + someInt;
	}
	
	public int atimtis(int a, int b) {
		return a - b;
	}
	public int skirtumas(int a, int b) {
		return a > b ? a - b : b - a;
	}
	public int multiply(int a, int b) {
		return a * b;
	}
	public float divide(int a, int b) {
		return a * b * 1f;
	}
	
	public float smagu(int a, int b, int c) {
		
		return c != 0 ? ((a + b) / (float)c) : 0;
	}
	
	public int one() {
		return 1;
	}
	public int two() {
		return 2;
	}
	public int three() {
		return 3;
	}
	public int four() {
		return 4;
	}
	public int five() {
		return 5;
	}
	
	static public void printArray(int[] array) {
		for(int number : array) {
			System.out.println(number);
		}
	}
	
	


}
