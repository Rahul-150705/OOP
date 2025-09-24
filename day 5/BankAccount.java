package bank;

public class BankAccount {
	private int accountNumber; // data hiding making them private
	private double balance; // data hiding making them private
	public BankAccount(int accountNumber,double balance)  // this is wrapping up methods and showing only necessary details 
	{
		this.accountNumber=accountNumber;
		if(balance>0)
		{
		this.balance=balance;
		}
		else
		{
			System.out.println("Invalid Amount");
		}
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance+=amount;
			System.out.println("Deposited");
		}
		else
		{
			System.out.println("Invalid");
		}
	}
	public void withdraw(double amount)
	{
		if(amount>0)
		{
			balance-=amount;
			System.out.println("Withdraw Completed");
		}
		else
		{
			System.out.println("Invalid Amount");
		}
	}
}
