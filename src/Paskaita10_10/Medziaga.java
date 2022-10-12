package Paskaita10_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;



public class Medziaga {

	public static void hashSetMedziaga() {
		HashSet<String> mySet = new HashSet<String>();
		
		mySet.add("Chaitanya");
		mySet.add("Tim");
		mySet.add("Rick");
		mySet.add("HArry");
		
		Iterator<String> it = mySet.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
	public static void hashSetMedziaga2() {
		HashSet<Integer> skaiciai = new HashSet<>();
		
		pridek(skaiciai, 5);
		pridek(skaiciai, 7);
		pridek(skaiciai, 1);
		pridek(skaiciai, 5); // Duplicate wont add item since it already exists
		
//		skaiciai.add(5);
//		skaiciai.add(7);
//		skaiciai.add(1);
//		skaiciai.add(5); // Duplicate wont add item since it already exists
		
		
		System.out.println(skaiciai);
		
//		skaiciai.stream().forEach( v -> {
//			v *= 5;
//			System.out.println(v);
//		});
		
		Iterator<Integer> it = skaiciai.iterator();
		
		while( it.hasNext() ) {
			System.out.println( it.next().hashCode() );
		}

	}
	
	static void pridek(HashSet<Integer> skaiciai, int number) {
		if(skaiciai.add(number)) {
			System.out.println( "Skaicius " + number + " buvo pridetas sekmingai" );
		} else {
			System.out.println( "Skaicius " + number + " jau egzistuoja aibeje" );
		}
	}

	public static void hashSetMedziaga3() {
		HashSet<Koordinate> koordinates = new HashSet<>();
	
		koordinates.add( new Koordinate( 1, 1 ));
		koordinates.add( new Koordinate( 5, 1 ));
		koordinates.add( new Koordinate( 1, 5 ));
		koordinates.add( new Koordinate( 1, 7 ));
		
		System.out.println( koordinates );
		
		System.out.println( koordinates.contains( new Koordinate( 5, 1 )));
	}
	
	public static void hashSetMedziaga4() {
		Integer[] arr = {7, 5, 7, 5, 9};
		
		ArrayList<Integer> skaiciuListas = new ArrayList<>( Arrays.asList(arr) );
		
		System.out.println(skaiciuListas);
		
		HashSet<Integer> aibe = new HashSet<>();
		aibe.addAll( skaiciuListas );
		
		System.out.println( aibe );
	
		
	}
	
	public static void hashSetMedziaga5() {
		Integer[] arr = { 7, 5, 7, 5, 9, 8 };
		ArrayList<Integer> skaiciuListas = new ArrayList<>( Arrays.asList(arr) );
		
		Iterator<Integer> it = skaiciuListas.iterator();
		
		while ( it.hasNext()) {
			if( it.next() == 5 ) {
				it.remove();
			}
		}
		
		System.out.println( skaiciuListas );
		
	}
	
	public static void hashMapMedziaga() {
		HashMap<String, String> zodynas = new HashMap<>();
		zodynas.put("hello", "Labas");
		zodynas.put("thanx", "Aciu");
		zodynas.put("world", "Pasaulis");
		
		System.out.print( zodynas.get( "hello" ) 
				+ " " 
				+ zodynas.get( "world" ) 
				+ "\n" );
		
		for( String key : zodynas.keySet() ) {
			System.out.println( key );
		}
		
		for( String val : zodynas.values() ) {
			System.out.println( val );
		}
		
		for( Entry<String, String> entry : zodynas.entrySet()) {
			
			System.out.println( entry.getKey() 
					+ " -> " 
					+ entry.getValue() );
		}
			
		
		
	}
	
	static Person findByAk(ArrayList<Person> asmenys, int ak) {
		for( Person p : asmenys) {
			if( p.getAsmKodas() == ak) {
				return p;
			}
		}
		return null;
	}
}
