package ch10;

public class EmpTest {

	public static void main(String[] args) {

		Employee sven = new Employee("Sven","Skoglund");
		sven.setSalary(9999999);
		sven.setId(1);
		Employee blank = new Employee();
		
		sven.showEmp();
		
		System.out.println(sven);
		System.out.println(sven.toString());
	}

}
