import java.util.Random;
import java.util.Scanner;

public class TreciaPaskaita {

	public static void whileLoop() {

		// Atspaudinti skaiciu nuo 0 iki 5

		int i = 0;

		while (i <= 5) {
			System.out.println(i++);
		}
		while (i > 1) {
			i--;
			System.out.println("Labas Rytas");
		}

		i = 0;

		while (i <= 20) {
			System.out.println(i);
			i += 2;
		}

		i = 0;

		do {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		} while (i <= 20);

	}

	public static void forLoop() {

		for (int i = 1; i < 25; i++) {

			if (i % 5 == 0) {
				break;
			}
			// atliekam veiksmus
			// logika
			// kreipimasis i metodus
			// break;
			// continue;
			System.out.println(i);
		}

		int i = 1;
		for (; i < 25;) {

			if (i % 5 == 0) {
				break;
			}
			// atliekam veiksmus
			// logika
			// kreipimasis i metodus
			// break;
			// continue;
			System.out.println(i);
			i++;
		}

	}

	public static void forEachLoop() {

		String a = "Sveiki";

		System.out.println(a);

		for (char c : a.toCharArray()) {
			System.out.println(c);
		}

	}

	public static void doWhile() {

		int i = 0;

		do {
			System.out.println(i);
			i++;
		} while (i < 5);
//---------------------------------------
		System.out.println("-------------------------");

		int j = 0;

		while (j < 5) {
			System.out.println(j);
			j++;
		}

	}

	public static void scanner() {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = sc.nextLine();
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		System.out.println("Your name is: " + name + " and you are " + age + " years old.");
		
		sc.close();

	}
	
	public static void random() {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int a = rnd.nextInt(0,11);
		
		System.out.println("Guess the number from 0 to 10");
		
		while(true) {
			int n = sc.nextInt();
			
			if(n == a) {
				System.out.println("Congratulations You Have Guessed it");
				break;
			}
			System.out.println("Sorry, Try Again");
			
		}
	}
	
	public static void arrays() {
		
		int[] intArray = {1,3,5,7};
		int[] intArray2 = new int[4];
		float[] floatArray = new float[1];
		
		intArray[0] = 4;
		
		String[] miestai = {"Kaunas", "Vilnius", "Klaipeda"};
		
		int number = intArray[2];
		
		System.out.println(number);
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		
		for(int n : intArray) {
			System.out.println(n);
		}
		
	}

}
