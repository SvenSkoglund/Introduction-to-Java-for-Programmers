package ch11;

public class VehicleTest {

	public static void main(String[] args) {

		Bicycle test = new Bicycle(30 , 10);
		System.out.println(test.toString());

		Vehicle atv = new Vehicle (45 , 3);
		System.out.println(atv.toString());
		
	}

}
