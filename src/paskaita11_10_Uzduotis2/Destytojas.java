package paskaita11_10_Uzduotis2;

public class Destytojas extends Asmuo{

	public Destytojas(String name, String surname) {
		super.vardas = name;
		super.pavarde = surname;
	}

	@Override
	public void spausdinkInformacija() {
		System.out.println( "Destytojas " + vardas + " " + pavarde);
	}

}
