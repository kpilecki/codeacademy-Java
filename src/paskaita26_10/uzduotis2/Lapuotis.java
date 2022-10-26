package paskaita26_10.uzduotis2;

public class Lapuotis implements Medis{

	@Override
	public void turi() {
		System.out.println( this.getClass().getSimpleName() + " turi lapus");
	}

}
