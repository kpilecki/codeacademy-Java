package paskaita26_10.uzduotis1;

public class Utils {
	
	public static <T> void printArray(T[] arr ) {
		for( T el : arr ) {
			System.out.println( el );
		}
	}
	
	public static <T> void printArray2(T... args ) {
		for( T el : args ) {
			System.out.println( el );
		}
	}
}
