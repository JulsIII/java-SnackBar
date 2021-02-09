package snackbarApp;

public class Main 
{
    private static void workWithData()
    {
        System.out.println("Welcome to the Snack Bar!");


            Customer  c1 = new Customer("Carl", 84.53);
            Customer  c2 = new Customer("Jewl", 43.15);
//         Customer  cus3 = new Customer("Ct. Dracula", 750.00);


            VendingMachine v1 = new VendingMachine("Food");
            VendingMachine v2 = new VendingMachine("Drink");
            VendingMachine v3 = new VendingMachine("Office");
      

            Snack s1 = new Snack("Chips", 17, 1.75, v1.getId());
            Snack s2 = new Snack("Chocolate Bar", 21, 1.00, v1.getId());
            Snack s3 = new Snack("Pretzel", 28, 2.00, v1.getId());
            Snack s4 = new Snack("Soda", 17, 2.50, v2.getId());
            Snack s5 = new Snack("Water", 21, 2.75, v2.getId());


//         System.out.println("*** Working with Data\n");
//         System.out.println();
//         System.out.println();
//         // System.out.println("Debt for c1 " + c1.debt);
//         System.out.println();
//         // double newSalary = emp1.getSalary() * 1.05;
//         // System.out.println(emp1.getSalary() + " " + newSalary);
    }
	public static void main(String[] args) 
	{
		workWithData();
	}
}