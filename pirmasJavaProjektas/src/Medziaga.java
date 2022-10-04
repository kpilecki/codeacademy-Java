
public class Medziaga {

	static private int number1 = 1;
	static private int number2 = 2;

	public static void medziagaPrint() {
		System.out.print("Sveiki!!!");
		System.out.println();
		System.out.println("*********************************");

		System.out.println("Hello World!!!");
		System.out.println("*********************************");

		System.out.println("Sum Of Two Numbers is:" + number1 + number2);
		System.out.println("*********************************");

		System.out.println("Sum Of Two Numbers is:" + (number1 + number2));
		System.out.println("*********************************");

		secondMethod(5, 8);
		System.out.println("*********************************");

		Figura.addTwoNumbers(10, 56);
		Figura fig = new Figura();
		fig.pasisveikink();

		char x = 'A';
		char y = 'B';
		char z = 'C';

		System.out.println("*********************************");
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("z: " + z);
		System.out.println("*********************************");

		System.out.println("*********************************");
		System.out.println("char sequence " + x + y + z);
		System.out.println(x + " " + y + " " + z);
		System.out.println("*********************************");

		System.out.println("*********************************");
		System.out.println("With Spaces");
		System.out.print(x);
		System.out.print(" " + y);
		System.out.print(" " + z);
		System.out.println();

		System.out.println("*********************************");
		System.out.println();
		System.out.println("Without Spaces");
		System.out.print(x);
		System.out.print(y);
		System.out.print(z);
		System.out.println();
		System.out.println("*********************************");
		
		System.out.println("**************--Strings--*******************");
		
		String miestas = "Vilnius";
		
		char raide4 = 'i';
		
		var indeksas = miestas.indexOf(raide4);
		
		System.out.println("miestas.indexOf('i'): " + indeksas);
		System.out.println("miestas.lastIndexOf('i'): " + miestas.lastIndexOf(raide4));
		System.out.println("miestas.indexOf('i'): " + miestas.indexOf(raide4 , miestas.indexOf(raide4)));
		
		char raide = miestas.charAt(1);
		
		System.out.println(miestas);
		System.out.println("charAt(0): " + miestas.charAt(0));
		System.out.println("charAt(1): " + raide);
		
		var kintamasis = miestas.concat(" grazus miestas");
		
		System.out.println("Concat: " + kintamasis);
		
		String zodis = "mama";
		
		String zodis2 = zodis.replace('m', 'b');
		
		System.out.println(zodis);
		System.out.println(zodis2);
		System.out.println("Zodis.length(): " + zodis.length());
		System.out.println("Miestas.length(): " + miestas.length());
		System.out.println("Miestas.substring(3): " + miestas.substring(3));
		System.out.println("Miestas.substring(0,3): " + miestas.substring(0,3));
		
		
		System.out.println("**************--Strings End--*******************");
		

	}

	static void secondMethod(int a, int b) {
		System.out.println("Sum Of Two Numbers Equals:" + (a + b));

	}
}
