package inherit.polymorphism.model;

public class Rectangle  implements IShape{

	private double width;
	private double height;
	
	public Rectangle() {
		super();
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.width * this.height;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return ( this.width + this.height ) * 2;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	

}
