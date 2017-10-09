//Create a class named Text that implements Drawable and has a String field called value. Add gets and sets, as well as an appropriate constructor. Have Text's draw() method print the value field. Modify your tester program so that a Text object is added into the array instead of one of the Rectangles.

package ch12;

public class Text implements Drawable {
	private String value;

	public void draw() {
		System.out.println("Value: " + value);
	}

	public Text(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
