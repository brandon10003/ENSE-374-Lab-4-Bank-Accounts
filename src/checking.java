/**
 * 
 *@author clark27b
 */
public class checking extends account {
	
	public checking()
	{
		intrrate = 0.05;
		balance = 0.0;
		atmfee = 3.0;
		nsffee = 45.0;
		maintfee = 25.0;
		intrtype = 1;
	}
/**
 * 
 * @param chkamnt Holds the amount of the check being subtracted from the account
 */
	public void check(double chkamnt)
	{
		balance = balance - chkamnt;
		System.out.println("A check for $" + chkamnt + " has been subtracted from your account.");
	}
	/**
	 * 
	 * @param out holds the amount the user wishes to withdraw
	 */
	public void withdraw(double out)
	{
		balance = balance - out;
		System.out.println("$" + out + " has been added to your wallet.");
	}
}
