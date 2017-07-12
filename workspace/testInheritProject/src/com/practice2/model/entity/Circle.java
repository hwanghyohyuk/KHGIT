package com.practice2.model.entity;

public class Circle extends Point {
private int radius;

public Circle() {
	super();
}

public Circle(int x,int y,int radius) {
	super(x,y);
	this.radius = radius;
}

public void draw(){
	double circleArea = Math.PI * (this.radius*this.radius);
	double circleTrack = 2 * Math.PI * this.radius;
	int temp = (int) (circleArea*100);
	if(temp%10>4) circleArea = ((double)(temp/10)+1)/10;
	else circleArea = (double)(temp/10)/10;
	temp = (int)(circleTrack*100);
	if(temp%10>4) circleTrack = ((double)(temp/10)+1)/10;
	else circleTrack = (double)(temp/10)/10;
	System.out.println("원 면적 : "+circleArea+", 원 둘레 : "+circleTrack);
}

}
