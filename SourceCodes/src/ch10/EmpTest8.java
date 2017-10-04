package ch10;

public class EmpTest8 {

	public static void main(String[] args) {

		Employee sven = new Employee("Sven","Skoglund");
		sven.setSalary(9999999.00F);
		sven.setId(1);
		
		Employee stefan = new Employee("Stefan","Skoglund");
		stefan.setSalary(9999999);
		stefan.setId(1);
		
		System.out.println(sven.toString());
	}

}
