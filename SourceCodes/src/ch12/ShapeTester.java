/*Write a tester program that contains a main() method that creates an array of three Shapes.
Store two Rectangles and a Circle in the array. Loop through the array, printing out the area of
each shape.*/

package ch12;

public class ShapeTester {

	public static void main(String[] args) {

		Shape1[] testShape = new Shape1[3];
		Rectangle1 rec1 = new Rectangle1(1, 1, 2, 2,Color.RED);
		Rectangle1 rec2 = new Rectangle1(1, 1, 6, 8,Color.BLUE);
		Circle1 circ = new Circle1(1, 1, 12,Color.PURPLE);

		testShape[0] = rec1;
		testShape[1] = rec2;
		testShape[2] = circ;
		
		for (int i = 0; i < testShape.length; i++) {
			System.out.println(testShape[i].getArea());
		}
	}

}
