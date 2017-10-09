package ch12;

public abstract class Shape1 {
	private int x;
	private int y;
	
	public Shape1 (int x, int y) {
		this.x = x;
		this.y =y;
	}
	
	public abstract int getArea();

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
	
