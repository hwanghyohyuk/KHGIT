package practice2;

import java.io.Serializable;

public class Book implements Serializable {

	private String bNo;
	private int category;
	private String title;
	private String author;
	public Book() {
		super();
	}
	public Book(String bNo, int category, String title, String author) {
		super();
		this.bNo = bNo;
		this.category = category;
		this.title = title;
		this.author = author;
	}
	public String getbNo() {
		return bNo;
	}
	public void setbNo(String bNo) {
		this.bNo = bNo;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String categoryResult=null;
		switch (this.category) {
		case 1:
			categoryResult="인문";
			break;
		case 2:
			categoryResult="자연과학";
			break;
		case 3:
			categoryResult="의료";
			break;
		case 4:
			categoryResult="기타";
			break;
		default:
			categoryResult="분류없음";
			break;
		}				
		return this.bNo+"\t"+categoryResult+"\t"+this.title+"\t"+this.author;
	}
}
