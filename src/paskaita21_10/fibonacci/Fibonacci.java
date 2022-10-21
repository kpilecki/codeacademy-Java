package paskaita21_10.fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println( fibonacciRecursive( 10 ));
		
		System.out.println( fibonacciIterative( 100 ));

	}
	
	public static long fibonacciRecursive( int nth ) {
		if( nth == 0 ) {
			return 0L;
		} else if( nth == 1 ) {
			return 1L;
		}
		return fibonacciRecursive( nth - 1 ) + fibonacciRecursive( nth - 2 );
	}
	
	public static long fibonacciIterative( int nth ) {
		long rezPr = 1;
		long rez = 0;
		long temp = 0;
		for( int i = 0; i < nth; i++) {
			temp = rez;
			rez += rezPr;
			rezPr = temp;
		}
		return rez;
	}

}
