
public class money_market extends account {

	protected int withdrawlim;
	protected int checklim;
	protected double mincheckval;
	protected double minbalance;
	
	money_market()
	{
		intrrate = 0.0;
		balance = 0.0;
		atmfee = 3.0;
		nsffee = 45.0;
		maintfee = 25.0;
		intrtype = 0;
		minbalance = 5000.0;
	}
	public void check(double chkamnt)
	{
		
	}
	public void withdraw(double out)
	{
		
	}
}
