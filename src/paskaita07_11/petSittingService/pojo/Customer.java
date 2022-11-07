package paskaita07_11.petSittingService.pojo;

import java.util.List;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class Customer extends User{
	protected List<Pet> pets;
	protected PaymentInfoOut paymentInfo;
	
	@Builder
	public Customer(String username, String password, String name, String surname, Address address, String phoneNumber,
			String emailAddress, List<Order> orders, List<Pet> pets, PaymentInfoOut paymentInfo) {
		super(username, password, name, surname, address, phoneNumber, emailAddress, orders);
		this.pets = pets;
		this.paymentInfo = paymentInfo;
	}
	
	
}
