/*Retrofit Shape to implement Drawable, putting the actual implementation code in Rectangle and Circle. Don't worry about doing any graphics for drawing, just print out a simple message indicating the type, coordinates, and color of each shape you are "drawing."*/
package ch12;

public class Rectangle3 extends Shape3 {
	private int height;
	private int width;
	private String type = "Rectangle";


	public Rectangle3(int x, int y, int height, int width, Color color) {
		super(x, y);
		this.height = height;
		this.width = width;
		this.setColor(color);
		if (width == height) {
			type = "Square";
		}
	}

	public void draw() {
		System.out.println("Type: "+ this.type);
		System.out.println("X coordinate: " + this.getX());
		System.out.println("X coordinate: " + this.getY());
		System.out.println("Width: " + this.getWidth());
		System.out.println("Height: " + this.getHeight());
		System.out.println("Color: " + this.getColor());
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
