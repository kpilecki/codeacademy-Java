package paskaita18_10.kazino;

public class UI {
	//spausdink meniu
	// zaidejo klausiama kiek statote int 0-5
	// tikrina 
	
	public void spausdinkInfo() {
		System.out.println( Messages.GAME_INFO_MSG );
	}
	
	public void spausdinkMeniu() {
		System.out.println( Messages.GAME_CHOICE_MENU );
	}
	
	public void printPayout( int balance ) {
		System.out.println( Messages.PAYOUT_MSG + balance );
	}
	
	public void printOutOfBalance() {
		System.out.println( Messages.OUT_OF_BALANCE_MSG );
	}
	
	public void printNotEnoughBalance() {
		System.out.println( Messages.NOT_ENOUGH_BALANCE_MSG );
	}
	
	public void printGameOver() {
		System.out.println( Messages.GAME_OVER_MSG );
	}
	
	public void meskRutuliuka( Zaidejas player, int choice ) {
		int rut1 = Utils.mestiRutuliuka();
		int rut2 = Utils.mestiRutuliuka();
		
		System.out.println( Messages.THROW_MSG + rut1 + ", " + rut2 );
			
		if( rut1 == 6 && rut2 == 6 ) {
			player.plusBalansas( choice * 30 );
			System.out.println( Messages.WINNING_MSG );
		} else {
		player.minusBalansas( choice );
		System.out.println( Messages.LOSING_MSG );
		}
	}
}
