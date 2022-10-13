package paskaita12_10_Uzduotis1;

import java.util.Random;

public class NelyginisSkaicius extends Skaicius{

	@Override
	public void generuok() {
		Random rand = new Random();
		int min = 20;
		int max = 200;
		int atsitiktinisSkaicius = rand.nextInt( (max - min) + 1 ) + min; 
		
		while( atsitiktinisSkaicius > 0 ) {
			int temp = 0;
			
			while( temp % 2 == 0 ) {
			 temp = rand.nextInt();
			}
			
			arr.add( temp );
			atsitiktinisSkaicius--;
		}
		
	}
}
