package bankingapp;

public interface IBaseRate 
{
	//Method that return Base Rate
	default double getBaseRate()
	{
		return 2.5;
	}

}
