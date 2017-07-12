package com.practice1.model.vo;

public class Book extends Object {
	private String title;// 책제목
	private String author;// 저자명
	private int price; // 가격

	public Book() {
		super();
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.title + "\t" + this.author + "\t" + this.price;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Book other = (Book) obj;
		if ((this.title.equals(other.title)) && (this.author.equals(other.author)) && (this.price == other.price))
			return true;
		return false;
	}

	@Override
	public Object clone(){
		// TODO Auto-generated method stub
		return new Book(this.title,this.author,this.price);
	}

}
