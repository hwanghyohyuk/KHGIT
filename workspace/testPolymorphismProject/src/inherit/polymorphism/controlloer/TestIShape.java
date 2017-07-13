package inherit.polymorphism.controlloer;

import inherit.polymorphism.model.Circle;
import inherit.polymorphism.model.IShape;
import inherit.polymorphism.model.Rectangle;

public class TestIShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IShape s;

		s = new Circle(15.5);
		System.out.println("원면적 : " + s.area());
		System.out.println("원둘레 : " + s.perimeter());

		s = new Rectangle(34.5, 42.7);
		System.out.println("사각형면적 : " + s.area());
		System.out.println("사각형둘레 : " + s.perimeter());
	}

}
