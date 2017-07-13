package inherit.polymorphism.model;

public class Circle implements IShape {
	private double radius;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub		
		return  Math.PI * this.radius * this.radius;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * this.radius ;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}
