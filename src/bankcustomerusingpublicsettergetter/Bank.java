package bankcustomerusingpublicsettergetter;

public class Bank {
	//providing security to the data members
	private int totalAmount=100000;
	private int pin=5555;
	//using public setter for controlled access
	public void setData(int key,int amount)
	{
	if(pin==key)
	{
		totalAmount=totalAmount-amount;
	}
	else
	{
		System.out.println("invalid Customer");
		System.exit(0);
	}
}
	//using public getter method for controlled access
	public int getData(int key,int amount)
	{
	if(pin==key)
	{
		System.out.println("The given amount is:"+amount);
		System.out.println("The updated balance is:");
		return totalAmount;
	}
	else
	{
		System.out.println("Invalid customer");
		return -1;
	}

}
}

