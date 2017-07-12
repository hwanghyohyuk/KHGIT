package com.practice2.model.entity;

public class Rectangle extends Point{
private int width;
private int height;
public Rectangle() {
	super();
}
public Rectangle(int x, int y, int width, int height) {
	super();
	super.x = x;
	super.y = y;
	this.width = width;
	this.height = height;
}
public int getWidth() {
	return width;
}
public void setWidth(int width) {
	this.width = width;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}

public void draw(){
	double rectangleArea = this.width * this.height;
	double rectangleTrack = 2 * ( this.width + this.height );
	int temp = (int)(rectangleArea*100);
	if(temp%10>4) rectangleArea = ((temp/10)+1)/10;
	else rectangleArea = temp/100;
	temp = (int)(rectangleTrack*100);
	if(temp%10>4) rectangleTrack = ((temp/10)+1)/10;
	else rectangleTrack = temp/100;
	System.out.println("사각형 면적 : "+rectangleArea+", 사각형 둘레 : "+rectangleTrack);
}


}
