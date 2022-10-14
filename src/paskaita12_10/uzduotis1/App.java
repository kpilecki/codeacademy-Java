package paskaita12_10.uzduotis1;


public class App {

	public static void main(String[] args) {
		TeigiamasSkaicius tSk = new TeigiamasSkaicius();
		run( tSk );

		LyginisSkaicius lSk = new LyginisSkaicius();
		run( lSk );

		NelyginisSkaicius nelygSk = new NelyginisSkaicius();
		run( nelygSk );

		NeigiamiSkaiciai neigSk = new NeigiamiSkaiciai();
		run( neigSk );
	}
	
	public static void run( Skaicius sk ) {
		sk.generuok();
		System.out.println( sk.suma() );
//		sk.printArr();
	}

}
