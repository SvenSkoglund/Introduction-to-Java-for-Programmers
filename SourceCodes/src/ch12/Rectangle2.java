/*Develop two child classes of Shape: Rectangle and Circle. A Rectangle has a width and
height, a Circle has a radius. Provide gets and sets for each field and appropriate constructors.
Implement the getArea() method in each subclass*/

package ch12;

public class Rectangle2 extends Shape2 {
	private int height;
	private int width;

	public Rectangle2(int x, int y, int height, int width, Color color) {
		super(x, y);
		this.height = height;
		this.width = width;
		this.setColor(color);
	}

	@Override
	public void draw() {
		System.out.println("X coordinate: " + this.getX());
		System.out.println("X coordinate: " + this.getY());
		System.out.println("Width: " + this.getWidth());
		System.out.println("Height: " + this.getHeight());
		System.out.println("Color" + this.getColor());
	}

	public int getArea() {
		int area = this.height * this.width;
		return area;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
