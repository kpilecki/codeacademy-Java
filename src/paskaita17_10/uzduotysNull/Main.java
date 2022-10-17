package paskaita17_10.uzduotysNull;

public class Main {

	public static void main(String[] args) {
		Adresas adr = new Adresas( new Miestas( "Vilnius ") );
		Adresas adrNull = new Adresas( null );
		
		System.out.println( gautiMiestoPavadinima2( adr ) );
		System.out.println( gautiMiestoPavadinima2( adrNull ) );
		
		adr.getMiestas().setPavadinimas( null );
		
		System.out.println( gautiMiestoPavadinima2( adr ) );
		
		adrNull = null;

		System.out.println( gautiMiestoPavadinima2( adrNull ) );
	}
	
	public static String gautiMiestoPavadinima( Adresas adresas ) {
		if( adresas != null  
				&& adresas.getMiestas() != null 
				&& adresas.getMiestas().getPavadinimas() != null ) {
			return adresas.getMiestas().getPavadinimas();
		}
		return "Objektas yra Null";
	}
	
	public static String gautiMiestoPavadinima2( Adresas adresas ) {
		
		return adresas != null 
				? adresas.getMiestas() != null 
				? adresas.getMiestas().getPavadinimas() != null 
				? adresas.getMiestas().getPavadinimas() 
						: "Pavadinimas Yra Null" 
							: "Miestas Yra Null" 
								: "Adresas Null";
	}
	
}
