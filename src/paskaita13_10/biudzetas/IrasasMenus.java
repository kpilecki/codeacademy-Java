package paskaita13_10.biudzetas;

import javax.tools.StandardJavaFileManager;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IrasasMenus {
	
	private void redaguotiPajamuIrasa( Biudzetas bud, Scanner sc, int id ) {
		Irasas tempIrasas = bud.getIrasasById( id );
		int choice = 0;
		
		if( tempIrasas == null || !( tempIrasas instanceof PajamuIrasas ) ) {
			System.out.println( "Irasas nerastas bandykite dar karta" );
			return;
		}
		PajamuIrasas temp = ( PajamuIrasas ) tempIrasas;
		
		while( true ) {
			System.out.println( "\n" + temp + "\n" );
			pajamuIrasasEditMenu();

			try {
				choice = sc.nextInt();
				sc.nextLine();
			} catch ( InputMismatchException e ) {
				break;
			}
			switch( choice ) {
				case 1:
					System.out.print( "Iveskite Suma: " );
					try {
						temp.setSuma( sc.nextFloat() );
						sc.nextLine();
						break;
					} catch ( InputMismatchException e ) {
						System.out.print( "Suma ivesta neteisingai\n" );
						sc.nextLine();
						continue; // TODO try switching to continue
					}
				case 2: 
					System.out.print( "Iveskite Kategorija: " );
					temp.setKategorijosIndeksas( sc.nextLine() );
					break;
				case 3:
					System.out.print( "Iveskite Pozymi: " );
					temp.setPozymis( sc.nextLine() );
					break;
				case 4:
					System.out.print( "Iveskite Papildoma Info: " );
					temp.setPapildomaInfo( sc.nextLine() );
					break;
				case 5:
					istrintiIrasa( bud, temp.getId() );
					return;
			}
		}
	}
	
	private void pajamuIrasasEditMenu(){
		System.out.println( "[1] - Pakeisti Suma\n" 
				+ "[2] - Pakeisti Kategorija\n" 
				+ "[3] - Pakeisti Pozymi\n"  
				+ "[4] - Pakeisti Papildoma Info\n"
				+ "[5] - Istrinti Irasa\n"
				+ "[q] - Grizti\n");
	}
	
	private void redaguotiIslaiduIrasa( Biudzetas bud, Scanner sc, int id ) {
		Irasas tempIrasas = bud.getIrasasById( id );
		int choice = 0;
		
		if( tempIrasas == null || !( tempIrasas instanceof IslaiduIrasas ) ) {
			System.out.println( "Irasas nerastas bandykite dar karta" );
			return;
		}
		IslaiduIrasas temp = ( IslaiduIrasas ) tempIrasas;
		
		while( choice != 6 ) {
			System.out.println( "\n" + temp + "\n" );
			editIslaiduIrasaMenu();
			try {
				choice = sc.nextInt();
				sc.nextLine();
			} catch ( InputMismatchException e ) {
				break;
			}
			switch( choice ) {
				case 1:
					System.out.print( "Iveskite Suma: " );
					try {
						temp.setSuma( sc.nextFloat() );
						break;
					} catch ( InputMismatchException e ) {
						System.out.print( "Suma ivesta neteisingai" );
						sc.nextLine();
						continue; // TODO try switching to continue
					}
				case 2: 
					System.out.print( "Iveskite Atsiskaitymo Buda: " );
					temp.setAtsiskaitymoBudas( sc.nextLine() );
					break;
				case 3:
					System.out.print( "Iveskite Banko Kortele: " );
					temp.setBankoKortele( sc.nextLine() );
					break;
				case 4:
					System.out.print( "Iveskite Kategorija: " );
					temp.setKategorijosIndeksas( sc.nextLine() );
					break;
				case 5:
					System.out.print( "Iveskite Papildoma Info: " );
					temp.setPapildomaInfo( sc.next() );
					break;
				case 6:
					istrintiIrasa( bud, temp.getId() );
					return;
			}
		}
	}
	
	private void editIslaiduIrasaMenu() {
		System.out.println( "[1] - Pakeisti Suma\n" 
				+ "[2] - Pakeisti Atsiskaitymo Buda\n" 
				+ "[3] - Pakeisti Banko Kortele\n" 
				+ "[4] - Pakeisti Kategorija\n" 
				+ "[5] - Pakeisti Papildoma Info\n"
				+ "[6] - Istrinti Irasa\n"
				+ "[q] - Grizti\n");
	}

	private void istrintiIrasa( Biudzetas bud, int id ) {
		if( bud.removeIrasasById( id ) ) {
			System.out.println( "Irasas " + id + " istrintas sekmingai");
		} else {
			System.out.println( "Irasas " + id + " nerastas");
		}
	}
	
	public void parodytiRedaguotiIslaidas(Biudzetas bud, Scanner sc) {
		while( true ) {
			System.out.println("Nr. |       Data       | Suma | Atsiskaitymo Budas "
					+ "| Banko Kortele | Kategorija | Papildoma Info");
			for ( IslaiduIrasas irasas : bud.gautiIslaiduSarasa() ) {
				System.out.println( irasas );
			}
			System.out.print( "\n Iveskite numeri iraso kuri norite istrinti arba raide kad grizti: " );
			sc.nextLine();
			try {
				redaguotiIslaiduIrasa( bud, sc, sc.nextInt() );
			} catch ( InputMismatchException e ) {
				return;
			}
		}
	}

	public void parodytiRedaguotiPajamas( Biudzetas bud, Scanner sc ) {
		while( true ) {
			System.out.println("Nr. |    Data    | Suma | Kategorija | " 
									+ "Pozymis | Papildoma Info");
			for ( PajamuIrasas irasas : bud.gautiPajamuSarasa() ) {
				System.out.println( irasas );
			}
			sc.nextLine();
			System.out.print( "\n Iveskite numeri iraso kuri norite "
								+ "redaguoti arba raide kad grizti: " );
			try {
				redaguotiPajamuIrasa( bud, sc, sc.nextInt() );
			} catch ( InputMismatchException e ) {
				return;
			}	
		}	
	}

	public void issaugotiIrasus(Biudzetas bud, Scanner sc) {
		System.out.println("Iveskite kur issaugoti irasa");
		sc.nextLine();
		String temp = sc.nextLine() + "irasai.csv";
		Path path = Paths.get("");
		try {
			path = Paths.get(temp);
		} catch (InvalidPathException e) {
			System.out.println("Ivestas blogas kelias");
			return;
		}
		File csvFile = new File(path.toUri());
		try {
			FileWriter fileWriter = new FileWriter(csvFile);
			fileWriter.write(bud.toCSV());
			fileWriter.close();
			System.out.println("Irasyta Sekmingai");
		} catch (IOException e) {
			System.out.println("Ivyko klaida");
			return;
		}
	}

	public void uzkrautiIrasus(Biudzetas bud, Scanner sc) {
	}
}
