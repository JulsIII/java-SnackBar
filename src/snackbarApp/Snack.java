package snackbarApp;

public class Snack {
    private static int maxId = 0;

	private int id;
	private String name;
    private int quantity;
    private double cost;
    private int vmId;


	public Snack(String name)
	{
		maxId++;
		id = maxId;

		this.name = name;
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

	public double cost()
	{
		return cost;
	}

	public void setcost(double cost)
    {
    	this.cost = cost;
    }

	public int getvmId()
	{
		return vmId;
	}

	public void setvmId(int vmId)
    {
    	this.vmId = vmId;
    }
	
	public int getQuantity()
	{
		return quantity;
	}

//add quantity when given how many to add

//buy snack when given how many to buy

//get total cost given a quantity

}

