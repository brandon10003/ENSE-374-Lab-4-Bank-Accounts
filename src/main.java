import java.io.*;
import java.util.*;

public class main {

	public static void main(String[] args) {
		
		Scanner instream = new Scanner(System.in);
		
		char in;
		boolean correctin = false;
		boolean steadyintr	= false;
		boolean manywithdraws = false;
		boolean checks = false;
		boolean maintfees = false;
		int initbalance = 0;
		
		int checking = 0;
		int savings = 0;
		int moneymarket = 0;
		
		while (!correctin)
		{
			System.out.println("Do you require a steady and static interest rate? (y/n)");
			in = instream.next().charAt(0);
			in = Character.toLowerCase(in);
			
			if (in == 'y')
			{
				steadyintr = true;
				correctin = true;
			}
			else if (in == 'n')
			{
				steadyintr = false;
				correctin = true;
			}
			else
			{
				System.out.println("That is not a valid input, please try again.");
			}
		}
		
		correctin = false;
		
		while (!correctin)
		{
			System.out.println("Do you require many withdrawls per month? (y/n)");
			in = instream.next().charAt(0);
			in = Character.toLowerCase(in);
			
			if (in == 'y')
			{
				manywithdraws = true;
				correctin = true;
			}
			else if (in == 'n')
			{
				manywithdraws = false;
				correctin = true;
			}
			else
			{
				System.out.println("That is not a valid input, please try again.");
			}
		}
		
		correctin = false;
		
		while (!correctin)
		{
			System.out.println("Do you require checks? (y/n)");
			in = instream.next().charAt(0);
			in = Character.toLowerCase(in);
			
			if (in == 'y')
			{
				checks = true;
				correctin = true;
			}
			else if (in == 'n')
			{
				checks = false;
				correctin = true;
			}
			else
			{
				System.out.println("That is not a valid input, please try again.");
			}
		}
		
		correctin = false;
		
		while (!correctin)
		{
			System.out.println("Do you wish to pay maintainence fees? (y/n)");
			in = instream.next().charAt(0);
			in = Character.toLowerCase(in);
			
			if (in == 'y')
			{
				maintfees = true;
				correctin = true;
			}
			else if (in == 'n')
			{
				maintfees = false;
				correctin = true;
			}
			else
			{
				System.out.println("That is not a valid input, please try again.");
			}
		}
		
		correctin = false;
		
		while (!correctin)
		{
			System.out.println("What is the initial amount for the account?");
			initbalance = instream.nextInt();
			correctin = true;
		}
		
		correctin = false;
		
		if (steadyintr) 
		{
			checking++;
			savings++;
		}

		if (manywithdraws)
		{
			checking++;
		}

		if (checks)
		{
			checking++;
			moneymarket++;
		}

		if (maintfees)
		{
			checking++;
			moneymarket++;
		}
		
		if (initbalance < 5000)
		{
			checking++;
			savings++;
		}
		else
		{
			moneymarket++;
		}
		
		while (!correctin)
		{
			System.out.println("Based on your responses we have generated numbers"
					+ "for accounts which would be most comatible to you. Higher numbers being more compatible.");
			System.out.println("Checking: " + checking);
			System.out.println("Savings: " + savings);
			System.out.println("Money Market: " + moneymarket);
			System.out.println("Which kind of account would you like? Enter 'c' for checking, 's' for savings or "
					+ "'m' for money market.");
			in = instream.next().charAt(0);
			in = Character.toLowerCase(in);
			
			if (in == 'a')
			{
				correctin = true;
				checking account1 = new checking();
			}
			else if (in == 's')
			{
				correctin = true;
				savings account1 = new savings();
			}
			else if (in == 'm')
			{
				correctin = true;
				money_market account1 = new money_market();
			}
			else
			{
				System.out.println("That is not a valid input, please try again.");
			}
		}
		
		correctin = false;
		
		System.out.println("We will now test the interest in a savings account");
		
		for (int i = 0;i<24;i++)
		{
			//account1.calcInterest();
			//System.out.println(account1.getBalance);
		}
		
	}

}
