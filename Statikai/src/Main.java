
public class Main {

	public static void main(String[] args) {
		Account acc = new Account("LT 01 01 02");
		acc.setAmount(20);
		acc.getAmount();
		
		System.out.println(Account.getCounter());
		System.out.println(Account.getAmountCallCounter() + " Amount");

		Account acc2 = new Account("LT 01 01 02");
		acc2.setAmount(20);
		acc2.getAmount();
		
		Account acc3 = new Account("LT 01 01 02");
		acc3.setAmount(20);
		acc3.getAmount();
		
		System.out.println(Account.getCounter());
		
		new Account("LT 01 01 02");
		new Account("LT 01 01 02");
		new Account("LT 01 01 02");
		new Account("LT 01 01 02");
		
		System.out.println(Account.getCounter());
		System.out.println(Account.getAmountCallCounter() + " Amount");
	}

}
