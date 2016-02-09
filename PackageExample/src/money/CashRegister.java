/* sdfsdf */
package money;
public class CashRegister
{
	private int cashOnHand;
	//default constructor
	public CashRegister()
	{
		cashOnHand  = 500;
	}
	//overloaded constructor
	public CashRegister(int cash)
	{
		if (cash < 0)
			cashOnHand = 500;
		else
			cashOnHand = cash;
	}
	//accessor or getter
	public int getCashOnHand()
	{
		return cashOnHand;
	}
	
	public void addToCashOnHand(int cash) 
	{
		if (cash < 0)
			cashOnHand = 0;
		cashOnHand = cashOnHand + cash;
	}
}
