package paskaita12_10.uzduotis1;

import java.util.Random;

public class TeigiamasSkaicius extends Skaicius{

	@Override
	public void generuok() {
		Random rand = new Random();
		int min = 20;
		int max = 200;
		int atsitiktinisSkaicius = rand.nextInt( (max - min) + 1 ) + min; 
		
		while( atsitiktinisSkaicius > 0 ) {
			arr.add( rand.nextInt( 1, Integer.MAX_VALUE ));
			atsitiktinisSkaicius--;
		}
		
	}


}
