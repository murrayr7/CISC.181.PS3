import java.util.*;

public class Account {
	private int id = 0;
	private double balance=0;
	private static double annualInterestRate = 0;
	//private Date dateCreated;
	private final Date dateCreated=new Date();
	
	public Account() {
		// this.dateCreated= new Date();
	}
	

	public Account(int id, double balance) {
		//this.dateCreated= new Date();
		this.id = id;
		this.balance = balance;
	}
	

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	protected double getBalance() {
		return balance;
	}

	protected void setBalance(double balance) {
		this.balance = balance;
	}

	protected static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	protected static void setAnnualInterestRate(double annaulInterestRate) {
		Account.annualInterestRate = annaulInterestRate;
	}

	protected Date getDateCreated() {
		return dateCreated;
	}
	
	
	public double getMonthInterestRate(){
		return Account.annualInterestRate/12;
	}
	
	public void withdraw(double ammount) throws InsufficientFundsException{
		if(ammount<=this.balance){
		this.balance-=ammount;
		}else{
			throw new InsufficientFundsException(ammount-this.balance);
		}
	}
	
	public void deposit(double ammount){
		this.balance+=ammount;
	}

}
