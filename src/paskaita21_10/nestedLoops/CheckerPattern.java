package paskaita21_10.nestedLoops;

public class CheckerPattern {

	public static void printCheckerPattern( int size ) {
		
		for( int i = 0; i < size; i++) {
			if( i % 2 != 0 ) {
				System.out.print(" ");
			}
			for(int j = 0; j < size; j++) {
				System.out.print( "# " );
			}
			System.out.println();
		}
	}
}
