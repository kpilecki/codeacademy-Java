package paskaita20_10.quickSort;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 20, 11, 18, 14, 15, 9, 32, 5, 26 };
		
		new QuickSort().quickSort( arr );
		
		for( int num : arr ) {
			System.out.print( num + " " );
		}

	}
	
	public boolean quickSort(int[] array, int fromIdx, int toIdx ) {
		if( Math.abs( fromIdx - toIdx ) < 2 ) {
			return false;
		}
		// swap middle element with the last one
		swapArrEl( array, Math.round(toIdx / 2), toIdx );
		// set list start position
		int swapPos = fromIdx;
		
		// find all element smaller than last element and moves them to the left
		for( int i = fromIdx; i < toIdx; i++ ) {
			if( array[ i ] < array[ toIdx ] ) {
				swapArrEl( array, swapPos, i );
				swapPos++;
			}
		}
		
		// swap last element to the position after last smaller element
		swapArrEl( array, toIdx, swapPos );
		// recursive call with left half of the unsorted array
		quickSort( array, fromIdx, swapPos - 1 );
		// recursive call with right half of the unsorted array
		quickSort( array, swapPos + 1, toIdx );

		return true;
	}

	public boolean quickSort(int[] array) {
		return quickSort( array, 0, array.length - 1 );
	}
	
	public void swapArrEl( int[] arr, int fromIdx, int toIdx ) {
		int temp = arr[ fromIdx ];
		arr[ fromIdx ] = arr[ toIdx ];
		arr[ toIdx ] = temp;
	}
}
