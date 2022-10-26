package paskaita26_10.uzduotis1;

public class ExtendedPerson extends Person{
	private int age;
	
	public ExtendedPerson( String name, String surname, int age ) {
		super( name, surname);
		this.age = age;
	}

	@Override
	public String toString() {
		return super.name + " " + super.surname + " " + age;
	}
	
	
	

}
