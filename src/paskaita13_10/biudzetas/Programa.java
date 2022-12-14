package paskaita13_10.biudzetas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {
	 
	public static void main(String[] args) {
		run();
		
	}
	
	private static void run() {
		Scanner sc = new Scanner( System.in );
		int choice = -1;
		Biudzetas bud = new Biudzetas();
		IrasasMenus irM = new IrasasMenus();
		ProgramaMenus prM = new ProgramaMenus();
		
		while( choice != 0 ) {
			prM.printMenu();
			try {
				choice = sc.nextInt();
			} catch ( InputMismatchException e ) {
				System.out.println( "Ivesti galima tik skaiciu nuo 0 iki 9");
				sc.next();
				continue;
			}
			
			switch(choice ) {
				case 1:
					prM.ivestiPajamasForm( bud, sc );
					break;
				case 2:
					prM.ivestiIslaidasForm( bud, sc );
					break;
				case 3:
					prM.isvestiPajamas( bud );
					break;
				case 4:
					prM.isvestiIslaidas( bud );
					break;
				case 5:
					prM.isvestiBalansa( bud );
					break;
				case 6:
					irM.parodytiRedaguotiPajamas( bud, sc );
					break;
				case 7:
					irM.parodytiRedaguotiIslaidas( bud, sc );
					break;
				case 8:
					irM.issaugotiIrasus( bud, sc );
					break;
				case 9:
					irM.uzkrautiIrasus( bud, sc );
					break;
				
			}
		}
		System.out.println( "Programa baige darba sekmingai" );
		sc.close();
	}
	

	
	
}



