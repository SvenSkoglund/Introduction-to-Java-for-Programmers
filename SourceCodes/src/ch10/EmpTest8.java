package ch10;

public class EmpTest8 {

	public static void main(String[] args) {

		Employee sven = new Employee("Sven","Skoglund", 1_000_000_000, 1,Title.CEO);
//		sven.setSalary(9999999.00F);
//		sven.setId(1);
		
		Employee stefan = new Employee("Stefan","Skoglund",1_000_000_000,2,Title.CFO);
//		stefan.setSalary(9999999);
//		stefan.setId(1);
		
		System.out.println(sven.toString());
		System.out.println(stefan.toString());

	}

}
