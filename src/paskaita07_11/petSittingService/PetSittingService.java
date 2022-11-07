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
			if( user == null ) {
				ui.printUserNotFound();
			}
		}
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
