package ua.lviv.lgs.task_02;

public class Rectangle {

	private int lenght;
	private int width;
	
	public Rectangle(int lenght) {
		this.lenght = 10;
	}
	
	public Rectangle(int lenght, int width) {
		this(lenght);
		this.width = width;
	}

	public int getLenght() {
		return lenght;
	}

	public int getWidth() {
		return width;
	}

	@Override
	public String toString() {
		return "Rectangle [lenght=" + lenght + ", width=" + width + "]";
	}
	
	
	
}
