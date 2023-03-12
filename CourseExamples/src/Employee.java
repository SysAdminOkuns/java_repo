
public class Employee extends Person {
	{
		System.out.println("Employee: First Instance Initialization Block");
	}
	static {
		System.out.println("Employee: First Static Block");
	}
	{
		System.out.println("Employee: Second Instance Initialization Block");
	}
	static {
		System.out.println("Employee: Second Static Block");
	}

	public Employee() {
		System.out.println("Employee()");
	}
}
