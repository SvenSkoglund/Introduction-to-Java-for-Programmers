/*Develop two child classes of Shape: Rectangle and Circle. A Rectangle has a width and
height, a Circle has a radius. Provide gets and sets for each field and appropriate constructors.
Implement the getArea() method in each subclass*/


package ch12;

public class Circle1 extends Shape1 {
	private double radius;

	public Circle1(int x, int y, double radius, Color color) {
		super(x, y);
		this.radius = radius;
	}

	public int getArea() {
		double area = Math.PI*Math.pow(radius, 2);
		return (int)area;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
