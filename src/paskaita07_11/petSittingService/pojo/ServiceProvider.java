package paskaita07_11.petSittingService.pojo;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class ServiceProvider extends User{
	protected Calendar calendar;
	protected PaymentInfoIn paymentInfo;
	protected List<Listing> listings;
	protected String description;
	protected List<Order> orders;
	
	@Builder
	public ServiceProvider(String username, String password, String name, String surname, Address address,
			String phoneNumber, String emailAddress, List<Order> orders, Calendar calendar, PaymentInfoIn paymentInfo,
			List<Listing> listings, String description, List<Order> orders2) {
		super(username, password, name, surname, address, phoneNumber, emailAddress, orders);
		this.calendar = calendar;
		this.paymentInfo = paymentInfo;
		this.listings = listings;
		this.description = description;
		orders = orders2;
	}
	
	
}
