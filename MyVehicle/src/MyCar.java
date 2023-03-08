
public class MyCar {

	public static void main(String[] args) {
//		Car object instantiation
		Car redCar = new Car("Toyota", "RAV4", "SUV", "Black", 25000);
		Car.start(redCar);
		Car.drive(redCar);
		Car.stop(redCar);

	}

}
