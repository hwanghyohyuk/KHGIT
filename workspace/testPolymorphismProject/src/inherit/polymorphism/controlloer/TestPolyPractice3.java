package inherit.polymorphism.controlloer;

import inherit.polymorphism.model.Circle;
import inherit.polymorphism.model.IShape;
import inherit.polymorphism.model.Rectangle;
import inherit.polymorphism.model.Triangle;

public class TestPolyPractice3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IShape[] iarr = new IShape[5];
		
		iarr[0] = new Circle(15.5);
		iarr[1] = new Rectangle(34.5,42.7);
		iarr[2] = new Triangle(12.3,23.1);
		iarr[3] = new Rectangle(34.5,42.7);
		iarr[4] = new Circle(5.6);
		
		for(int i = 0; i<iarr.length; i++){
				if (iarr[i] instanceof Circle) {
					System.out.println("원");
				}
				else if (iarr[i] instanceof Rectangle) {
					System.out.println("사각형");
				}
				else if (iarr[i] instanceof Triangle) {
					System.out.println("삼각형");
					System.out.println("빗변길이 : " + ((Triangle)iarr[i]).getHypotenuse());
				}
				System.out.println("면적 : "+((IShape)iarr[i]).area());
				System.out.println("둘레 : "+((IShape)iarr[i]).perimeter());
			}
			
		}
		
	}

