package com.practice2.controller;

import com.practice2.model.entity.Circle;
import com.practice2.model.entity.Point;
import com.practice2.model.entity.Rectangle;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[] car = new Circle[3];

		car[0]=new Circle(1, 1, 1);
		car[1]=new Circle(2, 2, 2);
		car[2]=new Circle(3, 3, 3);
		
		Rectangle[] rar = new Rectangle[3];
		
		rar[0]=new Rectangle(1, 1, 1, 1);
		rar[1]=new Rectangle(2, 2, 2, 2);
		rar[2]=new Rectangle(3, 3, 3, 3);
		
		car[0].draw();
		car[1].draw();
		car[2].draw();
		
		rar[0].draw();
		rar[1].draw();
		rar[2].draw();
		
		Point[] par = new Point[5];
		par[0]=(Point)new Circle(3, 3, 3);
		par[1]=(Point)new Circle(5, 5, 5);
		par[2]=(Point)new Rectangle(1, 1, 1, 1);
		par[3]=(Point)new Rectangle(2, 2, 2, 2);
		par[4]=(Point)new Rectangle(3, 3, 3, 3);
		
		for(int i=0;i<par.length;i++){
			par[i].draw();
		}
		
	}

}
