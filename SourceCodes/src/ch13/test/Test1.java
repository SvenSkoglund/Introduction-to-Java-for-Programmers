/*Create a package called animal with two public classes, Dog and Cat. Create a Java application,
within another package, that creates both a Dog and a Cat object. Test without using import, then
again with the import statement*/
package ch13.test;

public class Test1 {

	public static void main(String[] args) {
		ch13.animal.Cat snowflake = new ch13.animal.Cat();
		ch13.animal.Dog crystal = new ch13.animal.Dog();
	}

}
