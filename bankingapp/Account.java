package bankingapp;

public abstract class Account implements IBaseRate 
{
	//List Common properties for savings and checking accounts
	private String name;
	private String sSN;
	protected String accountNumber;
	private double balance;
	protected double rate;
	private static int index=10000;
	
	//Constructor to set the base properties and initialize the account
	public Account(String name,String sSN, double initDeposit)
	{
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		
		//Set Account Number
		index++;
		this.accountNumber = setAccountNumber();
		
		setRate();
		
	}
	
	public abstract void setRate();
	
	
	private String setAccountNumber()
	{
		String lastTwoOfSSn= sSN.substring(sSN.length()-2,sSN.length());
		int uniqueId = index;
		int random = (int)(Math.random() * Math.pow(10, 3));
		return lastTwoOfSSn + uniqueId + random;
		
	}
	
	public void compound()
	{
		double accuredInterest = balance * (rate/100);
		balance += accuredInterest;
		System.out.println("Accured Interest:"+accuredInterest);
		printBalance();
	}
	
	//List Of Common Methods
	public void deposit(double amount)
	{
		balance +=amount;
		System.out.println("Depositing: "+amount);
		printBalance();
	}
	
	public void withdraw(double amount)
	{
		balance -= amount;
		System.out.println("Withdrawing: "+amount);
		printBalance();
	}
	
	public void transfer(String toWhere,double amount)
	{
		balance -= amount;
		System.out.println("Tranfering Rs"+ amount +"To"+ toWhere );
		printBalance();
	}
	
	public void printBalance()
	{
		System.out.println("Your Balance is now Rs: "+balance);
	}
	
	public void showInfo()
	{
		System.out.println(
				"Name: "+ this.name +
				"\nAccount Number: "+ accountNumber+
				"\nBalance: "+balance + 
				"\nRate: "+rate + "%"
				
				
				);
		
	}
}
