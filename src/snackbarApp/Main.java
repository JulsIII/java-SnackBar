package snackbarApp;

public class Main 
{
    private static void workWithData()
    {
        System.out.println("Welcome to Lambda School's Java!!!");

        Healthplan h1 = new Healthplan("My Health 1");
        Healthplan h2 = new Healthplan("My Health 2");

        Company c1 = new Company("Company A", 100);
        Company c2 = new Company("Company B", 100);
//     public Employee(String fname, String lname, double salary, boolean has401K, int companyId, int healthPlanId)
        Employee emp1 = new Employee("Steve", "Green", 45000, true, c1.id, h1.getId());
        Employee emp2 = new Employee("May", "Ford", 80000, true, c1.id, h2.getId());
        Employee emp3 = new Employee("Doug", "Jones", 75000, false, c2.id, h2.getId());

        System.out.println("*** Working with Data\n");
        System.out.println();
        System.out.println(c1);
        System.out.println("Debt for c1 " + c1.debt);
        System.out.println();
        double newSalary = emp1.getSalary() * 1.05;
        System.out.println(emp1.getSalary() + " " + newSalary);
    }

	public static void main(String[] args) 
	{
		workWithData();
	}
}