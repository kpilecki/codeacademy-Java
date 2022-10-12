package Paskaita07_10;

import java.util.ArrayList;
import java.util.LinkedList;

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
		sarasas.add( new Asmuo("Antanas", "Petraitis", "5434454534") );
		sarasas.add( new Asmuo("Jonas", "Antanaitis", "5436345343") );
		
		
		System.out.println( Asmuo.searchArrByAsmKodas(sarasas, "5436345343") );
		
		System.out.println( Asmuo.findAllByName( sarasas, "Antanas" ) );
		
		//System.out.println( Asmuo.findAllContainValue(sarasas, "54"));
		
		Asmuo asm = new Asmuo("Jonas", "Petraitis", "5767547667");
		
		System.out.println( asm.findAllMatchesByName(sarasas));
		
		
		
		
		
		
	}
	
	public static void uzduotis5() {
		LinkedList<String> myList = new LinkedList<>();
		myList.push( "Ford" ); // adds element at front
		myList.add( "Audi" );  // add element at end
		myList.push( "Dodge" );
		myList.add( "Jaguar" );
		
		System.out.println( myList.peek() + " .peek()" ); // 
		System.out.println( myList.peekFirst() + " .peekFirst()" ); // retrieves first element
		System.out.println( myList.peekLast() + " .peekLast()\n" ); // retrieves last element
		System.out.println( myList + " - List After Peek Hasn't Changed\n" );
		
		System.out.println( myList.poll() + " .poll()" ); // retrieves and deletes first element
		System.out.println( myList.pollFirst() + ".pollFirst" ); // retrieves and deletes first element
		System.out.println( myList.pollLast() + " .pollLast\n"); // retrieves and deletes last element
		System.out.println( myList + " - List After Poll has been changed\n");
		
		myList.add( "Jaguar" );
		myList.add( "Ford" );
		myList.add( "Dodge" );
		
		System.out.println( myList + " - List After Adding Items\n");
		
		String firstEl = myList.peek();	
		String lastEl = myList.peekLast();
		firstEl = myList.poll();
		lastEl = myList.pollLast();
		
		System.out.println( myList + " - List After Using Poll to get First And Last Elements\n");
		
		myList.push(lastEl); // adding last element to the front of the list
		myList.add(firstEl); // adding first element to the back of the list
		
		System.out.println( myList + " - List After Adding First And Last Elements\n");
		
	
	}
	

}
