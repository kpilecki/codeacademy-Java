package paskaita11_10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class Medziaga {

	public static void inheritancePrint() {
		BasicCalculator bc = new BasicCalculator();
		Calculator calc = new Calculator();
		
		int sk1 = 5;
		int sk2 = 7;
		
		System.out.println( bc.prideti(sk1, sk2) );
		System.out.println( bc.atimti(sk1, sk2) );
		
		System.out.println( calc.prideti(sk1, sk2) );
		System.out.println( calc.atimti(sk1, sk2) );
		System.out.println( calc.sudaugint(sk1, sk2) );
		System.out.println( calc.dalinti(sk1, sk2) );
		
	}
	
	public static void inheritancePrint2() {
		Asmuo asm = new Asmuo();
		asm.pasisveikinti();
		
		Studentas st = new Studentas();
		st.pasisveikinti();
		
		Darbuotojas darb = new Darbuotojas();
		darb.pasisveikinti();
		
		ImonesXDarbuotojas imXDarb = new ImonesXDarbuotojas();
		imXDarb.pasisveikinti();

	}
	
	public static void inheritancePrint3() {
		ArrayList<Asmuo> asmenys = new ArrayList<>();
		
		asmenys.add( new Studentas("A", "B", "C", "D") );
		asmenys.add( new Darbuotojas("A", "B", "C", "D") );
		asmenys.add( new Asmuo("A", "B", "C") );
		
		Asmuo nezinomas = asmenys.get(1);
		
		if( nezinomas instanceof Studentas) {
			System.out.println( "Objektas yra studentas" );
			Studentas studentas = (Studentas) nezinomas;
			studentas.pasisveikinti();
			
		} else if ( nezinomas instanceof Darbuotojas) {
			System.out.println( "Objektas yra darbuotojas");
			Darbuotojas darbuotojas = (Darbuotojas) nezinomas;
			darbuotojas.pasisveikinti();
			
		} else if( nezinomas instanceof ImonesXDarbuotojas) {
			System.out.println( "Objektas yra ImonesXDarbuotojas");
			ImonesXDarbuotojas imonesXDarbuotojas = (ImonesXDarbuotojas) nezinomas;
			imonesXDarbuotojas.pasisveikinti();
		}
		
//		
//		
//		asmenys.get(0).pasisveikinti();
//		asmenys.get(1).pasisveikinti();
//		asmenys.get(2).pasisveikinti();
//		
//		System.out.println( asmenys.get(0).getClass() );
//		System.out.println( asmenys.get(1).getClass() );
//		System.out.println( asmenys.get(2).getClass() );
//
//		asmenys.stream().forEach( asm -> {
//			System.out.println( asm );
//		});
	}

	public static void inheritancePrint4() {
		ArrayList<Asmuo> asmenys = new ArrayList<>();

		asmenys.add(new Studentas("A", "B", "C", "D"));
		asmenys.add(new Darbuotojas("A", "B", "C", "D"));
		asmenys.add(new Asmuo("A", "B", "C"));
		
		Calculator calc = new Calculator();
		
		System.out.println("Printing ArrayList");
		calc.spausdink( asmenys );
		
		LinkedList<Asmuo> asmenys2 = new LinkedList<>();

		asmenys2.add(new Studentas("A", "B", "C", "D"));
		asmenys2.add(new Darbuotojas("A", "B", "C", "D"));
		asmenys2.add(new Asmuo("A", "B", "C"));
		
		System.out.println("Printing Linked List");
		calc.spausdink( asmenys2 );
		
		HashMap<Integer, Asmuo> asmMap = new HashMap<>();
		asmMap.put( 1 , new Studentas("A", "B", "C", "D") );
		asmMap.put( 2, new Darbuotojas("A", "B", "C", "D") );
		asmMap.put( 3, new Asmuo("A", "B", "C") );
		
		System.out.println("Printing Map");
		calc.spausdink( asmMap );
		

	}
}
