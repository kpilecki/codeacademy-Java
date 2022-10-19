package paskaita19_10.knygynas;

import java.util.Collection;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
	Scanner sc = new Scanner( System.in );
	
	
	public void printMainMenu() {
		System.out.println( Messages.MAIN_MENU_MSG );
	}

	public int getChoice() {
		int temp = 0;
		printMainMenu();
		try {
			temp = sc.nextInt();
		} catch ( InputMismatchException e ) {
			System.out.println( Messages.INCORRECT_CHOICE_INPUT_MSG );
		}
		return temp;
	}

	public <T> void  printArray(Collection<T> list, String msg) {
		System.out.println( msg );
		list.forEach( System.out::println );
		System.out.println();
		
	}

	public String getUserInputStr(String str) {
		sc.nextLine();
		System.out.println( str );
		return sc.nextLine();
	}

}
