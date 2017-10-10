/*Create a package called animal with two public classes, Dog and Cat. Create a Java application,
within another package, that creates both a Dog and a Cat object. Test without using import, then
again with the import statement*/
package ch13.animal;

public class Cat {
	String voice = "Meow";

	public Cat() {
		System.out.println(voice);
	}
}
