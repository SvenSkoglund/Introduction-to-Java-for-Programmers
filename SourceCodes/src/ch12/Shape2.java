/*Retrofit Shape to implement Drawable, putting the actual implementation code in Rectangle and Circle. Don't worry about doing any graphics for drawing, just print out a simple message indicating the type, coordinates, and color of each shape you are "drawing."*/

package ch12;

public abstract class Shape2 implements Drawable{
	private Color color;
	private int x;
	private int y;

	public Shape2(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public abstract int getArea();

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
