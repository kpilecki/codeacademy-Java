package paskaita17_10.tryCatch;

public class Medziaga {

	public static void main(String[] args) {
		Account a = new Account();
		try {
			a.withdraw(90);
			System.out.println("Pinigai nuskaityti");
			a.withdraw(50);
			System.out.println("Pinigai nuskaityti");
		} catch (AccountException e) {
			System.out.println("Klaida. Po  nuskaitymo balansas butu: " + e.getBalance());
		}
	}
}
