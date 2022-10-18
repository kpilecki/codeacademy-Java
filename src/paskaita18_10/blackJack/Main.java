package paskaita18_10.blackJack;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Character a = '♥';
		
		ArrayList<Card> deck = Utils.getSortedDeck();
		
		Utils.printDeck( deck );
		
	}

}
