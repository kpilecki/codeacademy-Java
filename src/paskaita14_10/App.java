package paskaita14_10;


public class App {
	
	public static void main(String[] args) {
		Universitetas uni = new Universitetas();
		uni.generuok();
		Utils.printList( uni.getAllStudents() );
	
		int balas = Utils.nextInt( Messages.MSG_TRESHHOLD );
		System.out.println( "Ivestas praejimo balas " + balas );
		
		Utils.printList( uni.getListApproved( balas ));
		
		Utils.closeScanner();
	}
}
/*Universitetas. Priemimas.
 * Turim desimt abiturientu, kurie pateike dokumentus.
 * Ivesim stojimo bala ir atrinksim, kurie yra priimti.
 * 
 */
