package com.practice2.model.entity;

public class Circle extends Point {
private int radius;

public Circle() {
	super();
}

public Circle(int x,int y,int radius) {
	super();
	super.x = x;
	super.y = y;
	this.radius = radius;
}

public void draw(){
	double circleArea = Math.PI * (this.radius^2);
	double circleTrack = 2 * Math.PI * this.radius;
	int temp = (int)(circleArea*100);
	if(temp%10>4) circleArea = ((temp/10)+1)/10;
	else circleArea = temp/100;
	temp = (int)(circleTrack*100);
	if(temp%10>4) circleTrack = ((temp/10)+1)/10;
	else circleTrack = temp/100;
	System.out.println("원 면적 : "+circleArea+", 원 둘레 : "+circleTrack);
}

}
