package Paskaita07_10;

import java.util.LinkedList;

public class Medziaga {
	
	public static void linkedListMedziaga() {
		LinkedList<Koordinate> sarasas = new LinkedList<>();
		sarasas.add( new Koordinate(2,5) );
		sarasas.add( new Koordinate(1,5) );
		sarasas.add( new Koordinate(5,9) );
		sarasas.add( new Koordinate(4,0) );
		sarasas.add( new Koordinate(0,0) );
		sarasas.add( new Koordinate(9,1) );
		
		System.out.println( sarasas );

		int location = sarasas.indexOf( new Koordinate(0,0) );
		
		System.out.println( location );
		
//		sarasas.get( location ).setX(1);
//		sarasas.get( location ).setY(1);
		
		sarasas.get( location ).setValues(1, 1);
		
		System.out.println( sarasas );
	}

}
