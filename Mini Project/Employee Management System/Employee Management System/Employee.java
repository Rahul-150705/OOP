package emp;

public class Employee {
	String Name;
	int employeeId;
	private double salary;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String name, int employeeId, double salary) {
		super();
		this.Name = name;
		this.employeeId = employeeId;
		this.salary = salary;
	}
	public void displayInfo()
	{
		
	}
}
