package pirmasJavaProjektas;

import java.util.Random;

public class NamuDarbas {

	public static boolean uzduotis1(int[] arr) {
		// 1) Gauna skaiciu masyva. Grazina true, jei visi skaiciai eina is eiles.

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] + 1 != arr[i + 1]) {
				return false;
			}
		}
		return true;
	}

	public static boolean uzduotis2(int num) {
		// 2) Gauna skaiciu. Grazina true, jei skaicius pirminis (prime number)

		for (int i = 2; i < Math.abs(num); i++) {
			if (num % 2 == 0) {
				return false;
			}
		}
		return true;
	}

	public static String uzduotis3(String in) {
//		3) Gauna sakini. Grazina sakini, su is kitos puses sudetais zodziais
//		pvz. "Lietuvoje gera gyventi" -> "gyventi gera Lietuvoje"
		
		String result = "";

		for (String word : in.split(" ")) {
			result = word.concat(" ").concat(result);
		}
		return result.trim();
	}
	
	public static String uzduotis3ReverseEachLetter(String in) {
//		3) Gauna sakini. Grazina sakini, su is kitos puses sudetais zodziais
//		pvz. "Lietuvoje gera gyventi" -> "gyventi gera Lietuvoje"
		
		String rez = "";
		
		for(char c : Utils.reverseArr(in.toCharArray())) {
			rez = rez.concat(String.valueOf(c));
		}
		return rez.trim();
	}
	
	public static String uzduotis3ReverseWords(String in) {
//		3) Gauna sakini. Grazina sakini, su is kitos puses sudetais zodziais
//		pvz. "Lietuvoje gera gyventi" -> "gyventi gera Lietuvoje"
		
		String rez = "";
		
		for(String word : Utils.reverseArr(in.split(" "))) {
			rez = rez.concat(word).concat(" ");
		}
		return rez.trim();
	}

	public static int getRowIndex(String str) {
//		getRowIndex(String str) Gauna String, kaip sachmatu koordinates,
//		su dviem simboliais, kur pirmas gali buti tik simbolis nuo A iki H, 
//		antras - skaicius nuo 1 iki 8.
//		Grazina skaiciu nuo 0 iki 7. Priklausomai nuo raides.

		return Integer.valueOf(str.toUpperCase().charAt(0)) - 65;
	}

	public static int getColIndex(String str) {
//		getColIndex(String str) Tas pats kaip 4) tik grazina antra
//		koordinate sumazinta vienetu.

		return str.length() > 1 ? Integer.valueOf(str.substring(1)) - 1 : 0;
	}

	public static String uzduotis5(String str) {
		
		for (char c : str.toCharArray()) {
			String temp = String.valueOf(c).concat(String.valueOf(c));
			while (str.contains(temp)) {
				str = str.replace(temp, String.valueOf(c));
			}
		}
		return str.trim();
	}

	public static char uzduotis6(char[] arr) {
//		 Gauna char masyva. Dauguma raidziu eina is eiles,
//		 bet vienos truksta. Surasti ir grazinti pirma trukstama raide.

		for (int i = 0; i < arr.length - 1; i++) {
			int curr = arr[i];
			int next = arr[i + 1];

			if (next - curr > 1) {
				return (char) (curr + 1);
			}
		}
		return '-';
	}

	public static boolean uzduotis7(String from, String to) {
//		 Sachmatu lenta. Viena figura - rikis. Tikrinam ar gali
//		 rikis eiti is nurodyto langelio i nurodyta langeli. Metodas 
//		 gauna du string 
//		 pvz. ("C1", "H6") -> true
//		 Rikis gali eiti tik istrizai.

		int skirtumasCol = Math.abs(getColIndex(from) - getColIndex(to));
		int skirtumasRow = Math.abs(getRowIndex(from) - getRowIndex(to));

		return skirtumasCol == skirtumasRow;
	}

	public static boolean uzduotis8(String in) {
//		 Gauna eilute. Grazina true, jei visos raides didziosios. Kitu atveju false.
		for (char c : in.toCharArray()) {
			if ((int) c < 41 || (int) c > 90) {
				return false;
			}
		}
		return true;
	}

	public static int uzduotis9(int[] arr) {
//		 Gauna skaiciu masyva, suskaiciuoja kiek skaiciu yra pirminiu.
//		 (galima naudoti metoda is 2 uzduoties)
		int temp = 0;

		for (int number : arr) {
			if (uzduotis2(number)) {
				temp++;
			}
		}
		return temp;
	}

	public static int[][] uzduotis10() {
		int[][] temp = new int[8][8];
		int value = 0;

		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i].length; j++) {
				temp[i][j] = value;
				value = value == 1 ? 0 : 1;	
			}
			value = value == 1 ? 0 : 1;
		}
		return temp;
	}

	public static boolean uzduotis11(int num) {

		String temp = String.valueOf(num);
		String rez = "";

		for (int i = temp.length() - 1; i > -1; i--) {
			rez = rez.concat(String.valueOf(temp.charAt(i)));
		}

		return Integer.valueOf(rez) == num ? true : false;
	}

	public static int[][] uzduotis12() {
		int[][] temp = new int[8][8];
		Random gen = new Random();

		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp[i].length; j++) {
				temp[i][j] = gen.nextInt(0, 10);
			}
		}
		return temp;
	}

	public static boolean uzduotis13(int[][] arr, String cord1, String cord2) {
		int val1 = arr[getRowIndex(cord1)][getColIndex(cord1)];
		int val2 = arr[getRowIndex(cord2)][getColIndex(cord2)];

		return val1 > val2 ? true : false;
	}

	public static boolean uzduotis14(String from, String to, char restriction) {
//		14) Sachmatu lenta. Valdove gali eiti tik horizontaliai,
//		vertikaliai arba istrizai. Patikrinti ar pagal galimas koordinates,
//		galimas ejimas. 
//		pvz. ("H6", "C1") -> true
//		
		switch (restriction) {
		case 'H':
		case 'h':
			return getRowIndex(from) == getRowIndex(to);

		case 'V':
		case 'v':
			return getColIndex(from) == getColIndex(to);
		case 'I':
		case 'i':
			return uzduotis7(from, to);
		}
		return false;
	}

	
	private static int[] stringToIntArr(String in) {
		char[] charArr = in.toCharArray();
		int[] intArr = new int[charArr.length];

		for (int i = 0; i < charArr.length; i++) {
			intArr[i] = Integer.valueOf(String.valueOf(charArr[i]));
		}
		return intArr;	
	}
	
	private static boolean asmKodasLastDigitCheck(String asmKodas) {
		int[] intArr = stringToIntArr(asmKodas);
		int sum = 0;
		sum += intArr[intArr.length - 2];

		for (int i = 0; i < intArr.length - 2; i++) {
			sum += (i + 1) * intArr[i];
		}
		if (sum % 11 == intArr[intArr.length - 1]) {
			return true;
		} else {
			sum = intArr[intArr.length - 3] + intArr[intArr.length - 2];

			for (int i = 0; i < intArr.length - 3; i++) {
				sum += (i + 3) * intArr[i];
			}
			if (sum % 11 == intArr[intArr.length - 1] || (sum % 11 == 10 && intArr[intArr.length - 1] == 0)) {
				return true;
			}
		}
		return false;
	}

	private static String[] asmKodasFirstDigit(int digit) {
		switch(digit) {
		case 1:
			return new String[] {"Vyras", "18"};
		case 2:
			return new String[] {"Moteris", "18"};
		case 3:
			return new String[] {"Vyras", "19"};
		case 4:
			return new String[] {"Moteris", "19"};
		case 5:
			return new String[] {"Vyras", "20"};
		case 6:
			return new String[] {"Moteris", "20"};
		}
		return new String[] {"", ""};
	}
	
	public static boolean asmKodasCheck(String asmKodas) {
		if( asmKodas.length() == 11 
				&& Integer.valueOf(asmKodas.substring(0, 1)) > 0
				&& Integer.valueOf(asmKodas.substring(0, 1)) < 7
				&& Integer.valueOf(asmKodas.substring(3, 5)) < 12
				&& Integer.valueOf(asmKodas.substring(3, 5)) > 0
				&& Integer.valueOf(asmKodas.substring(5, 7)) < 31
				&& asmKodasLastDigitCheck(asmKodas)) {
			String message = asmKodasFirstDigit(Integer.valueOf(asmKodas.substring(0, 1)))[0]
					+ " Gimimo data:"
					+ asmKodasFirstDigit(Integer.valueOf(asmKodas.substring(0, 1)))[1]
					+ asmKodas.substring(1, 3)
					+ "-"
					+ asmKodas.substring(3, 5)
					+ "-"
					+ asmKodas.substring(5, 7);
			System.out.println(message);
			
			return true;
		}
		System.out.println("Neteisingas Asmens Kodas");
		return false;
	}
	
	
	
	public static String sutvarkyti(String in) {

		for (int i = 0; i < in.length(); i++) {
			String doubleChar = String.valueOf(in.charAt(i))
					.concat(String.valueOf(in.charAt(i)));

			while (in.contains(doubleChar)) {
				in = in.replace(doubleChar, String.valueOf(in.charAt(i)));
			}
		}
		return in.trim();
	}
	
	public static String removeDuplicates(String in) {
		if(in.length() < 2) {
			return in;
		}
		
		String rez = in.substring(0,1);
		
		for(int i = 1; i < in.length(); i++) {
			if(rez.charAt(rez.length() -1) != in.charAt(i)) {
				rez = rez.concat(String.valueOf(in.charAt(i)));
			}
		}
		
		return rez.trim();
	}

}
