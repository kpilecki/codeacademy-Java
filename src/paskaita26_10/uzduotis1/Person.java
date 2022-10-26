package paskaita26_10.uzduotis1;

public class Person {
	protected String name;
	protected String surname;
	
	public Person( String name, String surname ) {
		this.name = name;
		this.surname = surname;
	}

	@Override
	public String toString() {
		return name + " " + surname;
	}
	
	
}
