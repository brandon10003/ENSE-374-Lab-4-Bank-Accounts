
public class account {
	
	protected double intrrate;
	protected double balance;
	protected double atmfee;
	protected double nsffee;
	protected double maintfee;
	protected int intrtype;
	
	public void deposit(double in)
	{
		balance = balance + in;
		System.out.println("$" + in + " has been deposited to your account.");
	}
	public double getBalance() 
	{
		return balance;
	}
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
