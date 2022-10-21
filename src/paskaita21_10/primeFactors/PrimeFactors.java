package paskaita21_10.primeFactors;

import java.util.ArrayList;

public class PrimeFactors {

	public static void main(String[] args) {
		generatePrimeList( 100 );
		isProductOfPrimeFactors( 30 );
		getPerfectPrimeFactorList( 100 );
	}
	
	public static void getPerfectPrimeFactorList(int num) {
		int count = 0;
		
		for( int i = 1; i <= num; i++) {
			if( isProductOfPrimeFactors( i )) {
				System.out.print( i + " " );
				count++;
			}
		}
		System.out.println( "\n" + count + " numbers found (" + (count * 100f) / num + "%)" );
	}
	
	public static boolean isProductOfPrimeFactors(int num) {
		ArrayList<Integer> arr = new ArrayList<>();
		int temp = num;
		int prod = 1;
		
		for( int i = temp - 1; i > 0; i--) {
			if( isPrime( i )) {
				if( temp % i == 0 ) {
					arr.add( i );
					temp /= i;
				}
			}
		}
		for( int v : arr) {
			prod *= v;
		}
		return prod == num ? true : false ;
	}
	
	public static boolean isPrime( int num ) {
		if( num == 1 ) {
			return true;
		}
		for( int i = 2; i < num; i++) {
			if( num % i == 0 ) {
				return false;
			}
		}
		return true;
	}
	
	public static void generatePrimeList( int bound ){
		int count = 0;
		
		for( int i = 1; i <= bound; i++) {
			if( isPrime( i ) ) {
				System.out.println( i );
				count++;
			}
		}
		System.out.println( count + " primes found (" + (count * 100f) / bound + "%)" );
		
	}
}
