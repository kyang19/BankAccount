/**
 * 
 * @author kimyang
 *BankAccount Class 
 */
public class BankAccount {

	private String name; 
	private int accNum;
	private double balance;
	
	public BankAccount(String a, int b)
	{
		name = a;
		accNum = b; 
		balance = 0; 
	}
	
	public BankAccount(String a, int b, double c)
	{
		name = a;
		accNum = b;
		balance = c;
	}
	
	public void deposit(double d)
	{
		balance = balance + d;
	}
	
	public void withdraw(double e)
	{
		balance = balance - e;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String toString()
	{
		return "Name of account: " + name + " Account Number: " 
	+ accNum + " Balance: " + balance;
	}
}
