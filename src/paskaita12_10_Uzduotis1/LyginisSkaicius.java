package paskaita12_10_Uzduotis1;

import java.util.Random;

public class LyginisSkaicius extends Skaicius{

	@Override
	public void generuok() {
		Random rand = new Random();
		int min = 20;
		int max = 200;
		int atsitiktinisSkaicius = rand.nextInt( (max - min) + 1 ) + min; 
		
		while( atsitiktinisSkaicius > 0 ) {
			arr.add( rand.ints()	// generates stream of integer values
					.filter( v -> v % 2 == 0 ) 	// filters values that can be divided by 2
					.findFirst() 	// picks first el from filtered stream
					.getAsInt());	// converts from Optional to integer
			atsitiktinisSkaicius--;
		}
//		arr.addAll( rand.ints().filter( v -> v % 2 == 0 ).limit( atsitiktinisSkaicius ).toArray() );
		
	}

}
