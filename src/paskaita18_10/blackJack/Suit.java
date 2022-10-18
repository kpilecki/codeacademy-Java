package paskaita18_10.blackJack;

public enum Suit {
	Hearts('♥'), //Sirdys
	Clubs('♣'),	//Kryziai
	Diamonds('♦'), //Bugnai
	Spades('♠'); //Vynai
	
	char c;
	
	Suit( char c ){
		this.c = c;
	}
	public char getChar() {
		return c;
	}

}
