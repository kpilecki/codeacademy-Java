package paskaita07_11.petSittingService.pojo;

import java.time.LocalDateTime;

public class Order {
	protected Customer customer;
	protected ServiceProvider serviceProvider;
	protected Pet pet;
	protected Period period;
	protected float price;
	protected Address location;
	protected LocalDateTime orderCreationDate;
	protected boolean paymentStatus;
	@Override
	public String toString() {
		return "Order [customer=" + customer + ", serviceProvider=" + serviceProvider + ", pet=" + pet + ", period="
				+ period + ", price=" + price + ", location=" + location + ", orderCreationDate=" + orderCreationDate
				+ ", paymentStatus=" + paymentStatus + "]";
	}
	
	
}
