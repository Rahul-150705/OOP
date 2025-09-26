package emp;

public class Manager extends Employee{
	int teamsize;
	public Manager(String name, int employeeId, double salary,int teamsize)
	{
		super(name,employeeId,salary);
		this.teamsize=teamsize;
	}
	public void displayInfo()
	{
		System.out.println("Name:" + Name);
		System.out.println("employeeId: " + employeeId);
		System.out.println("Salary:" + getSalary());
		System.out.println("Salary:" + teamsize);
	}
}
