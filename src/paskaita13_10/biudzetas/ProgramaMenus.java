package paskaita13_10.biudzetas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramaMenus {
	
	public void isvestiBalansa( Biudzetas bud ) {
		System.out.println( "\nJusu balansas: " 
								+ bud.balansas());	
	}

	public void isvestiIslaidas( Biudzetas bud ) {
		System.out.println( "\nJusu islaidu suma: " 
								+ bud.gautiIslaiduSuma() );
	}

	public void isvestiPajamas( Biudzetas bud ) {
		System.out.println( "\nJusu pajamu suma: " 
								+ bud.gautiPajamuSuma() );	
	}

	public void printMenu() {
			System.out.println( "\n[1] - Ivesti Pajamas\n" 
					+ "[2] - Ivesti Islaidas\n" 
					+ "[3] - Parodyti Pajamas\n" 
					+ "[4] - Parodyti Islaidas\n" 
					+ "[5] - Isvesti Balansa\n"
					+ "[6] - Parodyti Arba Redaguoti Pajamu Irasus\n"
					+ "[7] - Parodyti Ir Redaguoti Islaidu Irasus\n"
					+ "[8] - Issaugoti irasus\n"
					+ "[9] - Uzkrauti irasus\n"
					+ "[0] - Baigti Darba\n");
		}

	public void ivestiPajamasForm( Biudzetas bud, Scanner sc ) {
		PajamuIrasas temp = new PajamuIrasas();
		
		System.out.print( "Iveskite pajamu suma: " );
		try {
			temp.setSuma( sc.nextFloat() );
			
		} catch ( InputMismatchException e ) {
			System.out.println( "Suma gali buti tik skaicius" );
			sc.next();
			return;
		}
		sc.nextLine();
		System.out.print( "Iveskite pajamu kategorija: " );
		temp.setKategorijosIndeksas( sc.nextLine() );
		
		System.out.print( "Iveskite pajamu pozymi: " );
		temp.setPozymis( sc.nextLine() );
		
		System.out.print( "Iveskite papildoma informacija: " );
		temp.setPapildomaInfo( sc.nextLine() );
		
		temp.setData( LocalDate.now() );
		
		bud.pridetiIrasa( temp );
		System.out.println( "\nPajamu irasas sekmingai pridetas" );
	}

	public void ivestiIslaidasForm( Biudzetas bud, Scanner sc ) {
		IslaiduIrasas temp = new IslaiduIrasas();
		
		System.out.print( "Iveskite islaidu suma: " );
		try {
			temp.setSuma( sc.nextFloat() ); 
		} catch ( InputMismatchException e ) {
			System.out.println( "Suma gali buti tik skaicius" );
			sc.next();
			return;
		}
		sc.nextLine();
		System.out.print( "Iveskite islaidu kategorija: " );
		temp.setKategorijosIndeksas( sc.nextLine() );
		
		System.out.print( "Iveskite atsiskaitymo buda: " );
		temp.setAtsiskaitymoBudas( sc.nextLine() );
		
		System.out.print( "Iveskite banko korteles numeri: " );
		temp.setBankoKortele( sc.nextLine() );
		
		System.out.print( "Iveskite papildoma informacija: " );
		temp.setPapildomaInfo( sc.nextLine() );
		
		temp.setData( LocalDateTime.now() );
		
		bud.pridetiIrasa( temp );

		System.out.println( "\nIslaidu irasas sekmingai pridetas" );
	}

}
