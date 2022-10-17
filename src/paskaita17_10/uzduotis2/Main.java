package paskaita17_10.uzduotis2;

public class Main {

	public static void main(String[] args) {
		Koordinate kord = new Koordinate( 10 );
		Koordinate kord2 = new Koordinate( 5 );
		
		System.out.println( kord2 );
		System.out.println( kord2 );
		System.out.println( "Distance: " + kord.getDistance( kord2 ));
		
		Koordinate2D kord2D = new Koordinate2D( 10, 10);
		Koordinate2D kord2D2 = new Koordinate2D( 5, 5);
		
		System.out.println( kord2D );
		System.out.println( kord2D2 );
		System.out.println( "Distance: " + kord2D.getDistance( kord2D2));
		
		Koordinate3D kord3D = new Koordinate3D( 10, 10, 10);
		Koordinate3D kord3D2 = new Koordinate3D( 5, 5, 5);
		
		System.out.println( kord3D );
		System.out.println( kord3D2 );
		System.out.println( "Distance: " + kord3D.getDistance( kord3D2 ));

	}

}
