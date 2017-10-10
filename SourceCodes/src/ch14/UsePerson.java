/*Create an exception class called BadAgeException. Modify the Person class to contain an age
field. Add an int argument to the Person constructor for the age. If the age given to the constructor
is less than 0 or greater than 120, throw the BadAgeException. Modify the UsePerson class to
test this constructor*/


package ch14;


public class UsePerson {
    public static void main(String[] args) {
        Person p = null;
        String name = null;
        name = "Some Name"; // comment this line to see an exception
        int age = 1;// set this <0 or >120 to see an exception

        try {
            p = new Person(name, age);
        }
        catch (InvalidDataException e) {
            System.err.println(e.getMessage());
        }
        catch (BadAgeException e) {
        	System.err.println(e.getMessage());
        }
    }
}
