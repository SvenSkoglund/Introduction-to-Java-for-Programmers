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
