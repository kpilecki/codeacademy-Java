package paskaita07_11.petSittingService;

import java.util.Arrays;

import paskaita07_11.petSittingService.data.UserDB;
import paskaita07_11.petSittingService.pojo.*;

public class PetSittingService {
	protected PetSittingServiceUI ui = new PetSittingServiceUI();
	protected UserDB userDB = UserDB.getUserDB();

	
	public void run() {
		bootstrapDumyData();
		
		while(true) {
			String username = ui.getUsername();
			User user = userDB.getUser( username );
			if( username.toUpperCase().equals( "Q" )) {
				return;
			} else if( user == null ) {
				ui.printUserNotFound();
				continue;
			} else {
				loginUser(user);
			}
		}
	}

	private void loginUser( User user ) {
		if( user.getPassword().equals( ui.getPassword() )) {
			while(true) {
				ui.printUserMainPage( user );
				int choice = ui.getUserChoice();
				
				if( choice == 0 ) {
					return;
				} else if( user instanceof Customer ) {
					new CustomerMenuService().run( user, choice );
				} else if( user instanceof ServiceProvider ) {
					runServiceProviderMenu( choice );
				}
			}
			
		} 
		
	}

	private void runServiceProviderMenu( int choice ) {
		// TODO Auto-generated method stub
		
	}

	private void bootstrapDumyData() {
		Customer customer = Customer.builder()
					.username( "customer")
					.password( "1" )
					.name( "John" )
					.surname( "Wick" )
					.pets( Arrays.asList( Pet.builder().name( "Husky" ).age( 5 ).type( PetTypes.Dog ).build() ))
					.build();
		
		ServiceProvider provider = ServiceProvider.builder()
				.username( "seller" )
				.password( "2" )
				.name( "Rick" )
				.surname( "Sanches" )
				.description( "Greatest Pet Care Specialist" )
				.build();
		userDB.addUser( provider );
		userDB.addUser( customer );
		
	}
}
