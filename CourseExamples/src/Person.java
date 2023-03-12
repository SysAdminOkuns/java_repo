public class Person {
	{
		System.out.println("Person: First Instance Initialization Block");
	}
	static {
		System.out.println("Person: First Static Block");
	}
	{
		System.out.println("Person: Second Instance Initialization Block");
	}
	static {
		System.out.println("Person: Second Static Block");
	}

	public Person() {
		System.out.println("Person()");
	}

	public void sayHello() {
		System.out.println("Person: Hello!");
	}
}