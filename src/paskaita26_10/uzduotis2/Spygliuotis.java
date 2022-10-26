package paskaita26_10.uzduotis2;

public class Spygliuotis implements Medis{

	@Override
	public void turi() {
		System.out.println( this.getClass().getSimpleName() + " turi spyglius");
	}
	
}
