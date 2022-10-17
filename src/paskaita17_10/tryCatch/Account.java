package paskaita17_10.tryCatch;

public class Account {
	private int balance = 100;
	
	public void withdraw(int amount) throws AccountException {  
		if( balance - amount >= 0 ) {
			balance -= amount;
		} else {
			throw new AccountException( "Nepakanka pinigu", balance - amount );
		}

	}
}
