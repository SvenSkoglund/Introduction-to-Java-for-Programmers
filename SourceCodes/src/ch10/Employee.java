package ch10;

public class Employee {

	private String firstName;
	private String lastName;
	private float salary;
	private int id;
	private static int minWage = 1000;
	private static int retireAge = 65;
	private Title title;
	
	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public Employee() {
		this("J","Doe", 0 , 0 , Title.TEMP);
	}
	public Employee(String fn) {
		this(fn,"Doe", 0 , 0 , Title.TEMP);
	}
	public Employee(String fn, String ln) {
		this(fn,ln, 0 , 0 , Title.TEMP);
	}
	public Employee(String fn, String ln , float salary) {
		this(fn,ln, salary , 0 , Title.TEMP);
	}
	public Employee(String fn, String ln , float salary, int id) {
		this(fn,ln, salary , id , Title.TEMP);
	}
	
	public Employee(String fn, String ln, float salary, int id , Title title)
	{
		this.firstName = fn;
		this.lastName = ln;
		this.title = title;
		this.salary = salary;
		this.id = id;
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
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", Title=" + title + ", salary=" + String.format("%1$.2f%n",salary) + ", id=" + id
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
