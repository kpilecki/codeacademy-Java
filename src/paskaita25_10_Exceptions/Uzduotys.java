package paskaita25_10_Exceptions;

public class Uzduotys {
	private static String message = "Message from finally block";
	
	public static void printUpper( String tekstas ) {
		try {
			System.out.println( tekstas.toUpperCase() );
		} catch ( Exception e ) {
			throw new BestException( "Musu message" );
		}
	}
	
	public static void checkExceptionPropagation() {
		int y = 43; 								// variable outside try block
		try {
			int x = 0; 								// declaring variable in try block
			printUpper( null );
			y =65; 									// y value will newer change since this line won't execute
		} catch ( BestException e ) {
			System.out.println( e.getMessage() );
			throw e;
		} finally {
			System.out.println( message );
			System.out.println( y ); 				// variable y is visible in finally block
//			System.out.println( x );				// variable x is not visible in finally block
			
		}
	}
	
	public static void printUpper2( String tekstas ) {
		if( tekstas == null ) {
			throw new BestException( "Tekstas cannot be null" );
		}
		System.out.println( tekstas.toUpperCase() );
	}
	
	public static void printUpper3( String tekstas ) {
		try {
			System.out.println( tekstas.toUpperCase() );
		} catch ( Exception e ) {
			throw new NullPointerException( "Tekstas is null" );
		}
	}
	
	public static void printUpperChecked( String tekstas ) throws BestCheckedException {
		try {
			System.out.println( tekstas.toUpperCase() );
		} catch ( Exception e ) {
			throw new BestCheckedException( "Tekstas is null Checked" );
		}
	}
	
}
