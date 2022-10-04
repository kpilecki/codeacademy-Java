
public class AntraPaskaita {

	public static void antraPaskaitaPrint() {

		String zodis1 = "AAA";

		String zodis2 = "ABB";

		int b = zodis1.compareToIgnoreCase(zodis2);

		boolean a = "Trys" == zodis1;

		String zodis3 = "   text   ";

		String beTarbuGaluose = zodis3.trim();

		String sujungtasString = zodis1.concat(zodis2).concat(zodis3);
		sujungtasString += zodis2;
		sujungtasString += zodis3;

		String toUpperCase = sujungtasString.toUpperCase();
		String toLowerCase = sujungtasString.toLowerCase();

		System.out.println("\n******************---Antra Paskaita ----- *********************");

		System.out.println(b + "\n");
		System.out.println(a + "\n");
		System.out.println(zodis3 + "\n");
		System.out.println(beTarbuGaluose + "\n");
		System.out.println(sujungtasString + "\n");
		System.out.println(toUpperCase + "\n");
		System.out.println(toLowerCase + "\n");

		System.out.println("\n------------------ Parse Int To String And Vice Versa ------------------------");

		String skaiciai1 = "123";
		String skaiciai2 = "321";

		int skaicius = Integer.parseInt(skaiciai1);

		int skaicius2 = Integer.parseInt(skaiciai2);

		String sum = String.valueOf(skaicius + skaicius2);

		int number = 2345;
		number++;

		System.out.println(skaiciai1 + skaiciai2);
		System.out.println("Sum : " + sum);
		System.out.println("Integer to String: " + number);
		System.out.println("Integer to String: " + String.valueOf(number));
		System.out.println("Integer to String: " + Integer.toString(number));

		System.out.println("\n***************************************");

		System.out.println("\n------------------ String Contains ------------------------");

		String s = "Mano batai buvo du";

		System.out.println(s.contains("du"));
		System.out.println(s.contains("tris"));

		System.out.println("\n***************************************");

		/*
		 * 2^8 = 256 1byte 2^10 = 1024 - 1kbyte
		 * 
		 * 000 - 1 001 - 2 010 - 3 011 - 4 100 - 5 101 - 6 111 - 7
		 * 
		 * HEX 0123456789ABCDEF
		 * 
		 * 2^8 = 256 1byte - FF
		 * 
		 */

		System.out.println("\n------------------ Log operatoriai ! == != && & || | ^ ------------------------");
		// ^ Exclusive or True if Only one is true
		// && and
		// || or
		
		System.out.println(!true);
		System.out.println(true && false);
		System.out.println(false || false);
		System.out.println(false ^ true);
		
		
		System.out.println("\n***************************************");
		
		System.out.println("\n------------------ If Else While Switch Ternary ------------------------");
		
		String batai = "Mano batai buvo du";

		if(batai.contains("tris")) {
			System.out.println("Taip, toks zodis yra");
		} else {
			System.out.println("Sorry, tokio zodzio nera");
		}
		System.out.println("\n-------------------------------------");
		
		int skaicius1 = -10;
		int daliklis = 5;
		boolean salyga1 = skaicius1 % daliklis == 0 ; // ar dalinasi
		System.out.println(salyga1 + " salyga1");
		boolean salyga2 = skaicius1 >= 0; //ar teigiamas
		System.out.println(salyga2 + " salyga2");
		
		
		
		if(salyga1 || salyga2) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		if(skaicius1 % daliklis == 0) {
			System.out.println("Dalinasi");
		} else {
			System.out.println("Nesidalina");
		}
		
		System.out.println(salyga1 || salyga2 ? "True" : "False");
		
		int metai = 26;
		boolean salyga = metai <= 90 && metai >= 20;
		String pranesimas = salyga ? "Galima uzeiti" : "Negalima uzeiti";
		
		
		System.out.println(pranesimas);
		
		int ageOfCar = 2;
		
		if(ageOfCar < 3) { // 4000
			 
		} else if(ageOfCar > 3 && ageOfCar < 7) { // 3000
			
		} else if(ageOfCar > 7 && ageOfCar < 10) { // 1000
			
		}
		
		boolean ageSalyga = ageOfCar < 3;
		boolean ageSalyga2 = ageOfCar < 7;
		boolean ageSalyga3 = ageOfCar < 10;
		
		switch(ageOfCar) {
		case 0: case 1: case 2:
		case 3: 
			System.out.println("Kompensacija 4000");
			break;
		case 4: case 5: case 6:
			System.out.println("Kompensacija 3000");
			break;
		case 7: case 8: case 9: 
			System.out.println("Kompensacija 3000");
			break;
		default:
			System.out.println("Kompensacijos nera");
		
		}
		
		String pranesimas1 = ageSalyga ? "4000" 
				: ageSalyga2 ? "3000"
						: ageSalyga3 ? "1000"
								: "0";
		System.out.println("\nKompensacija " + pranesimas1);
		System.out.println("\n*---------------------------------------------------");
		
		int diena = 2;
		
		switch(diena){
			case 1:
				System.out.println("Pirmadienis");
				break;
			case 2:
				System.out.println("Antradienis");
				break;
			case 3:
				System.out.println("Treciadienis");
				break;
			case 4:
				System.out.println("Antradienis");
				break;
		}
		
		
		System.out.println("\n***************************************");

	}

}
