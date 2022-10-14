package paskaita14_10;

import java.util.Collection;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Utils {
	static Scanner sc = new Scanner( System.in );
	
	public static void closeScanner() {
		sc.close();
	}
	
	public static int nextInt() {
		return nextInt( "Iveskite Skaiciu" );
	}
	
	public static int nextInt( String pranesimas ) {
		String input;
		do {
			System.out.println( pranesimas );
			input = sc.nextLine();
		} while ( !isNumber1( input ));
		return Integer.parseInt( input );
	}
	
	public static boolean isNumber1( String eilute ) {
		try {
			Integer.parseInt( eilute );
			return true;
		} catch ( NumberFormatException e ) {
			return false;
		}
	}
	
	public static boolean isNumber2(String eilute) {
		Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
	    if (eilute == null) {
	        return false;
	    }
	    return pattern.matcher(eilute).matches();
	}
	
	
	public static void printList( Collection<Studentas> list ) {
		list.forEach( v -> {
			System.out.println( v );
		});
	}
}
