package paskaita18_10.blackJack;

import java.util.ArrayList;
import java.util.Collection;

public class Utils {
	public static ArrayList<Card> getSortedDeck(){
		ArrayList<Card> result = new ArrayList<>();
		for( Suit suit : Suit.values() ) {
			
			for( Symbol symbol : Symbol.values() ) {
				result.add( new Card( suit, symbol ) );
			}
		}
		return result;
	}
	
	public static void printDeck( Collection<Card> deck ) {
		deck.forEach( card -> {
			System.out.println( card );
		});
	}
	
}
