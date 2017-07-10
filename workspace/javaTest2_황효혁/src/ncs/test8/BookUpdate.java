package ncs.test8;

import ncs.test7.Book;

public class BookUpdate {
	private Book bookData;
	
	public BookUpdate(){
		
	}
	public BookUpdate(Book bookData){
		this.bookData = bookData;
	}
	public void updataBookPrice(){
		this.bookData.setBookPrice(this.bookData.getBookPrice()-((this.bookData.getBookPrice()*this.bookData.getBookDiscountRate())/100));
	}
	
	public Book getBookData() {
		return bookData;
	}
	public void setBookData(Book bookData) {
		this.bookData = bookData;
	}
	
	
}
