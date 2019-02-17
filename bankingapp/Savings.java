package bankingapp;

public class Savings extends Account
{
	private int safetyDepositBoxId;
	private int safetyDepositBoxKey;
	
	public Savings(String name,String sSN, double initDeposit)
	{
		super(name,sSN,initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
	}
	
	private void setSafetyDepositBox()
	{
		safetyDepositBoxId = (int)(Math.random() * Math.pow(10, 3));	
		safetyDepositBoxKey = (int)(Math.random()*Math.pow(10, 4));
	}
	
	@Override
	public void setRate() 
	{
		rate = getBaseRate() - .25;
		
		
	}
	
	//Methods Specific to Savings Account
	public void showInfo()
	{
		super.showInfo();
		System.out.println(
				"Your Savings Account Features"+
				"\nSafety Deposit Box Id "+safetyDepositBoxId +
				"\nSafety Deposit Key " +safetyDepositBoxKey
				
				);
		
	}

	
}
