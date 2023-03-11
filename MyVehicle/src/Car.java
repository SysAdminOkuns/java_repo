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
	int price, serialNumber;
	static int carCount;
	Car myCar;
	static String color1; 
//	 Initialization block
	{
		make = "someMake";
		model = "someModel";
		type = "someType";
		color = "red";
		price = 0;
	}
	
	static {
		color1 = "Yellow";
	}
	
	public Car() {
		carCount++;
		serialNumber = carCount;
	}
	
	public Car(String m, String ml) {
//		Always put constructor chaining in the first line
//		Constructor chaining using this keyword
//		this("someMake", "someModel", 0);
		this();
		make = m;
		model = ml;
	}
	
	public Car(String m, String ml, int p) {
		this();
		make = m;
		model = ml;
		price = p;
	}
	
	public Car(String m, String ml, String t, String c, int p) {
		this();
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
	
	static int getCarCount() {
		return carCount;
	}
	
	void doSomething(Car car) {
		this.myCar = car;
		System.out.println("The color of my car is " + this.myCar.color);
		this.myCar = null;
	}

}
