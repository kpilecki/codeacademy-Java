package paskaita13_10_Uzduotis2_1;

public class Main {

	public static void main(String[] args) {
		Draudimas tpvcaDraudimas = new TPVCADraudimas("John Doe",  1000, "ABC123", "Lietuva");
		Draudimas kaskoDraudimas = new KaskoDraudimas("Stewie Griffin",  2000, "BCD754", 23421);
		
		System.out.println( tpvcaDraudimas.getApdraustojoVardas() 
				+ " " 
				+ tpvcaDraudimas.getDraudimoSuma());
		System.out.println( kaskoDraudimas.getApdraustojoVardas() 
				+ " " 
				+ kaskoDraudimas.getDraudimoSuma());

		System.out.println( AutomobilioDraudimas.class
				.cast( tpvcaDraudimas )
				.getAutomobilioValstNr() );
		System.out.println( AutomobilioDraudimas.class
				.cast( kaskoDraudimas )
				.getAutomobilioValstNr());
		
		System.out.println( TPVCADraudimas.class
				.cast( tpvcaDraudimas )
				.getGaliojimoTeritorija());
		System.out.println( KaskoDraudimas.class
				.cast( kaskoDraudimas )
				.getFransize());
		
		Draudimas autDraudimas = new AutomobilioDraudimas( "Peter Griffin",  3200, "CDS643" );
		
		System.out.println( AutomobilioDraudimas.class
				.cast( autDraudimas )
				.getApdraustojoVardas());
		
	}

}
