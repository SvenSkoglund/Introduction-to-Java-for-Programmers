package ch10;

public class Employee {

	private String firstName;
	private String lastName;
	private float salary;
	private int id;
	private static int minWage = 1000;
	private static int retireAge = 65;
	
	public Employee() {
		this("J","Doe");
	}
	
	public Employee(String fn, String ln)
	{
		this.firstName = fn;
		this.lastName = ln;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getMinWage() {
		return minWage;
	}

	public static void setMinWage(int minWage) {
		Employee.minWage = minWage;
	}

	public static int getRetireAge() {
		return retireAge;
	}

	public static void setRetireAge(int retireAge) {
		Employee.retireAge = retireAge;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + ", id=" + id
				+ "]";
	}




	public void showEmp() {
		System.out.println(this.firstName);
		System.out.println(this.lastName);
		System.out.println(this.salary);
		System.out.println(this.id);
		System.out.println(this.minWage);
		System.out.println(this.retireAge);
	}
}
