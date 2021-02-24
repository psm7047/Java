package ch10.exam06;

public class Example {

	public static void main(String[] args) {
		
		Account ac = new Account();
		
		try {
		String ano = null;
		ac.deposit(ano, 1000);
		} catch(NoAccountException e) {
			System.out.println(e.getMessage());
		}
		
		String ano = "111-222-333";
		
		try {
			ac.withdraw(ano, 100);
			ac.withdraw(ano, 1000);
		}
		catch(NoAccountException e) {
			System.out.println(e.getMessage());
		}
		catch(BalanceLackException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}
