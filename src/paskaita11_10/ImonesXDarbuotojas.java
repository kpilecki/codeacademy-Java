package paskaita11_10;

public class ImonesXDarbuotojas extends Darbuotojas{
	protected String xNr;

	public ImonesXDarbuotojas(String vardas, String pavarde,
				String asmensKodas, String socDraudimoNr, String xNr) {
		super(vardas, pavarde, asmensKodas, socDraudimoNr);
		this.xNr = xNr;
	}

	public ImonesXDarbuotojas() {
		// TODO Auto-generated constructor stub
	}

	public String getxNr() {
		return xNr;
	}

	public void setxNr(String xNr) {
		this.xNr = xNr;
	}

	@Override
	public String toString() {
		return "ImonesXDarbuotojas [xNr=" + xNr 
				+ ", socDraudimoNr=" + socDraudimoNr 
				+ ", vardas=" + vardas
				+ ", pavarde=" + pavarde 
				+ ", asmensKodas=" + asmensKodas + "]";
	}
	@Override
	public void pasisveikinti() {
		System.out.println( "Sveiki as esu ImonesXDarbuotojas");
	}
	
}
