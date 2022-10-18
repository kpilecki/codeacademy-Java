package paskaita18_10.blackJack;

public class Card {
	private int value;
	private Suit spalva;
	private Symbol symbol;
	
	
	public Card( Suit suit, Symbol symbol ) {
		spalva = suit;
		this.symbol = symbol;
		value = symbol.getValue();
	}
	@Override
	public String toString() {
		return  "" + symbol.c + spalva.getChar();
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isAce() {
		return symbol.equals( Symbol.Ace );
	}


	
}
