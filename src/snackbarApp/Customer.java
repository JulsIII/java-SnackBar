package snackbarApp;

public class Customer
{

	private static int maxId = 0;
	private int id;
	private String name;
	private double cashonHand;
//  private double cash;


    public Customer(String name, double cashonHand)//, double cash)
    {
    	maxId++;
    	id = maxId;

    	this.name = name;
      // this.cash = cash;
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

      public double getcashonHand()
    {
    	return cashonHand;
    }

    public void setcashonHand(double cashonHand)
    {
    	this.cashonHand = cashonHand;
    }

//     public double getcash()
//     {
//     	return cash;
//     }

//     public void setcash(double cash)
//     {
//     	this.cash = cash;
//     }

//    public Double addCashtoCashonHand()
//     {
//     	return cashonHand + cash;
//     }

}
