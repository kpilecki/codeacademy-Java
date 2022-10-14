package paskaita14_10;

import java.util.ArrayList;

public class Universitetas {
	ArrayList<Studentas> studentai = new ArrayList<>();

	public void pridekStudenta( Studentas studentas ) {
		studentas.setId( studentai.size() + 1 );
		studentai.add( studentas );
	}
	
	public void spausdinkSarasa() {
		studentai.forEach( v -> {
			System.out.println( v );
		});
	}
	
	//Dummy data
	public void generuok() {
		pridekStudenta( new Studentas( "Adomas", "Adomaitis", 85 ));
		pridekStudenta( new Studentas( "Tomas", "Tomonis", 95) );
		pridekStudenta( new Studentas( "Justas", "Justaitis", 88) );
		pridekStudenta( new Studentas( "Lukas", "Lukaitis", 65) );
		pridekStudenta( new Studentas( "Rasa", "Rasyte", 67) );
		pridekStudenta( new Studentas( "Daiva", "Daivyte", 73) );
		pridekStudenta( new Studentas( "Guste", "Gustaite", 99) );
		pridekStudenta( new Studentas( "Ugne", "Karale", 100) );
		pridekStudenta( new Studentas( "Linas", "Kumpenas",62) );
		pridekStudenta( new Studentas( "Darius", "Jazmenas", 54) );
	}
}
