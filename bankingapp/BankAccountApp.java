package bankingapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) 
	{
		List<Account> accounts = new LinkedList<Account>();
		
		/*Checking chacc1 = new Checking("Tom", "123456789", 1500);
		chacc1.showInfo();
		
		
		
		System.out.println("*******************");
		Savings savacc1 = new Savings("Benny","987654321", 2500);
		savacc1.showInfo();
		savacc1.compound();*/
		
		//Read a CSV File then create new accounts based on that data
		String file = "C:\\Users\\Benny\\Downloads\\NewBankAccounts.csv";
		List<String[]> newAccountHolder = utilities.CSV.read(file);
		
		for(String[] accountHolder : newAccountHolder)
		{
			String name = accountHolder[0];
			String sSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			//System.out.println(name + " " + sSN + " " + accountType + "Rs " + initDeposit );
			if(accountType.equals("Savings"))
			{
				accounts.add(new Savings(name,sSN,initDeposit));
				
			}
			else if(accountType.equals("Checking"))
			{
				accounts.add(new Checking(name,sSN,initDeposit));
				
			}
			else
			{
				System.out.println("Error Reading Account Type");
			}
		}
		
		for(Account acc : accounts)
		{
			System.out.println("****************");
			acc.showInfo();
		}
		
		
	}

}
