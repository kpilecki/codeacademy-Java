package Paskaita07_10;

import java.util.ArrayList;

public class Uzduotys {
	
	public static void uzduotis3() {
		ArrayList<Koordinate> sarasas = new ArrayList<>();
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
	
	public static void uzduotis4() {
		ArrayList<Asmuo> sarasas = new ArrayList<>();
		sarasas.add( new Asmuo("Petras", "Petraitis", "12345678") );
		sarasas.add( new Asmuo("Jonas", "Jonaitis", "87654321") );
		sarasas.add( new Asmuo("Antanas", "Antanaitis", "543644534") );
		
		int index = sarasas.indexOf(new Asmuo("87654321"));
		
		System.out.println(sarasas.get(index));
		
		
		
	}
	
	

}
