
public class MyCar {

	public static void main(String[] args) {
//		Car object instantiation
		Car redCar = new Car("Toyota", "RAV4", "SUV", "Red", 25000);
		Car blueCar = new Car("Toyota", "Camry", "Sedan", "Blue", 16000);
		Car whiteCar = new Car("Mercedes Benz", "C-Class", "Sedan", "Purple", 60000);
		whiteCar.doSomething(whiteCar);
		Car.start(blueCar);
		Car.start(redCar);
		Car.drive(redCar);
		Car.stop(redCar);
		System.out.println(redCar.serialNumber);
		System.out.println(blueCar.serialNumber);
		int totalCarCreated = Car.getCarCount();
		System.out.println(totalCarCreated);
	}

}
