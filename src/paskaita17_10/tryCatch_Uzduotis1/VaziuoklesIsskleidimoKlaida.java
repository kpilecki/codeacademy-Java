package paskaita17_10.tryCatch_Uzduotis1;


public class VaziuoklesIsskleidimoKlaida extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8964857986358527893L;
	private String priezastis = "";
	
	public VaziuoklesIsskleidimoKlaida( String string ) {
		priezastis = string;
	}

	public String getPriezastis() {
		return priezastis;
	}

	
	
}
