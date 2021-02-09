package snackbarApp;

public class Customer
{

	private static int maxId = 0;
	private int id;
	private String name;
	private double cashonHand;


    public Customer(String name, double cashonHand)
    {
    	maxId++;
    	id = maxId;

    	this.name = name;
   
    	this.cashonHand = cashonHand;
    }

    public int getId()
    {
    	return id;
    }

    public String getName()
    {
    	return name;
    }

    public void setName(String name)
    {
    	this.name = name;
    }

//add cash to cash on hand

      public double getcashonHand()
    {
    	return cashonHand;
    }

//buy snacks. Given the total cost of the snacks to be purchased, reduce the cash on hand by that amount

}
