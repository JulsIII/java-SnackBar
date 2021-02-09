package snackbarApp;


public class VendingMachine
{
	private static int maxId = 0;

	public int id;

	public String name;

	public VendingMachine(String name)//, int debt)
	{
		maxId++;
		id = maxId;

		this.name = name;
	}

	@Override
	public String toString()
	{
		String tmpString = "VendingOutput: " + "id: " + id + " name: " + name;// + " debt: " + debt;
		return tmpString;
	}
}