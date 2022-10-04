import java.util.Scanner;

public class Uzduotys {
	public static void uzduotisFloat() {

		int a = 10;
		int b = 2;

		a++;
		b--;

		float rez = a * (b / 5f);

		System.out.println("*********************************");
		System.out.println("uzduotis nr. 1");
		System.out.println("---------------------------------");
		System.out.println(rez);
		System.out.println("*********************************");

	}

	public static void uzduotis2() {
		String s = "Mano vardas Ksistof Pileckij";

		System.out.println("*********************************");
		System.out.println("uzduotis nr. 2");
		System.out.println("---------------------------------");
		System.out.println(s.substring(12));
		System.out.println(s.substring(0, 4));
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.replace('a', 'u'));
		for (int i = 0; i < s.length(); i += 3) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println("*********************************");

	}

	public static void uzduotis3() {

		String vardas = "kSiStOF";

		System.out.println("\n***************---Uzduotys 3 ------******************");
		System.out.println(vardas + "\n");
		System.out.println(vardas.substring(0, 1).toUpperCase() + vardas.substring(1).toLowerCase());
		System.out.println((char) (vardas.charAt(0) - 32) + vardas.substring(1).toLowerCase());

		System.out.println("\n*********************************");

	}

	public static void uzduotis4(int metai) {

		System.out.println("\n***************---Uzduotys 4 ------******************");
		/*
		 * if(metai >= 20 && metai <= 90) { System.out.println("Galima"); } else {
		 * System.out.println("Negalima");}
		 */
		System.out.println(metai >= 20 && metai <= 90 ? "Galima" : "Negalima");

		System.out.println("\n*****************************************************");

	}

	public static boolean uzduotis5(String a, String b) {

		return a.substring(a.length() - 2).equals(b.substring(b.length() - 2));

	}

	public static int uzduotis6(int a) {

		return a < 0 ? String.valueOf(a * (-1)).length() : String.valueOf(a).length();

	}

	public static int uzduotis6_2(int a) {

		int length = 0;

		if (a < 0)
			a *= -1;

		while (a > 0) {
			length++;
			a /= 10;
		}

		return length;

	}

	public static void uzduotis7() {

		String a = "Namai";

		a = a.replace("s", "i");
		System.out.println(a);

		a = a.toUpperCase();
		System.out.println(a);

		a = a.substring(3, a.length() - 2);
		System.out.println(a);
	}

	public static void uzduotis8() {

		for (int i = 0; i <= 30; i += 3) {
			System.out.println(i);
		}
	}

	public static void uzduotis9() {
		String s = "*";

		for (int i = 0; i < 10; i++) {
			System.out.println(s);
			s = s.concat("*");
		}
//-------------------------------------------

		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//-----------------------------------------
		for (int i = 0; i < 10; i++) {
			System.out.println("*".repeat(i));
		}

//-----------------------------------------
		for (String i = "*"; i.length() < 10; i += "*") {
			System.out.println(i);
		}

	}

	public static void uzduotis10() {

		Scanner sc = new Scanner(System.in);
		int a = 0;

		while (a >= 0) {
			System.out.println("Enter a number:");
			a = sc.nextInt();
		}

		System.out.println("The Program Has Stopped");

		sc.close();
	}

	public static void uzduotis10_1() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number:");

		while (sc.nextInt() >= 0) {
			System.out.println("You have entered a positive number");
			System.out.println("Enter another number:");
		}

		System.out.println("You have entered a negative number so the program has stopped");

		sc.close();
	}

	public static void uzduotisArrays() {
		int[] intArray = { 1, 2, 3, 4, 5 };

		for (int i = intArray.length - 1; i >= 0; i--) {
			System.out.println(intArray[i]);
		}
	}

	public static void uzduotisArrays2() {
		int[] intArray = { 0, 1, 2, 3, 4, 5, 6, 7, 9, 10, 11 };

		for (int i = 0; i < intArray.length; i++) {

			if (i % 2 != 0) {

				System.out.println(intArray[i]);
			}
		}
	}

	public static void uzduotisArrays3() {
		int[] intArray = { 0, 1, 2, 3, 4, 5, 6, 7, 9, 2, 11 };

		for (int i = 0; i < intArray.length; i++) {

			if (intArray[i] % 2 == 0) {

				System.out.println(intArray[i]);
			}
		}
	}

	public static void uzduotisArrays4() {
		int[] intArray = { 0, 1, 2, 3, 4, 5, 6, 7, 9, 2, 11 };

		for (int i = 0; i < intArray.length; i++) {

			for (int j = i + 1; j < intArray.length; j++) {

				if (intArray[j] == intArray[i]) {

					System.out.println(intArray[j]);
				}
			}
		}
	}

	public static void uzduotisArrays5() {
		int[] intArray = { 0, 1, 2, 3, 4, 5, 6, 7, 9, 2, 11 };
		int sum = 0;
		for (int i = 0; i < intArray.length; i++) {

			sum += intArray[i];
		}

		System.out.println(sum);
	}

	public static void uzduotisArrays6() {
		int[] intArray = { 0, 1, 2, 3, 4, 5, 6, 7, 9, 2, 11 };
		int sum = 0;
		for (int i = 0; i < intArray.length; i++) {

			sum += intArray[i];
		}

		System.out.println(sum / (float) intArray.length);
	}

	public static void uzduotisArrays7() {
		int[] intArray = { 0, 1, 2, 3, 4, 5, -1, 6, 7, 9, 2, 11, 22, 3, 9, 43 };
		int currMax = Integer.MIN_VALUE;

		for (int i = 0; i < intArray.length; i++) {

			if (currMax < intArray[i]) {
				currMax = intArray[i];
			}
		}

		System.out.println(currMax);
	}

	public static void uzduotisArrays8() {
		int[] intArray = { 0, 1, -72, 346, 4, 5, -1, 65, 7, 9, 2, 11, 22, 3, 9, 43 };
		int currMin = Integer.MAX_VALUE;

		for (int i = 0; i < intArray.length; i++) {

			if (currMin > intArray[i]) {
				currMin = intArray[i];
			}
		}

		System.out.println(currMin);
	}

	public static void uzduotisArrays9() {
		int[] intArray = { 0, 1, -72, 346, 4, 5, -1, 65, 7, 9, 2, 11, 22, 3, 9, 43 };
		int currMin = Integer.MAX_VALUE;
		int i = 0;

		while (i < intArray.length) {

			if (currMin > intArray[i]) {
				currMin = intArray[i];
			}
			i++;
		}

		System.out.println(currMin);
	}

	public static void uzduotisArrays10() {
		int[] intArray = { 0, 1, -72, 346, 4, 5, -1645, 65, 7, 9, 2, 11, 22, 3, 9, 43 };
		int currMin = Integer.MAX_VALUE;

		for (int el : intArray) {

			if (currMin > el) {
				currMin = el;
			}
		}

		System.out.println(currMin);
	}

	public static int[] uzduotisArrays11(int[] array) {
		int max = Integer.MIN_VALUE;
		int maxP = 0;

		int min = Integer.MAX_VALUE;
		int minP = 0;

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
				maxP = i;
			}
			if (min > array[i]) {
				min = array[i];
				minP = i;
			}
		}

		int temp = array[0];
		array[0] = array[minP];
		array[minP] = temp;

		if (maxP == 0) {
			maxP = minP;
		}

		temp = array[array.length - 1];
		array[array.length - 1] = array[maxP];
		array[maxP] = temp;

		return array;
	}

	public static int[] uzduotisArraysBubble(int[] array) {
		boolean sorted = false;

		while (!sorted) {
			sorted = true;
			for (int i = 0; i < array.length - 1; i++) {

				if (array[i] > array[i + 1]) {

					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					sorted = false;
				}
			}
		}

		return array;
	}

}
