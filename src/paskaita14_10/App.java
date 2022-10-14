package paskaita14_10;


public class App {
	
	public static void main(String[] args) {
		Universitetas uni = new Universitetas();
		uni.generuok();
		uni.spausdinkSarasa();
	
		int balas = Utils.nextInt( "\nIveskite praejimo bala (50-99)" );
		
		
		Utils.closeScanner();
	}
}
/*Universitetas. Priemimas.
 * Turim desimt abiturientu, kurie pateike dokumentus.
 * Ivesim stojimo bala ir atrinksim, kurie yra priimti.
 * 
 */
