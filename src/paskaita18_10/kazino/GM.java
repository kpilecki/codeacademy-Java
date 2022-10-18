package paskaita18_10.kazino;

public class GM {
	//apskaiciuoja ismoka
	
	public void run() {
		UI ui = new UI();
		
		ui.spausdinkInfo();
		
		if( Utils.nextInt() == 1 ) {
			gameLoopRun( ui );
		}
		ui.printGameOver();
	}
	
	private void gameLoopRun( UI ui ) {
		int choice = 0;
		Zaidejas player = new Zaidejas();
		
		while( true ) {
			player.printBalansas();
			ui.spausdinkMeniu();
			choice = Utils.nextInt();
			
			if( choice <= 0 ) {
				ui.printPayout( player.getBalansas() );
				break;
			} else if( player.getBalansas() == 0 ) {
				ui.printOutOfBalance();
				break;
			} else if( !player.checkBalansas( choice )) {
				ui.printNotEnoughBalance();
				continue;
			} else if( choice > 0 && choice < 6 ) {
				ui.meskRutuliuka( player, choice );
			}
			
			
		}
	}
	
	
}
