package paskaita18_10.kazino;

public class Zaidejas {
	private int balansas = 50;

	public int getBalansas() {
		return balansas;
	}
	
	public void plusBalansas( int num ) {
		balansas += num;
	}
	
	public boolean minusBalansas( int num ) {
		if( balansas - num >= 0 ) {
			balansas -= num;
			return true;
		}
		return false;
	}
	
	public boolean checkBalansas( int num ) {
		if( balansas - num >= 0 ) {
			return true;
		}
		return false;
	}
	
	public void printBalansas() {
		System.out.println( "Balansas:" + balansas );
	}
}
