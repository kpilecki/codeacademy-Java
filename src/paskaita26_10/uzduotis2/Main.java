package paskaita26_10.uzduotis2;

import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<Medis> ivairus = Arrays.asList( new Berzas(), new Azuolas(), 
									new Kadagys(), new Egle(), new Pusis() );
		
		ivairusMiskas( ivairus );
		
		
		spygliuociuMiskas( Arrays.asList( new Egle(), new Pusis(), new Kadagys() ) );
		spygliuociuMiskas2( ivairus );
		
		
		berzuMiskas( Arrays.asList( new Berzas(), new Berzas(), new Berzas() ) );
		
	}
	
	static <T extends Medis> void ivairusMiskas( List<T> list ) {
		System.out.println( "\nIvairus Miskas");
		list.forEach( T::turi);
	}
	
	static <T extends Spygliuotis> void spygliuociuMiskas( List<T> list ) {
		System.out.println( "\nSpygliuociu Miskas");
		list.forEach( T::turi);
	}
	
	static <T extends Medis> void spygliuociuMiskas2( List<T> list ) {
		System.out.println( "\nSpygliuociu Miskas2");
		list.forEach( v -> {
			if( v instanceof Spygliuotis ) {
				v.turi();
			}
		});
	}
	
	static <T extends Berzas> void berzuMiskas( List<T> list ) {
		System.out.println( "\nBerzu Miskas");
		list.forEach( T::turi);
	}

}
