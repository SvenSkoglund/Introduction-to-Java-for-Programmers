//Write a tester program that contains a main() method that creates an array of three Shapes.
//Store two Rectangles and a Circle in the array. Loop through the array, printing out the area of
//each shape.
//Create a class named Text that implements Drawable and has a String field called
//value. Add gets and sets, as well as an appropriate constructor. Have Text's draw() method print
//the value field. Modify your tester program so that a Text object is added into the array instead of
//one of the Rectangles.
package ch12;

public class DrawableTester2 {

	public static void main(String[] args) {

		Drawable [] testShape = new Drawable[3];
		testShape[0] = new Rectangle2(1, 1, 2, 2,Color.RED);
		testShape[1] = new Text("This is a test");
		testShape[2] = new Circle2(1, 1, 12,Color.PURPLE);

		
        for (Drawable d : testShape) {
            d.draw();
        }
	}

}
