package paskaita07_11.petSittingService;

import paskaita07_11.petSittingService.data.*;
import java.util.Scanner;

public class PetSittingServiceUI {
	public static Scanner sc = new Scanner( System.in );
	
	
	public String getUsername() {
		System.out.println( Messages.ENTER_USERNAME_MSG );
		
		return sc.nextLine();
	}


	public void printUserNotFound() {
		System.out.println( Messages.USER_NOT_FOUND_MSG );
		
	}

}
