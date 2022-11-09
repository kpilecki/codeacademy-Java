package paskaita09_11.jdbcRowToObject;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Actor {
	private String firstName;
	private String lastName;
	private int movieCount;
	@Override
	public String toString() {
		return "'" + firstName + "', '" + lastName + "', '" + movieCount + "'";
	}
	
	
	
}
