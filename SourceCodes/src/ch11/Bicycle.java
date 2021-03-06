//Create a subclass of Vehicle called Bicycle that contains a field for the number of gears on the bicycle
//bike. All bikes should have two wheels

package ch11;

public class Bicycle extends Vehicle {
	private int gears;

	public Bicycle() {
		this(1, 2);
	}

	public Bicycle(int maxSpeed, int gears) {
		super(maxSpeed, 2);
		this.gears = gears;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	@Override
	public String toString() {
		return super.toString() + ", gears=" + gears ;
	}


}
