/**
 * 
 *@author clark27b
 *@param withdrawlim Holds the maximum number of monthly withdrawls
 *@param monthlywithdraws Holds the amount of withdrawls the user has done this month
 */
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
	/**
	 * 
	 * @param out holds the amount the user wishes to withdraw
	 */
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
	/**
	 * Resets the monthly withdrawls count as if it were a new month
	 */
	public void newmonth()
	{
		monthlywithdraws = 0;
	}
}
