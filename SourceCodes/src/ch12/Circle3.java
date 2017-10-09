/*Retrofit Shape to implement Drawable, putting the actual implementation code in Rectangle and Circle. Don't worry about doing any graphics for drawing, just print out a simple message indicating the type, coordinates, and color of each shape you are "drawing."*/

package ch12;

public class Circle3 extends Shape3 {
	private double radius;
	private String type = "Circle";

	public Circle3(int x, int y, double radius, Color color) {
		super(x, y);
		this.radius = radius;
		this.setColor(color);
	}
	
	public void draw() {
		System.out.println("Type: "+ this.type );
		System.out.println("X coordinate: " + this.getX());
		System.out.println("X coordinate: " + this.getY());
		System.out.println("Radius: " + this.getRadius());
		System.out.println("Color: " + this.getColor());
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
