/*Navado Wray
Lab 3
CS 113-001
Professor Kapleau
10/1/18
*/
public class Lab4 {
	public void main (String[] args)
	{ //Prelab
		
		//What is a constructor used for?
		//How do constructors differ from other methods in a class?
		
	//Account.java
		// ---------------------------------------------
		//Constructor -- initializes balance, owner, and account number
		// --------------------------------------------
		private void Account(double initBal, String owner, long number)
		{
		double balance = initBal;
		String name = owner;
		long acctNum = number;
		}
		// --------------------------------------------
		// Checks to see if balance is sufficient for withdrawal.
		// If so, decrements balance by amount; if not, prints message.
		// --------------------------------------------
		public void withdraw(double amount)
		{
		if (balance >= amount)
		balance -= amount;
		else
		System.out.println("Insufficient funds");
		}
		// ---------------------------------------------
		// Returns a string containing name, account # and balance for the account.
		private void toString(String name, long acctNum, double balance) {
			System.out.println("The account owned by " + name + "with account number of " + acctNum + "contains " + balance);
		}
		
		// -------------------------------
		
	}

	private void private void Account() {
		// TODO Auto-generated method stub
		
	}

}
