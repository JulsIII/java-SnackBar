package snackbarApp;

public class Snack {
    private static int maxId = 0;
	
	private int id;

	private String name;

    private int quantity;

    private int cost;

    private int vending_machine_id;


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

    public int getVending_machine_id()
	{
		return vending_machine_id;
	}

	public String getQuantity()
	{
		return quantity;
	}
}

