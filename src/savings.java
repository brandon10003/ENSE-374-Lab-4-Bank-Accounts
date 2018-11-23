
public class savings extends account {

	protected int withdrawlim;
	protected int monthlywithdraws;
	
	savings()
	{
		intrrate = 2.0;
		balance = 0.0;
		atmfee = 3.0;
		nsffee = 90.0;
		maintfee = 0.0;
		intrtype = 2;
		withdrawlim = 10;
		monthlywithdraws = 0;
		
	}
	public void withdraw(double out)
	{
		if (monthlywithdraws == withdrawlim)
		{
			System.out.println("You have exceeded your amount of withdrawls for this month.");
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
