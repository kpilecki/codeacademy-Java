package Paskaita06_10;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> strList = new ArrayList<>();
		strList.add("Dodge");
		strList.add("Chevrolet");
		strList.add("Audi");
		strList.add("Peugeot");
		strList.add("Citroen");
		strList.add("Dodge");
		strList.add("Citroen");
		
		
//		Medziaga.stringFormat();
//		Medziaga.regexMedziaga();
//		Medziaga.collectionsMedziaga();
//		UzduotysArrayList.uzduotis1();
//		UzduotysArrayList.uzduotis2(strList);
		System.out.println(UzduotysArrayList.uzduotis3(strList));
	}

}
