package com.practice2.controller;

import com.practice2.model.entity.Circle;
import com.practice2.model.entity.Rectangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1=new Circle(1, 1, 5);
		Circle c2=new Circle(2, 2, 10);
		Circle c3=new Circle(3, 3, 15);
		Rectangle r1 = new Rectangle(1, 1, 10, 5);
		Rectangle r2 = new Rectangle(2, 2, 5, 10);
		Rectangle r3 = new Rectangle(3, 3, 10, 10);
		
		c1.draw();
		c2.draw();
		c3.draw();
		r1.draw();
		r2.draw();
		r3.draw();
		
	}

}
