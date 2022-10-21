package paskaita21_10.runningNumberSequence;

public class RunningNumberSequence {

	public static void main(String[] args) {
		System.out.println( runningNumbersRecursive( 1 ));
		System.out.println( runningNumbersRecursive( 2 ));
		System.out.println( runningNumbersRecursive( 3 ));
		System.out.println( runningNumbersRecursive( 9 ));
		System.out.println( runningNumbersRecursive( 11 ));
		System.out.println( runningNumbersRecursive( 12 ));
		
		System.out.println( runningNumbersIterative( 1 ));
		System.out.println( runningNumbersIterative( 2 ));
		System.out.println( runningNumbersIterative( 3 ));
		System.out.println( runningNumbersIterative( 9 ));
		System.out.println( runningNumbersIterative( 11 ));
		System.out.println( runningNumbersIterative( 12 ));

	}
	
	public static String runningNumbersRecursive( int len ) {
		if( len == 0 ) {
			return "";
		}
		return runningNumbersRecursive( len - 1 ) + len;
	}
	
	public static String runningNumbersIterative( int len ) {
		StringBuilder builder = new StringBuilder();
		
		for( int i = 0; i <= len; i++) {
			builder.append( i );
		}
		
		return builder.toString();
	}

}
