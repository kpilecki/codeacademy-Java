package Paskaita10_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map.Entry;
import java.util.Scanner;

public class Uzduotys {
	
	public static void uzduotis1() {
		HashMap<Integer, String> numWord = new HashMap<>();
		numWord.put( 1, "vienas" );
		numWord.put( 2, "du" );
		numWord.put( 3, "tris" );
		numWord.put( 4, "keturi" );
		numWord.put( 5, "penki" );
		
		System.out.println( numWord );
		
		System.out.println( numWord.containsKey( 2 ) );
		
		System.out.println( numWord.containsValue( "septyni" ) );
		
		System.out.println( numWord.get( 3 ) );
		
		
		
		for ( Entry<Integer, String> e : numWord.entrySet()) {
			System.out.println( "Raktas: " + e.getKey() 
					+ ", Reiksme: " 
					+ e.getValue().substring( 0, 1).toUpperCase() 
					+ e.getValue().substring(1).toLowerCase() );
		}
	}
	
	public static void uzduotis2() {
		HashMap<Integer, String> numWord = new HashMap<>();
		numWord.put( 1, "vienas" );
		numWord.put( 2, "du" );
		numWord.put( 3, "tris" );
		numWord.put( 4, "keturi" );
		numWord.put( 5, "penki" );
		
		spausdintiMap( numWord );
		
		numWord.remove( 5 );
		
		spausdintiMap( numWord );
		
		numWord.clear();
		
		spausdintiMap( numWord );
	}
	
	private static void spausdintiMap( HashMap< Integer, String> map) {
		
		for ( Entry<Integer, String> e : map.entrySet() ) {
			System.out.println( "Raktas: " + e.getKey() 
					+ ", Reiksme: " 
					+ e.getValue().substring( 0, 1).toUpperCase() 
					+ e.getValue().substring(1).toLowerCase() );
		}
	}
	
	private static void spausdintiMap2( HashMap< String, Integer> map) {
		
		for ( Entry<String, Integer> e : map.entrySet() ) {
			System.out.println( "Raktas: " + e.getKey().substring(0, 1).toUpperCase()
					+ e.getKey().substring(1).toLowerCase()
					+ ", Reiksme: " 
					+ e.getValue());
		}
	}
	
	public static void uzduotis3() {
		HashMap<Integer, String> numWord = new HashMap<>();
		numWord.put( 1, "vienas" );
		numWord.put( 2, "du" );
		numWord.put( 3, "tris" );
		numWord.put( 4, "keturi" );
		numWord.put( 5, "penki" );
		
		HashMap<String, Integer> wordNum = new HashMap<>();
		
		for( Entry<Integer, String> e : numWord.entrySet()) {
			wordNum.put( e.getValue(), e.getKey() );
		}
		
		spausdintiMap2( wordNum );
		
		System.out.println( wordNum.keySet() );
		
	}
	
	public static void uzduotis4() {
		HashMap<Integer, Studentas> db = new HashMap<>();
		Scanner sc = new Scanner( System.in );
		int choice = 0;
		
		while( choice != 3 ) {
			choice = menuChoice( sc );
			
			switch( choice ) {
				case 1:
					addStudent( db, sc );
					choice = 0;
					break;
				case 2:
					getStudent( db, sc );
					choice = 0;
					break;
			}
		}
		sc.close();
		System.out.println("Programa baige darba sekmingai");
	}
	
	private static int menuChoice( Scanner sc ){
		int choice = 0;
		
		System.out.println( "[1] - ivesti studenta\n"
				+ "[2] - gauti studenta pagal numeri\n"
				+ "[3] - baigti programa");
		try {
			choice = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Galima ivesti tik skaiciu 1, 2 arba 3\n");
			sc.next();
			return 0;
		}
		
		if(choice > 3 && choice < 1) {
			
		}
		return choice;
	}
	
	private static void getStudent(HashMap<Integer, Studentas> db, Scanner sc) {
		int number = 0;
		
		System.out.println( "\nIveskite Studento Numeri\n" );
		try {
			number = sc.nextInt();
		} catch ( InputMismatchException e ) {
			System.out.println( "\nGalima ivesti tik skaicius\n" );
			sc.next();
			return;
		}
		if( db.containsKey( number )) {
			System.out.println( db.get( number ) );
		} else {
			System.out.println( "\nToks Studentas Neegzistuoja\n" );
		}
	}
	
	private static void addStudent( HashMap<Integer, Studentas> db, Scanner sc ) {
		Studentas temp = new Studentas();
		
		sc.nextLine();
		System.out.println( "\nIveskite Varda\n" );
		temp.setName( sc.nextLine() );
		
		System.out.println( "\nIveskite Pavarde\n" );
		temp.setSurname( sc.nextLine() );
		
		System.out.println( "\nIveskite Studento Numeri\n" );
		temp.setNumber( sc.nextInt() );
		
		if( db.containsKey( temp.getNumber() )) {
			System.out.println("\nToks studento numeris jau egzistuoja\n");
			return;
		}
		
		sc.nextLine();
		System.out.println( "\nIveskite Universiteta\n" );
		
		temp.setUniversity( sc.nextLine() );
		
		db.put( temp.getNumber(), temp );
		
		System.out.println( "\nStudentas Pridetas Sekmingai\n" );
	}

	public static void uzduotis11() {
		HashSet<String> mySet = new HashSet<>();
		
		mySet.add( "John" );
		mySet.add( "Steve" );
		mySet.add( "Tom" );
		mySet.add( "Nick" );
		
		System.out.println( mySet + " Set size is " + mySet.size() );
		
		mySet.add( "Nick" ); // Duplicate item won't add
		
		System.out.println( mySet + " Set size is " + mySet.size() );
		
		String str = "Tom";
		
		if( mySet.contains( str )) { // checks if the element already exists
			mySet.remove( str ); // removes the element 
		}
		
		System.out.println( mySet + " Set size is " + mySet.size() );
		
		mySet.clear(); // clears the set
		
		System.out.println( mySet + " Set size is " + mySet.size() );
		
		mySet.add( "John" );
		mySet.add( "Steve" );
		mySet.add( "Tom" );
		mySet.add( "Nick" );
	
		System.out.println( mySet + " Set size is " + mySet.size() );
	}

	public static void uzduotis22() {
		ArrayList<String> strList = new ArrayList<>();
		strList.add("John");
		strList.add("Stewie");
		strList.add("Rick");
		strList.add("Morty");
		strList.add("Gerald");
		strList.add("Morty");
		strList.add("Rick");
		
		System.out.println(strList);
		
		HashSet<String> strSet = new HashSet<>();
		strSet.addAll(strList);
		
		System.out.println(strSet);
		
		strSet.forEach( v -> {
			System.out.println(v + " =" + v.hashCode());
		});
		
		ArrayList<String> list = new ArrayList<>(strSet);
		
		System.out.println(list);
		
		list.sort(null);
		
		System.out.println(list);
	}
}
