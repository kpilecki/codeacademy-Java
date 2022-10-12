package Paskaita10_10;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map.Entry;
import java.util.Scanner;

public class Univeras {
	HashMap<Integer, Studentas> db = new HashMap<>();
	Scanner sc = new Scanner( System.in );
	
	public void run() {
		bootstrap();
		int choice = 0;

		while ( choice != 4 ) {
			printMenu();
			choice = menuChoice();

			switch (choice) {
				case 1:
					addStudent();
					choice = 0;
					break;
				case 2:
					getStudent();
					choice = 0;
					break;
				case 3:
					printAll();
					choice = 0;
					break;
			}
		}
		System.out.println("Programa baige darba sekmingai");
	}
	
	private void printAll() {
		for( Entry<Integer, Studentas> entry : db.entrySet()) {
			System.out.println(entry.getValue());
		}
	}

	private void printMenu() {
		
		System.out.println( "\n[1] - ivesti studenta\n"
				+ "[2] - gauti studenta pagal numeri\n"
				+ "[3] - parodyti visus studentus\n"
				+ "[4] - baigti programa");
	}
	
	private int menuChoice(){
		int choice = 0;
		
		try {
			choice = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Galima ivesti tik skaiciu 1, 2, 3 arba 4\n");
			sc.next();
			return 0;
		}
		
		if(choice > 4 && choice < 1) {
			return 0;
		}
		return choice;
	}
	
	private void getStudent() {
		int number = 0;
		
		sc.nextLine();
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
	
	private void addStudent() {
		Studentas temp = new Studentas();
		
		sc.nextLine();
		System.out.println( "\nIveskite Varda\n" );
		temp.setName( sc.nextLine() );
		
		System.out.println( "\nIveskite Pavarde\n" );
		temp.setSurname( sc.nextLine() );
		
		System.out.println( "\nIveskite Studento Numeri\n" );
		try {
			temp.setNumber( sc.nextInt() );
		} catch ( InputMismatchException e ) {
			System.out.println( "\nStudento Numeri gali sudaryti tik skaiciai\n" );
			sc.next();
			return;
		}
		if( db.containsKey( temp.getNumber() )) {
			System.out.println("\nToks studento numeris jau egzistuoja\n");
			return;
		}
		
		sc.nextLine();
		System.out.println( "\nIveskite Universiteta\n" );
		
		temp.setUniversity( sc.nextLine() );
		
		db.put( temp.getNumber(), temp );
		
		System.out.println( "\nStudentas" + temp.getName() 
							+ " " 
							+ temp.getSurname() 
							+ " Pridetas Sekmingai\n" );
	}
	
	private void bootstrap() {
		db.put( 1, new Studentas( "Jonas", "Jonaitis", 1, "Uni1" ));
		db.put( 2, new Studentas( "Petras", "Petraitis", 2, "Uni2" ));
		db.put( 3, new Studentas( "John", "Doe", 3, "Uni3" ));
	}
}
