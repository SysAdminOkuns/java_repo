
public class Instructor extends Employee {
	{
		System.out.println("Instructor: First Instance Initialization Block");
		str1 = "First Instance Initialization String";
	}
	static {
		System.out.println("Instructor: First Static Block");
		str1 = "First Static Initialization String";
	}
	public static String str1 = "Explicit Initialization String";
	{
		System.out.println("Instructor: Second Instance Initialization Block");
		str1 = "Second Instance Initialization String";
	}
	static {
		System.out.println("Instructor: Second Static Block");
		str1 = "Second Static Initialization String";
	}

	public Instructor() {
		System.out.println("Instructor()");
	}
}
