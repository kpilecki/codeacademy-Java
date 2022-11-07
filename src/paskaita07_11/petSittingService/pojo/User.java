package paskaita07_11.petSittingService.pojo;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class User {
	protected String username;
	protected String password;
	protected String name;
	protected String surname;
	protected Address address;
	protected String phoneNumber;
	protected String emailAddress;
	protected List<Order> orders;
}
