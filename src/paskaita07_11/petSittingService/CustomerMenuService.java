package paskaita07_11.petSittingService;

import java.util.Arrays;
import java.util.List;

import paskaita07_11.petSittingService.data.Messages;
import paskaita07_11.petSittingService.pojo.Customer;
import paskaita07_11.petSittingService.pojo.Order;
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
		// TODO Need to create Listing Database to implement
		
	}

	private void runCustomersOrdersPage() {
		List<Order> orders = customer.getOrders();
		int choice = 0;
		
		while( choice != -1 ) {
			if( orders.isEmpty() ) {
				ui.printMessage( Messages.NO_ORDERS_FOUND_ERR_MSG );
				return;
			} else {
				orders.forEach( v -> ui.printMessage( v.toString() ) );
				choice = ui.getUserNumericInput( Messages.ENTER_Q_TO_RETURN_MSG );
			}
		}
		
	}

	private void runCustomerPetsPage() {
		int choice = 0;
		while( choice != -1 ) {
			ui.printPets( customer.getPets() );
			ui.printCustomerPetsPageMenu();
			choice = ui.getUserNumericInput("");
			
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
		List<Pet> pets = customer.getPets();
		int choice = 0;
		
		while( choice != -1 ) {
			ui.printPets( pets );
			choice = ui.getUserNumericInput( Messages.CUSTOMER_CHOOSE_PET_MSG );
			
			if( choice >= 0 && choice < pets.size() ) {
				pets.remove( choice ); 
			}
		}
	}

	private void editPets() {
		List<Pet> pets = customer.getPets();
		int choice = 0;
		
		while( choice != -1 ) {
			ui.printPets( pets );
			choice = ui.getUserNumericInput( Messages.CUSTOMER_CHOOSE_PET_MSG );
			
			if( choice >= 0 && choice < pets.size() ) {
				editPet( pets.get( choice ) ); 
			}
		}
	}

	private void editPet( Pet pet ) {
		int choice = 0;
		
		while( choice != -1 ) {
			ui.printPets( Arrays.asList( pet ) );
			ui.printEditPetPageMenu();
			choice = ui.getUserNumericInput("");
			
			switch( choice ) {
			case 1:
				editPetName( pet );
				break;
			case 2: 
				editPetAge( pet );
				break;
			case 3: 
				editPetType( pet );
				break;
			case 4:
				editPetSpecialNeeds( pet );
			}
		}
	}

	private void editPetSpecialNeeds( Pet pet ) {
		pet.setSpecialNeeds( ui.getUserTextInput( Messages.EDIT_PET_SPECIAL_NEEDS_MSG ));
	}

	private void editPetType( Pet pet ) {
		pet.setType( ui.getPetType() );
	}

	private void editPetAge( Pet pet ) {
		pet.setAge( ui.getUserNumericInput( Messages.EDIT_PET_AGE_MSG ));
	}

	private void editPetName( Pet pet ) {
		pet.setName( ui.getUserTextInput( Messages.EDIT_PET_NAME_MSG ));
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
