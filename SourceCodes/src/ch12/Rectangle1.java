package ch12;

public class Rectangle1 extends Shape1 {
	private int height;
	private int width;

	public Rectangle1(int x, int y, int height, int width) {
		super(x, y);
		this.height = height;
		this.width = width;
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
