/*Create an exception class called BadAgeException. Modify the Person class to contain an age
field. Add an int argument to the Person constructor for the age. If the age given to the constructor
is less than 0 or greater than 120, throw the BadAgeException. Modify the UsePerson class to
test this constructor*/

package ch14;

public class BadAgeException extends Exception{
	public String getMessage() {
		return "Invalid Age";
	}
}
