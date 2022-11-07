package paskaita07_11.petSittingService.pojo;

import lombok.Builder;

@Builder
public class Pet {
	protected String name;
	protected PetTypes type;
	protected int age;
	protected String specialNeeds;
}
