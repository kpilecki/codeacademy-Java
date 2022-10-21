package paskaita20_10.mergeSort;

public class MergeSort {

	public static void main(String[] args) {
		
		for( int num : mergeSort( new int[] { 12, 11, 13, 7, 5, 6, 7, 0, 4, 43, 2, -1 } )) {
			System.out.print( num + " " );
		}

	}
	
	public static int[] mergeSort( int[] arr ) {
		return mergeSort( arr, 0, arr.length - 1 );
		
	}

	public static int[] mergeSort(int[] arr, int left, int right) {
		if( left < right ) {
			int mid = (left + right) / 2;
			
			mergeSort( arr, left, mid );
			mergeSort( arr, mid + 1, right );
			
			merge( arr, left, mid, right);
		
		}
	
		
		return arr;
	}
	
	public static void merge( int[] arr, int left, int mid, int right ) {
		// create temp arr to store merged numbers
		int[] tempArr = new int[ right - left + 1 ];
		
		int indexL = left; // index for left array
		int indexR = mid + 1; // index for right array
		
		for( int i = 0; i < tempArr.length; i++ ) {
			// if both left and right halves have numbers
			if( indexL <= mid && indexR <= right ) {
				// if element in the left half is smaller add it to the temp array
				if( arr[ indexL ] <= arr[ indexR ]) {
					tempArr[ i ] = arr[ indexL ];
					indexL++;
				// else add element from the right half to the temp array
				} else {
					tempArr[ i ] = arr[ indexR ];
					indexR++;
				}
			// if right array is empty add rest of the elements from the left half
			} else if( indexL <= mid ) {
				tempArr[ i ] = arr[ indexL ];
				indexL++;
			// if left half is empty add rest of the elements from the right half
			} else if( indexR <= right ) {
				tempArr[ i ] = arr[ indexR ];
				indexR++;
			}
		}
		
		//copy elements from temp array back to the original
		for( int i = 0; i < tempArr.length; i++ ) {
			arr[ left ] = tempArr[ i ];
			left++;
		}
	}

}
