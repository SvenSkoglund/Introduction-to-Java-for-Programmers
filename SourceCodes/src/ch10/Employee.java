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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + Float.floatToIntBits(salary);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (Float.floatToIntBits(salary) != Float.floatToIntBits(other.salary))
			return false;
		return true;
	}
}
