//Add a toString() method to both the Vehicle class and the Bicycle class. Have Bicycle's
//toString() use Vehicle's toString(). Write an application that creates a Vehicle with three wheels
//and a top speed of 45 mph (like an ATV) and a Bicycle with ten gears and a top speed of 30 mph.
//Display both objects

package ch11;

public class VehicleTest {

	public static void main(String[] args) {

		Bicycle test = new Bicycle(30, 10);
		// System.out.println(test.toString());

		Vehicle atv = new Vehicle(45, 3);
		// System.out.println(atv.toString());

		Vehicle[] vArray = new Vehicle[3];
		vArray[0] = test;
		vArray[1] = new Bicycle(25, 3);
		vArray[2] = new Vehicle();

		for (Vehicle vehicle : vArray) {
			System.out.println(vehicle.toString());
		}
	}

}
