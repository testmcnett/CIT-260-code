import java.util.Scanner;

import money.CashRegister;
import test.*;

public class CashRegisterTest
{
	public static void main(String[] args)
	{
		CashRegister obj1 = new CashRegister(50);
		obj1.addToCashOnHand(-50);
		System.out.println("Current cash: " + obj1.getCashOnHand());
		Scanner a = new Scanner(System.in);
		System.out.println("enter something");
		System.out.println("you entered: "+a.nextInt());
	}
}
