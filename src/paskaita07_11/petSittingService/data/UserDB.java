package paskaita07_11.petSittingService.data;

import java.util.ArrayList;
import java.util.List;

import paskaita07_11.petSittingService.pojo.*;

public class UserDB {
	protected List<User> users;
	private static UserDB instance;
	
	private UserDB() {}
	
	public static UserDB getUserDB() {
		if( instance == null ) {
			instance = new UserDB();
		} 
		return instance;
	}
	
	public void addUser( User user ) {
		if ( users == null ) {
			users = new ArrayList<User>();	
		} 
		users.add(user);
	}
	
	public User getUser( String username ) {
		return users.stream()
				.filter( v -> v.getUsername().equals( username ) )
				.findAny()
				.orElse(null);
	}
}
