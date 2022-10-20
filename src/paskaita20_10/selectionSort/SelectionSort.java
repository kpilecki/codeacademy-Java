package paskaita20_10.selectionSort;

public class SelectionSort {

	public static void main(String[] args) {
		
		
		for( int num : selectionSort( 9, 6, 4, 1, 5 ) ) {
			System.out.print( num + " " );
		}

	}
	
	public static int[] selectionSort(int... array) {
		int currSm = Integer.MAX_VALUE;
		int currSmIndex = 0;
		int temp;
		
		for( int i = 0; i < array.length; i++) {
			
			for(int j = i; j < array.length; j++) {
				if( array[ j ] < currSm ) {
					currSm = array[ j ];
					currSmIndex = j;
				}
			}
			temp = array[i];
			array[i] = array[ currSmIndex ];
			array[ currSmIndex ] = temp;
			currSm = Integer.MAX_VALUE;
		}
		return array;
	}

}
