@SuppressWarnings("serial")

public class InsufficientFundsException extends Exception
{
	private double ammount;

	public InsufficientFundsException(double ammount)
	{
		this.ammount = ammount;
	} 
	public double getAmount()
	{
		return ammount;
	}

}
