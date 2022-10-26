package paskaita26_10.generics;

import java.util.ArrayList;
import java.util.List;

import paskaita26_10.uzduotis1.Person;

public class Main {

	public static void main(String[] args) {
		Box<Integer> boxInt = new Box<>();
		boxInt.setObject( 5 );
		System.out.println( boxInt );
		
		Box<String> boxStr = new Box<>();
		boxStr.setObject( "Kaunas" );
		System.out.println( boxStr );
		
		genericDisplay( "String");
		genericDisplay( new ArrayList<String>() );
		
		ArrayList<Integer> arrList = new ArrayList<>();
		printList( arrList );
	}
	
	static <T> void genericDisplay( T element ) {
		System.out.println( element.getClass().getName() 
					+ "=" + element );
	}
	
	
	static <T extends Person > void printPerson( List<T> p ) {
		for( T val : p ) {
			System.out.println( val );
		}
	}
	
	static void setSpeed( List<? extends Person> p ) {
		
		for( Person val : p ) {
			System.out.println( val );
		}
		
	}
	
	static void printList( List<? extends Number> list ) {
		
	}

}
