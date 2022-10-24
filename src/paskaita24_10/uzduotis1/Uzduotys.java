package paskaita24_10.uzduotis1;

import java.util.Random;
import java.util.Scanner;

public class Uzduotys {
	private static Scanner sc = new Scanner( System.in );
	
	protected void finalize() {
		sc.close();
	}

	public static void iveskVardus() {
		String[] arr = new String[ 10 ];
		
		System.out.println( "Iveskite desimt vardu" );
		
		for( int i = 0; i < arr.length; i++ ) {
			arr[ i ] = sc.nextLine();
		}
		printArrOfNames( arr );
	}
	
	private static void printArrOfNames( String[] arr ) {
		for( int i = 0; i < arr.length; i++ ) {
			System.out.println( arr[ i ].toUpperCase() 
					+ "-"
					+ arr[ i ].length()
					+ "-"
					+ (i + 1) );
		}
	}
	
	public static void uzduotis2() {
		String choice = "";
		
		while( true ) {
			printMenu();
			choice = sc.nextLine();
			
			switch( choice ) {
			case "A": case "a":
				printRandNum();
				break;
			case "B": case "b":
				printMultRandNumbers();
				break;
			case "E": case "e":
				return;
			}
		}
	}
	
	private static void printMultRandNumbers() {
		Random rand = new Random();
		
		for( int i = 0; i < 10; i++) {
			System.out.println( rand.nextInt() );
		}
	}

	private static void printRandNum() {
		System.out.println( new Random().nextInt(0, 101) );
	}

	private static void printMenu() {
		System.out.println( "[A] - Sugeneruoti atsitiktini skaiciu 1-100\n"
						+ "[B] - Sugeneruoti 10 atsitiktiniu skaiciu\n"
						+ "[E] - Baigti darba\n");
	}
}
