package paskaita20_10.insertionSort;

public class InsertionSort {
	
	public static void main(String[] args) {

		for( int num : insertionSort( 0, 6, 9, 6, 4, 1, 5, 2, 7 )) {
			System.out.print( num + " " );
		}
	}
	
	public static int[] insertionSort(int... array) {
		for( int i = 1; i < array.length; i++) {
			moveArrayItem( array[i], i, array);	
		}
		return array;
	}
	
	
	public static void moveArrayItem( int curr, int upper, int[] arr ) {
		for( int j = 0; j <  upper; j++) {
			//checks if we are at the correct position to insert element
			if( curr < arr[j] ) {
				// Makes space for element to be inserted
				// shifts all elements in the sorted part to the right
				shiftArrayItems( j , upper, arr ); 
				// Inserts element into new position
				arr[j] = curr;
				return;
			}
		}
	}
	
	
	public static void shiftArrayItems( int lower, int upper, int[] arr ) {
		
		for( int i = upper; i > lower; i--) {
			arr[ i ] = arr[ i - 1];
		}
	}

}
