package paskaita11_10_Uzduotis4;

public class Main {

	public static void main(String[] args) {
		Figura a = new Apskritimas();
		Figura b = new Kvadratas();
		
		System.out.println( a.gautiPlota( 300 ) );
		System.out.println( b.gautiPlota( 5 ) );
		
		System.out.println( a.gautiPerimetra( 300 ) );
		System.out.println( b.gautiPerimetra( 5 ) );

	}

}
