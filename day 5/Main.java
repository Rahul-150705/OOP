package bank;

public class Main {
	public static void main(String[] args) {
		BankAccount b1=new BankAccount(1234,5000); // abstraction hiding internal details and showing only whats necessary 
		b1.deposit(5000); // user dont know how this deposit words show only necessay details and hides internal implementation
		System.out.println(b1.getBalance());
	}
}
