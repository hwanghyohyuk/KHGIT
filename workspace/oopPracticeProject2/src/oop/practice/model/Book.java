package oop.practice.model;

public class Book {
	
private String title;//책제목
private int price;//가격
private double discountRate;//할인율
private String author;//저자명

public Book() {
	// TODO Auto-generated constructor stub
}
public Book(String title, int price, double discountRate, String author) {
	// TODO Auto-generated constructor stub
	this.title = title;
	this.price = price;
	this.discountRate = discountRate;
	this.author = author;
}
public void bookInformation() {
	System.out.println(this.title+"\t"+this.price+"\t"+this.discountRate+"\t"+this.author);
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public double getDiscountRate() {
	return discountRate;
}
public void setDiscountRate(double discountRate) {
	this.discountRate = discountRate;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}


}
