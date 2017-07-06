package oop.model.vo;

public class Book {
private String title;
private String author;
private int price;
private double discountRate;

public Book() {}

public	 Book(String title,String author,int price,double discountRate) {
	this.title=title;
	this.author = author;
	this.price = price;
	this.discountRate = discountRate;
}

public String bookInformation(){
	return this.title+", "+this.author+", "+this.price+", "+this.discountRate;
}

public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
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

}
