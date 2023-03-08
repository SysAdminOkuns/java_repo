/**
 * 
 */

/**
 * @author NosaOkundaye
 * 
 * Default values for primitive data types
 * char c = 'u0000' || NUL;
 * byte, short, int , double = 0;
 * float, long = 0.0
 *
 */
public class Car {

	/**
	 *  Defining the car class
	 *  Attributes: Make, Model, Type, Color, Price
	 *  Behavior: Start, Drive, Brake, Reverse, Stop 
	 */
//	Declare initial variables
	String make, model, type, color;
	int price;
//	 Initialization block
	{
		make = "someMake";
		model = "someModel";
		type = "someType";
		color = "red";
		price = 0;
	}
	
	public Car() {
		
	}
	
	public Car(String m, String ml) {
		make = m;
		model = ml;
	}
	
	public Car(String m, String ml, int p) {
		make = m;
		model = ml;
		price = p;
	}
	
	public Car(String m, String ml, String t, String c, int p) {
		// TODO Auto-generated constructor stub
		make = m;
		model = ml;
		type = t;
		color = c;
		price = p;
	}
	
	static void start(Car c) {
		Car sampleCar = new Car(c.make, c.model, c.type, c.color, c.price);
		System.out.println("The " + sampleCar.color + " " + sampleCar.make + " is starting ...");
	}
	
	static void drive(Car c) {
		Car sampleCar = new Car(c.make, c.model, c.type, c.color, c.price);
		System.out.println("The " + sampleCar.color + " " + sampleCar.make + " is moving, brooom!");
	}
	static void stop(Car c) {
		Car sampleCar = new Car(c.make, c.model, c.type, c.color, c.price);
		System.out.println("The " + sampleCar.color + " " + sampleCar.make + " has stopped.");
	}

}
