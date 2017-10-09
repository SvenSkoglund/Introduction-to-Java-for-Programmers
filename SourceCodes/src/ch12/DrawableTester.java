/*Write a tester program that contains a main() method that creates an array of three Shapes.
Store two Rectangles and a Circle in the array. Loop through the array, printing out the area of
each shape.*/

package ch12;

public class DrawableTester {

	public static void main(String[] args) {

		Drawable [] testShape = new Drawable[3];
		testShape[0] = new Rectangle2(1, 1, 2, 2,Color.RED);
		testShape[1] = new Rectangle2(1, 1, 6, 8,Color.BLUE);
		testShape[2] = new Circle2(1, 1, 12,Color.PURPLE);

		
        for (Drawable d : testShape) {
            d.draw();
            System.out.println("Area: "+((Shape2) d).getArea());
        }
	}

}
