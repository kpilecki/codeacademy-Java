package paskaita21_10.nestedLoops;

public class TimeTable {
	
	public static void printTimeTable( int size ) {
		printHeader( size );
		
		for( int i = 1; i <= size; i++) {
			System.out.printf( "%2d |", i);
			
			for(int j = 1; j <= size; j++) {
				System.out.printf( "%4d", j * i );
			}
			System.out.println();
		}
	}
	
	private static void printHeader( int size ) {
		System.out.print( " * |" );
		
		for( int i = 1; i <= size; i++) {
			System.out.printf( "%4d", i );
		}
		
		System.out.println();
		
		for( int i = 0; i <= size; i++) {
			System.out.print( "----" );
		}
		
		System.out.println();
	}
}
