package paskaita11_10.uzduotis2;

public class Studentas extends Asmuo{

	public Studentas(String name, String surname) {
		super.vardas = name;
		super.pavarde = surname;
	}

	@Override
	public void spausdinkInformacija() {
		System.out.println( "Studentas " + vardas + " " + pavarde);
	}

}
