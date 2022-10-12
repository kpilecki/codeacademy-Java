package paskaita11_10;

public class Darbuotojas extends Asmuo{
	protected String socDraudimoNr;

	public Darbuotojas(String vardas, String pavarde, 
				String asmensKodas, String socDraudimoNr) {
		super(vardas, pavarde, asmensKodas);
		this.socDraudimoNr = socDraudimoNr;
	}

	public Darbuotojas() {
		// TODO Auto-generated constructor stub
	}

	public String getSocDraudimoNr() {
		return socDraudimoNr;
	}

	public void setSocDraudimoNr(String socDraudimoNr) {
		this.socDraudimoNr = socDraudimoNr;
	}

	@Override
	public String toString() {
		return "Darbuotojas [socDraudimoNr=" + socDraudimoNr 
				+ ", vardas=" + vardas 
				+ ", pavarde=" + pavarde
				+ ", asmensKodas=" + asmensKodas + "]";
	}
	@Override
	public void pasisveikinti() {
		System.out.println( "Sveiki as esu Darbuotojas");
	}
	
}
