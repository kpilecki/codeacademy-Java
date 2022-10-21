package paskaita21_10.perfectAndDeficientNumbers;

public class PerfectAndDeficientNumbers {

	public static void main(String[] args) {
		System.out.println( isPerfect( 6 ));
		System.out.println( isPerfect( 10 ));
		System.out.println( isDeficient( 10 ));
		System.out.println( isDeficient( 12 ));
	}
	
	public static boolean isPerfect( int num ) {
		
		return getSumOfDivisors( num ) == num ? true : false;
	}
	
	public static boolean isDeficient( int num ) {
		
		return getSumOfDivisors( num ) < num ? true : false;
	}
	
	public static int getSumOfDivisors( int num ) {
		int sum = 0;
		
		for( int i = num - 1; i > 0; i--) {
			if( num % i == 0 ) {
				sum += i;
			}
		}
		return sum;
	}

}
