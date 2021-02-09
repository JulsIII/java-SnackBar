package snackbarApp;

public class Customer
{

	private static int maxId = 0;
	private int id;
	private String name;
	private double cash;


    public Customer(String name, double cash)
    {
    	maxId++;
    	id = maxId;

    	this.name = name;
    	this.cash = cash;
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

    public double getCash()
    {
    	return cash;
    }

//add cash to cash on hand
    public void addCash(double amount)
  {
      this.cash = this.cash + amount;
  } 

//buy snacks. Given the total cost of the snacks to be purchased, reduce the cash on hand by that amount
  public void buySnacks(double amount)
  {
    this.cash = this.cash - amount;
  }

}
