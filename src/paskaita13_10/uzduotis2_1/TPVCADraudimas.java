package paskaita13_10.uzduotis2_1;

public class TPVCADraudimas  extends AutomobilioDraudimas{
	private String galiojimoTeritorija;

	public TPVCADraudimas(String apdraustojoVardas, double draudimoSuma, String automobilioValstNr,
			String galiojimoTeritorija) {
		super(apdraustojoVardas, draudimoSuma, automobilioValstNr);
		this.galiojimoTeritorija = galiojimoTeritorija;
	}

	public String getGaliojimoTeritorija() {
		return galiojimoTeritorija;
	}

	public void setGaliojimoTeritorija(String galiojimoTeritorija) {
		this.galiojimoTeritorija = galiojimoTeritorija;
	}
	
	
}
