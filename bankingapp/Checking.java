package bankingapp;

public class Checking extends Account
{
	//Properties specific to a Checking Account
	private int debitCardNumber;
	private int debitCardPin;
	
	//Constructor to initialize checking account properties
	public Checking(String name,String sSN,double initDeposit)
	{
		super(name,sSN,initDeposit);
		accountNumber = "2"+ accountNumber;
		setDebitCard();
	}
	
	private void setDebitCard()
	{
		debitCardNumber = (int) (Math.random()*Math.pow(10, 12));
		debitCardPin = (int) (Math.random()* Math.pow(10,4));
		
		
	}
	
	@Override
	public void setRate() 
	{
		rate = getBaseRate() * .15;
		
	}
	
	

	//Methods Specific To Checking Account
	public void showInfo()
	{
		super.showInfo();
		System.out.println(
				"Your Checking Account Features"+
				"\nDebit Card Number " + debitCardNumber+
				"\nDebit Card Pin " + debitCardPin
				
				);
	}

	
	
	
}
