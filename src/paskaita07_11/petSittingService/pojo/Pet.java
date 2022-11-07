package paskaita07_11.petSittingService.pojo;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Pet {
	protected String name;
	protected PetTypes type;
	protected int age;
	protected String specialNeeds;
	@Override
	public String toString() {
		return name + ", " + type + ", " + age + ", " + specialNeeds ;
	}
	
	
}
