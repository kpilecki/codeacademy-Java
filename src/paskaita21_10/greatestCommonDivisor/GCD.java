package paskaita21_10.greatestCommonDivisor;

public class GCD {

	public static void main(String[] args) {
		System.out.println( gcd( 3456, 1233 ));
		System.out.println( gcd( 99, 88 ));
		System.out.println( gcd( 15, 5 ));
	}
	
	public static int gcd(int a, int b) {
		if( b != 0 ) {
			
			return gcd( b, a % b );
		}
		return a;
	}

}
