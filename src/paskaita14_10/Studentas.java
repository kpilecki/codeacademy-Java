package paskaita14_10;

//DTO - Data Transfer Object
public class Studentas {
	int id;
	String vardas;
	String pavarde;
	int balas;
	
	public Studentas( String vardas, String pavarde, int balas ) {
		super();
		this.vardas = vardas;
		this.pavarde = pavarde;
		this.balas = balas;
	}

	public int getBalas() {
		return balas;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return id + ". " + vardas + " " + pavarde + " balas: " + balas;
	}
	
	
}
