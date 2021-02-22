package ch06homework.exercise19;

public class Account {
	
	final static int MIN_BALANCE = 0;
	final static int MAX_BALANCE = 1000000;
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(!(balance>MAX_BALANCE || balance <MIN_BALANCE))
			this.balance = balance;
	}

}
