package paskaita13_10_Biudzetas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {
	 
	public static void main(String[] args) {
		run();
		
	}
	
	private static void run() {
		Scanner sc = new Scanner( System.in );
		int choice = 0;
		Biudzetas bud = new Biudzetas();
		
		while( choice != 8 ) {
			printMenu();
			try {
				choice = sc.nextInt();
			} catch ( InputMismatchException e ) {
				System.out.println( "Ivesti galima tik skaiciu nuo 1 iki 8");
				sc.next();
				continue;
			}
			
			switch(choice ) {
			case 1:
				ivestiPajamasForm( bud, sc );
				break;
			case 2:
				ivestiIslaidasForm( bud, sc );
				break;
			case 3:
				isvestiPajamas( bud );
				break;
			case 4:
				isvestiIslaidas( bud );
				break;
			case 5:
				isvestiBalansa( bud );
				break;
			case 6:
				parodytiRedaguotiPajamas( bud, sc );
				break;
			case 7:
				parodytiRedaguotiIslaidas( bud, sc );
				break;
				
			}
		}
		System.out.println( "Programa baige darba sekmingai" );
	}
	
	private static void parodytiRedaguotiIslaidas(Biudzetas bud, Scanner sc) {
		String choice = "";
		while( true ) {
			int counter = 0;
			System.out.println("Nr. |       Data       | Suma | Atsiskaitymo Budas "
					+ "| Banko Kortele | Kategorija | Papildoma Info");
			for ( IslaiduIrasas irasas : bud.gautiIslaiduSarasa() ) {
				System.out.println( "[" + counter + "] | " + irasas );
				counter++;
			}
			
			System.out.print( "\n Iveskite numeri iraso kuri norite istrinti arba raide kad grizti: " );
			sc.next();
			choice = sc.nextLine();
			try {
				int index = Integer.parseInt( choice );
				bud.gautiIslaiduSarasa().remove( index );
			} catch (NumberFormatException e) {
				return;
			} catch (IndexOutOfBoundsException e) {
				System.out.println( "\nBlogai ivestas skaicius bandykite dar");
				continue;
			}	
		}
		
		
	}

	private static void parodytiRedaguotiPajamas( Biudzetas bud, Scanner sc ) {
		String choice = "";
		while( true ) {
			int counter = 0;
			System.out.println("Nr. |    Data    | Suma | Kategorija | Pozymis | Papildoma Info");
			for ( PajamuIrasas irasas : bud.gautiPajamuSarasa() ) {
				System.out.println( "[" + counter + "] | " + irasas );
				counter++;
			}
			
			System.out.print( "\n Iveskite numeri iraso kuri norite istrinti arba raide kad grizti: " );
			sc.next();
			choice = sc.nextLine();
			try {
				int index = Integer.parseInt( choice );
				bud.gautiPajamuSarasa().remove( index );
			} catch (NumberFormatException e) {
				return;
			} catch (IndexOutOfBoundsException i) {
				System.out.println( "\nBlogai ivestas skaicius bandykite dar");
				continue;
			}	
		}
		
	}

	private static void isvestiBalansa(Biudzetas bud) {
		System.out.println( "\nJusu balansas: " + bud.balansas());
		
	}

	private static void isvestiIslaidas(Biudzetas bud) {
		System.out.println( "\nJusu islaidu suma: " + bud.gautiIslaiduSuma() );
		
	}

	private static void isvestiPajamas(Biudzetas bud) {
		System.out.println( "\nJusu pajamu suma: " + bud.gautiPajamuSuma() );
		
	}

	private static void printMenu() {
			System.out.println( "\n[1] - Ivesti Pajamas\n" 
					+ "[2] - Ivesti Islaidas\n" 
					+ "[3] - Parodyti Pajamas\n" 
					+ "[4] - Parodyti Islaidas\n" 
					+ "[5] - Isvesti Balansa\n"
					+ "[6] - Parodyti Arba Redaguoti Pajamu Irasus\n"
					+ "[7] - Parodyti Ir Redaguoti Islaidu Irasus\n"
					+ "[8] - Baigti Darba\n");
			
			
		}

	private static void ivestiPajamasForm( Biudzetas bud, Scanner sc ) {
		
		PajamuIrasas temp = new PajamuIrasas();
		
		System.out.print( "Iveskite pajamu suma: ");
		try {
			temp.setSuma( sc.nextFloat() );
			
		} catch (InputMismatchException e) {
			System.out.println( "Suma gali buti tik skaicius" );
			sc.next();
			return;
		}
		sc.nextLine();
		System.out.print( "Iveskite pajamu kategorija: ");
		temp.setKategorijosIndeksas( sc.nextLine() );
		
		System.out.print( "Iveskite pajamu pozymi: ");
		temp.setPozymis( sc.nextLine() );
		
		System.out.print( "Iveskite papildoma informacija: ");
		temp.setPapildomaInfo( sc.nextLine() );
		
		temp.setData( LocalDate.now() );
		
		try {
			bud.pridePajamuIrasa( temp );
		} catch (IndexOutOfBoundsException e) {
			System.out.println( e.getMessage() );
			return;
		}
		System.out.println( "\nPajamu irasas sekmingai pridetas");
		
	}

	private static void ivestiIslaidasForm( Biudzetas bud, Scanner sc ) {
		IslaiduIrasas temp = new IslaiduIrasas();
		
		System.out.print( "Iveskite islaidu suma: ");
		try {
			temp.setSuma( sc.nextFloat() ); 
		} catch (InputMismatchException e) {
			System.out.println( "Suma gali buti tik skaicius" );
			sc.next();
			return;
		}
		sc.nextLine();
		System.out.print( "Iveskite islaidu kategorija: ");
		temp.setKategorijosIndeksas( sc.nextLine() );
		
		System.out.print( "Iveskite atsiskaitymo buda: ");
		temp.setAtsiskaitymoBudas( sc.nextLine() );
		
		System.out.print( "Iveskite banko korteles numeri: ");
		temp.setBankoKortele( sc.nextLine() );
		
		System.out.print( "Iveskite papildoma informacija: ");
		temp.setPapildomaInfo( sc.nextLine() );
		
		temp.setData( LocalDateTime.now() );
		
		try {
			bud.pridetiIslaiduIrasa( temp );
		} catch (IndexOutOfBoundsException e) {
			System.out.println( e.getMessage() );
			return;
		}
		System.out.println( "\nIslaidu irasas sekmingai pridetas" );
	}
	
}