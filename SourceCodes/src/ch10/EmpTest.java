package ch10;

public class EmpTest {

	public static void main(String[] args) {

		Employee sven = new Employee("Sven","Skoglund");
		sven.setSalary(9999999);
		sven.setId(1);
		
		Employee stefan = new Employee("Stefan","Skoglund");
		sven.setSalary(9999999);
		sven.setId(1);
		
		sven.showEmp();
		
	}

}
