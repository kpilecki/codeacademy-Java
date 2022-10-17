package paskaita17_10.uzduotis1;

public class Main {

	public static void main(String[] args) {
		Adresas adr = new Adresas( new Miestas( "Vilnius "), new Gatve( "gatve", 12) );
		
		System.out.println( adr );

	}

}
