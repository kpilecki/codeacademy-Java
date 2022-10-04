
public class Utils {
	
	public static boolean arrCheck(int[] arr) {
		
		for(int i = 0; i < arr.length - 1; i++) {
			
			if(arr[i]+1 != arr[i + 1]) {
				return false;
			}
		}
		return true;
	}
	
	public static <T> T[] reverseArr(T[] arr){
		
		for(int i = 0; i < arr.length / 2; i++) {
			T temp = arr[i];
			arr[i] = arr[ arr.length - i -1];
			arr[arr.length - i -1] = temp;
		}
		return arr;
	}
	
	public static char[] reverseArr(char[] arr){
		
		for(int i = 0; i < arr.length / 2; i++) {
			char temp = arr[i];
			arr[i] = arr[ arr.length - i -1];
			arr[arr.length - i -1] = temp;
		}
		return arr;
	}
	
	public static <T> void printArr(T[] arr) {
		System.out.print("[ ");
		for(T item : arr) {
			System.out.print(item + " ");	
		}
		System.out.print(" ]\n");
	}
	public static void printArr(int[] arr) {
		System.out.print("[ ");
		for(int item : arr) {
			System.out.print(item + " ");
		}
		System.out.print(" ]\n");
	}
	
	
}
