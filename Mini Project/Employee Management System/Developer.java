package emp;

public class Developer extends Employee{
	
	String programminglanguage;

	public Developer(String name, int employeeId, double salary, String programminglanguage) {
		super(name, employeeId, salary);
		this.programminglanguage = programminglanguage;
	}
	public displayInfo()
	{
		System.out.println("Name:" + Name);
		System.out.println("employeeId: " + employeeId);
		System.out.println("Salary:" + getSalary());
		System.out.println("Programming Language:" + programminglanguage);
	}
}
