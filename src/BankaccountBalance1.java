
import java.util.Scanner;
class BankaccountBalance1{

	static int currentbalance=10000;
	public static void main(String args[])

	{
//BankaccountBalance.bank();
//BankaccountBalance.balancecheck();
System.out.println("Your account balance is" +BankaccountBalance1.balancecheck());
	}

	public static void draw(){
Scanner obj=new Scanner(System.in);

			System.out.println("Enter Amount to Withdraw/Deposit " );

		//int total= currentbalance;
		int withdrawal=obj.nextInt();
if (currentbalance >= withdrawal) {
			System.out.println("You have Withdrawn "+ withdrawal);
			currentbalance = currentbalance - withdrawal;
			System.out.println("Balance after withdrawal: "+ currentbalance);}
else 
{
			System.out.println(" You can not withdraw "+ withdrawal);

			System.out.println("Your balance is: " + currentbalance);}
	}
	public static void deposit()
	{
				//int total= currentbalance;
		int deposit=100;
		System.out.println( " Deposited " + deposit);
		currentbalance = currentbalance + deposit;
		System.out.println("Balance after deposit: "+ currentbalance);
	}

	public static int balancecheck(){
		BankaccountBalance1.draw();
				BankaccountBalance1.deposit();
 
		System.out.println("Balance : "+ currentbalance);
		return currentbalance;
	}
}