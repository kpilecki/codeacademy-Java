package paskaita07_11.petSittingService;

import paskaita07_11.petSittingService.data.Messages;
import paskaita07_11.petSittingService.pojo.Customer;
import paskaita07_11.petSittingService.pojo.Pet;
import paskaita07_11.petSittingService.pojo.Pet.PetBuilder;
import paskaita07_11.petSittingService.pojo.User;

public class CustomerMenuService {
	protected PetSittingServiceUI ui = new PetSittingServiceUI();
	Customer customer;
	
	public void run( User user, int choice ){
		this.customer = (Customer) user;
		
		switch( choice ) {
		case 1:
			runCustomerPetsPage();
			break;
		case 2:
			runCustomersOrdersPage();
			break;
		case 3:
			runFindListingsPage();
		}
	}
	
	private void runFindListingsPage() {
		// TODO Auto-generated method stub
		
	}

	private void runCustomersOrdersPage() {
		// TODO Auto-generated method stub
		
	}

	private void runCustomerPetsPage() {
		int choice = -1;
		while( choice != 0 ) {
			ui.printPets( customer );
			ui.printCustomerPetsPageMenu();
			choice = ui.getUserChoice();
			
			switch( choice ) {
			case 1:
				addPet();
				break;
			case 2:
				editPets();
				break;
			case 3:
				deletePet();
			}
		}
		
		
	}

	private void deletePet() {
		// TODO Auto-generated method stub
		
	}

	private void editPets() {
		// TODO Auto-generated method stub
		
	}

	private void addPet() {
		PetBuilder pet = Pet.builder();
		
		pet.name( ui.getUserTextInput( Messages.CUSTOMER_GET_PET_NAME_MSG ) );
		pet.age( ui.getUserNumericInput( Messages.CUSTOMER_GET_PET_AGE_MSG ));
		pet.type( ui.getPetType());
		pet.specialNeeds( ui.getUserTextInput( Messages.CUSTOMER_GET_PET_SPECIAL_NEEDS_MSG ));
		
		customer.getPets().add( pet.build() );
	}
	
}
