
public class money_market extends account {

	protected int withdrawlim;
	protected int checklim;
	protected double mincheckval;
	protected double minbalance;
	protected int monthlywithdraws;
	
	money_market()
	{
		intrrate = 0.0;
		balance = 0.0;
		atmfee = 3.0;
		nsffee = 45.0;
		maintfee = 25.0;
		intrtype = 0;
		minbalance = 5000.0;
		withdrawlim = 5;
		checklim = 10;
		mincheckval = 200.0;
	}
	public void check(double chkamnt)
	{
		
	}
	public void withdraw(double out)
	{
		if (monthlywithdraws == withdrawlim)
		{
			System.out.println("You have exceeded your amount of withdrawls for this month.");
		}
		else if ((balance - out) < minbalance)
		{
			System.out.println("Withdrawing $" + out + " will put you below the minimum account balance.");
		}
		else
		{
			balance = balance - out;
			System.out.println("$" + out + " has been added to your wallet.");
			monthlywithdraws--;
			
		}
	}
	public void newmonth()
	{
		monthlywithdraws = 0;
	}
}
