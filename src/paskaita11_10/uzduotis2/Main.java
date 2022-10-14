package paskaita11_10.uzduotis2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Studentas studentas = new Studentas("John", "Snow");
		studentas.spausdinkInformacija();
		
		Destytojas destytojas = new Destytojas("John", "Wick");
		destytojas.spausdinkInformacija();
		
		System.out.println( studentas );
		System.out.println( destytojas );
		
		ArrayList<Asmuo> arr = new ArrayList<>();
		arr.add( destytojas );
		arr.add( studentas );
//		arr.add( new Studentas("John", "Snow") );
		
		System.out.println( Utils.checkUnique( arr ) );
	}

}
