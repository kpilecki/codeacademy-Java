package Statikai;

public class Account {
	private int amount = 0;
	private final String name;
	
	private static int counter = 0;
	private static int amountCallCounter = 0;
	
	
	public Account(String name) {
		this.name = name;
		counter++;
	}
	
	public int getAmount() {
		amountCallCounter++;
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getName() {
		return name;
	}
	
	public static int getCounter() {
		return counter;
	}
	public static int getAmountCallCounter() {
		return amountCallCounter;
	}


	

}
