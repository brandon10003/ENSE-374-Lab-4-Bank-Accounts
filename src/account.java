/**
 * 
 * @author clark27b
 * intrrate Holds the interest rate of the account
 * balance Holds the balance of the account
 * atmfee Holds the fee for withdrawing money from an atm
 * nsffee Holds the fee for not having significant balance in your account
 * maintfee holds the annual maintainence fee of the account
 * intrtype Represents the interest type. 0 for non-steady, 1 for monthly, 2 for bi-weekly.
 *
 */
public class account {
	
	protected double intrrate;
	protected double balance;
	protected double atmfee;
	protected double nsffee;
	protected double maintfee;
	protected int intrtype;
	/**
	 * 
	 * @param in The amount to be deposited
	 */
	public void deposit(double in)
	{
		balance = balance + in;
		System.out.println("$" + in + " has been deposited to your account.");
	}
	/**
	 * 
	 * @return	The account balance
	 */
	public double getBalance() 
	{
		return balance;
	}
	/**
	 * divides the interest rate by 24 for bi weekly or 12 for weekly
	 * then adds this compounding interest rate to one and multiplies that by the account balance
	 */
	public void calcInterest()
	{
		double terminterest;
		if (intrtype == 2)
		{
			terminterest = intrrate / 24;
			balance = balance * (1+terminterest);
		}
		else if (intrtype == 1)
		{
			terminterest = intrrate / 12;
			balance = balance * (1+terminterest);
		}
		System.out.println("Your account balance after this interest term is $" + balance + ".");
	}
}
