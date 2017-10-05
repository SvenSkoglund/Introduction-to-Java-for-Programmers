//Create a class called Vehicle that contains fields for the vehicle's maximum speed and number of
//wheels. Provide both a no-argument constructor and a two-argument constructor. Provide accessor
//get and mutator set methods for the fields
package ch11;

public class Vehicle {

	private int maxSpeed;
	private int numWheels;

	public Vehicle() {
		this(50, 4);
	}

	public Vehicle(int maxSpeed, int numWheels) {
		super();
		this.maxSpeed = maxSpeed;
		this.numWheels = numWheels;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getNumWheels() {
		return numWheels;
	}

	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}

	@Override
	public String toString() {
		return "Vehicle [maxSpeed=" + maxSpeed + ", numWheels=" + numWheels + "]";
	}

}
