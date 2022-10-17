package paskaita17_10.uzduotis1;

public class Adresas {
	private Miestas miestas;
	private Gatve gatve;
	
	public Adresas(Miestas miestas, Gatve gatve) {
		super();
		this.miestas = miestas;
		this.gatve = gatve;
	}

	public Miestas getMiestas() {
		return miestas;
	}

	public void setMiestas(Miestas miestas) {
		this.miestas = miestas;
	}

	public Gatve getGatve() {
		return gatve;
	}

	public void setGatve(Gatve gatve) {
		this.gatve = gatve;
	}

	@Override
	public String toString() {
		return "Adresas:\n" 
				+ " " + gatve.getNumeris() + " " + gatve.getPavadinimas() + ",\n" 
				+ " " + miestas.getPavadinimas();
	}
	
	
}
