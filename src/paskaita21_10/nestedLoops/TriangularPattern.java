package paskaita21_10.nestedLoops;

public class TriangularPattern {
	
	public static void printTriangularPatternA( int size ) {
		
		for(int i = 0; i <= size; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print( "# " );
			}
			System.out.println( "\n ");
		}
	}
	
	public static void printTriangularPatternB( int size ) {
		
		for(int i = 0; i <= size; i++) {
			for(int j = 0; j <= size - i; j++) {
				System.out.print( "# " );
			}
			System.out.println( "\n ");
		}
	}
	
	public static void printTriangularPatternC( int size ) {
		
		for(int i = 0; i <= size; i++) {
			for(int j = 0; j <= size; j++) {
				if( j < i ) {
					System.out.print( "  " );
				} else {
					System.out.print( "# " );
				}
			}
			System.out.println( "\n" );
		}
	}
	
	public static void printTriangularPatternD( int size ) {
		
		for(int i = 0; i <= size; i++) {
			for(int j = 0; j <= size; j++) {
				if( j < size - i ) {
					System.out.print( "  " );
				} else {
					System.out.print( "# " );
				}
			}
			System.out.println( "\n" );
		}
	}
}
