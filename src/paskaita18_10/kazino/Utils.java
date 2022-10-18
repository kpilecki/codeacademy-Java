package paskaita18_10.kazino;

import java.util.Random;
import java.util.Scanner;

public class Utils {
	//kodu generatorius ritami rutuliukai
	static Scanner sc = new Scanner( System.in );
	static Random rand = new Random();
	
	public static int nextInt(String pranesimas) {
		String input;
		do {
			System.out.println(pranesimas);
			input = sc.nextLine();
		} while (!isNumber(input));
		return Integer.parseInt(input);
	}
	
	public static int nextInt() {
		String input;
		do {
			input = sc.nextLine();
		} while (!isNumber(input));
		return Integer.parseInt(input);
	}
	
	public static boolean isNumber(String eilute) {
		try {
			Integer.parseInt(eilute);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	public static int mestiRutuliuka() {
		return rand.nextInt( 6 ) + 1; 
	}
}
