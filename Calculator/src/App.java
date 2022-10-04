import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Person[] arr = new Person[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Person("John" + i, 21 + i);
		}
		
		Utils.printArr(arr);
	}	

}
