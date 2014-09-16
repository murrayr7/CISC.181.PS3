
public class Test {

	public static void main(String[] args) {
		Account account = new Account(1122,20000);
		Account.setAnnualInterestRate(4.5);
		try{
			account.withdraw(2500);
			account.deposit(3000);
			System.out.printf("The account balance is: $%.2f "
					+ "\nThe monthly interest rate is: %.3f%% "
					+ "\nThe account was created on %s",
					account.getBalance(),account.getMonthInterestRate(), account.getDateCreated().toString() );
		}catch(InsufficientFundsException e){
			System.out.println("Sorry, but you are short $"
					+ e.getAmount());

		}
		
		try{
			System.out.println("\n\nwithdrawing $20,000...");
			account.withdraw(20000);
			System.out.println("withdrawing $1,000...");
			account.withdraw(1000);
		}catch(InsufficientFundsException e){
			System.out.println("\nSorry, but you are short $"+ e.getAmount());
		}

	}
}
