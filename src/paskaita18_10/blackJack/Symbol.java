package paskaita18_10.blackJack;

public enum Symbol {
	Ace('A', 11),
	King('K', 10),
	Queen('Q', 10),
	Jack('J', 10),
	Ten('T', 10),
	Nine('9', 9),
	Eight('8', 8),
	Seven('7', 7),
	Six('6', 6),
	Five('5', 5),
	Four('4', 4),
	Three('3', 3),
	Two('2', 2);
	
	char c;
	int value;
	Symbol(char c, int verte){
		this.c = c;
		value = verte;
	}
	public int getValue() {
		return this.value;
	}
	public char getChar() {
		return c;
	}
}
