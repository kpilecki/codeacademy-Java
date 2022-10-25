package paskaita24_10.uzduotis1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Uzduotys {
	private static Scanner sc = new Scanner( System.in );
	
	protected void finalize() {
		sc.close();
	}

	public static void iveskVardus() {
		ArrayList<String> arr = new ArrayList<>();
		int numberOfNamesToEnter = 10;
		
		System.out.println( "Iveskite desimt vardu" );
		
		for( int i = 0; i < numberOfNamesToEnter; i++ ) {
			arr.add( sc.nextLine() );
		}
		printArrOfNames( arr );
	}
	
	private static void printArrOfNames( ArrayList<String> arr ) {
		for( int i = 0; i < arr.size(); i++ ) {
			System.out.println( arr.get( i ).toUpperCase() 
					+ "-"
					+ arr.get( i ).length()
					+ "-"
					+ (i + 1) );
		}
	}
	
	public static void uzduotis2() {
		String choice = "";
		
		while( true ) {
			if( !runChoiceMenu( choice ) ) {
				return;
			}
		}
	}
	
	public static void uzduotis2DoWhile() {
		String choice = "";
		
		do {
			if( !runChoiceMenu( choice ) ) {
				return;
			}
		} while( true );
	}
	
	public static void uzduotis2For() {
		String choice = "";
		
		for( ; ; ) {
			if( !runChoiceMenu( choice ) ) {
				return;
			}
		}
	}
	
	private static boolean runChoiceMenu( String choice ) {
		printMenu();
		choice = sc.nextLine().toUpperCase();
		
		switch( choice ) {
			case "A":
				printRandNum();
				break;
			case "B":
				printMultRandNumbers();
				break;
			case "E":
				return false;
		}
		return true;
	}
	
	private static void printMultRandNumbers() {
		Random rand = new Random();
		
		rand.ints( 0, 101)
			.limit( 10 )
			.forEach( System.out::println );
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
