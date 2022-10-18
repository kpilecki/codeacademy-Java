package paskaita18_10.blackJack;

import paskaita12_10.uzduotis2.A;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.stream.Stream;

public class Deck {
	ArrayList<Card> deck = new ArrayList<>();
	public Deck(){
		getSortedDeck();
	}
	private void getSortedDeck(){
		for( Suit suit : Suit.values() ) {

			for( Symbol symbol : Symbol.values() ) {
				deck.add( new Card( suit, symbol ) );
			}
		}
	}
	public void printDeck(){
		deck.forEach( System.out::print );
		System.out.println();
	}

	public void shuffle(){
		ArrayList<Card> temp = new ArrayList<>();
		Random rand = new Random();

		while ( !deck.isEmpty() ) {
			int random = rand.nextInt(0, deck.size() );
			temp.add( deck.get( random ));
			deck.remove(random);
		}
		deck = temp;
	}

	public Card getNextCard(){
		Card temp = deck.get( deck.size() -1 );
		deck.remove( temp );
		return temp;
	}

	public int getDeckSize(){
		return deck.size();
	}
	
	
}
