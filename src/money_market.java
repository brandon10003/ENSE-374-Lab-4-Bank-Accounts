/**
 * 
 *@author clark27b
 * withdrawlim Holds the maximum number of monthly withdrawls
 * monthlywithdraws Holds the amount of withdrawls the user has done this month
 * checklim Holds the maximum amount of checks per month
 * mincheck Holds the minimum value of checks to be subtracted from the account
 * minbalance Holds the minimum balance of the account that the user must maintain
 */
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
		nsffee = 0.0;
		maintfee = 25.0;
		intrtype = 0;
		minbalance = 5000.0;
		withdrawlim = 5;
		checklim = 10;
		mincheckval = 200.0;
	}
	/**
	 * 
	 * @param chkamnt Holds the amount of the check to be subtracted from the account
	 */
	public void check(double chkamnt)
	{
		if ((balance - chkamnt) < minbalance)
		{
			System.out.println("WIrting a check for $" + chkamnt + " will put you below the minimum account balance.");
		}
		else
		{
		balance = balance - chkamnt;
		System.out.println("A check for $" + chkamnt + " has been subtracted from your account.");
		}
	}
	/**
	 * 
	 * @param out Holds the amount the user wishes to withdraw
	 */
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
	/**
	 * Resets the monthly withdrawls count as if it were a new month
	 */
	public void newmonth()
	{
		monthlywithdraws = 0;
	}
}
