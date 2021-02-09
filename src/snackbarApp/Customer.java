package snackbarApp;

public class Customer
{
	// info about an employee, what does an employee know
	// primative / base data types are lowercase - int, boolean, long, double, char
	// String is a class - classes are in caps!
	private static int maxId = 0;
	private int id;
	private String name;
	private double cashonHand;

    // behaviors - methods, actions
    // constructor
    // state -> setting a value for the fields
    /*
          Multi lines!!!
     */
    public Customer(String name, double cashonHand)
    {
    	maxId++;
    	id = maxId;

    	this.name = name;
    	this.cashonHand = cashonHand;
    }

    // getters and setters
    public int getId()
    {
    	return id;
    }

    public String getname()
    {
    	return name;
    }

    public void setFname(String fname)
    {
    	this.name = name;
    }

      public double cashonHand()
    {
    	return cashonHand;
    }

    public void cashonHand(double cashonHand)
    {
    	this.cashonHand = cashonHand;
    }


    // other methods
    // public String returnFullName()
    // {
    // 	return fname + " " + lname;
    // }
}
