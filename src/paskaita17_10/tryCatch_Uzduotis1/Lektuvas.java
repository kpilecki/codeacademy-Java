package paskaita17_10.tryCatch_Uzduotis1;

import java.util.Random;

public class Lektuvas {

	public void isskleistiVaziuokle() {
		Random rand = new Random();
		int x = rand.nextInt( 11 );
		
		try {
			int i = 4 / x;
			
			if( x == 5) {
				"skrendu".charAt( 20 );
			}
			
			int temp = 5 / x ;
			System.out.println( "OK: Vaziuokle sekmingai isskleista");
			
		} catch ( ArithmeticException e ) {
			
			System.out.print( "ERROR: vaziuokles isskleisti nepavyko " );
			
			try {
				vaziuokle();
			} catch ( VaziuoklesIsskleidimoKlaida z ) {
				System.out.print( z.getPriezastis() );
				System.out.println( getSvarbumas( z ));
				
			}
			
		} catch ( IndexOutOfBoundsException e ) {
			System.out.print( "ERROR: nepavyko isskleisti vaziuokles " );
			
			try {
				vaziuokle();
			} catch ( VaziuoklesIsskleidimoKlaida z ) {
				System.out.print( z.getPriezastis() );
				System.out.println( getSvarbumas( z ));
			}
			
		} finally {
			System.out.println( "INFO: lektuvas skrenda" );
		}

	}
	
	private String getSvarbumas( VaziuoklesIsskleidimoKlaida z ) {
		if( z instanceof SvarbiKlaida ) {
			return " Svarbumas: svarbi" ;
		} else if( z instanceof LaikinaKlaida ) {
			return " Svarbumas: laikina" ;
		} else {
			return " Svarbumas: nezinoma";
		}
	}
	
	public void vaziuokle() throws VaziuoklesIsskleidimoKlaida {
		Random rand = new Random();
		int x = rand.nextInt( 11 );
		
		switch( x ){
			case 1:
				throw new LaikinaKlaida( "Neatsidare durys" );
			case 2:
				throw new LaikinaKlaida( "Nenusileido ratas" );
			case 3:
				throw new SvarbiKlaida( "Uzstrigo ratas" );
			case 4:
				throw new VaziuoklesIsskleidimoKlaida( "Nezinoma klaida" );
				
		}
		
	}
}
