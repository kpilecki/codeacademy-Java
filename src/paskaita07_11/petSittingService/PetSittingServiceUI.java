package paskaita07_11.petSittingService;

import paskaita07_11.petSittingService.data.*;
import paskaita07_11.petSittingService.pojo.Customer;
import paskaita07_11.petSittingService.pojo.Pet;
import paskaita07_11.petSittingService.pojo.PetTypes;
import paskaita07_11.petSittingService.pojo.User;

import java.util.InputMismatchException;
import java.util.List;
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


	public String getPassword() {
		System.out.println( Messages.ENTER_PASSWORD_MSG );
		return sc.nextLine();
	}


	public void printUserMainPage( User user ) {
		System.out.println( Messages.GREETING_MSG + user.getName() );
		if( user instanceof Customer ) {
			System.out.println( Messages.CUSTOMER_MENU );
		} else {
			System.out.println( Messages.SERVICE_PROVIDER_MENU );
		}
		
		
	}

	public void printPets( List<Pet> pets ) {
		if( pets.size() == 0 ) {
			System.out.println( Messages.CUSTOMER_NO_PETS_MSG );
		} else {
			int count = 0;
			for( var pet : pets ) {
				System.out.println( "[" + count++ + "]- " + pet );
			}
			System.out.println();
		}
		
	}

	public void printCustomerPetsPageMenu() {
		System.out.println( Messages.CUSTOMER_PETS_PAGE_MENU );
		
	}


	public String getUserTextInput( String message ) {
		System.out.println( message );
		
		return sc.nextLine();
	}


	public int getUserNumericInput( String message ) {
		System.out.println( message );
		try {
			return sc.nextInt();
		} catch (InputMismatchException e ) {
			return -1;
		}
	}


	public PetTypes getPetType() {
		while(true) {
			printPetTypes();
			int choice = getUserNumericInput( Messages.PET_CHOOSE_TYPE_MSG );
			if( choice >= 0 && choice < PetTypes.values().length ) {
				return PetTypes.values()[choice];
			}
		}
	}
	
	public void printPetTypes() {
		int count = 0;
		
		for( var type : PetTypes.values() ) { 
			System.out.println( "[" + count++ + "] -" + type );
		}
	}


	public void printEditPetPageMenu() {
		System.out.println( Messages.EDIT_PET_MENU );
		
	}


	public void printMessage( String message ) {
		System.out.println( message );
	}


	

}
