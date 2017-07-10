package ncs.test8;

import ncs.test7.Book;

public class BookStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book bookdata;
		BookUpdate bookupdate; 
		
		bookdata = new Book();
		bookdata.setBookName("HTML5");
		bookdata.setBookPrice(30000);
		bookdata.setBookDiscountRate(15);
		
		System.out.println("기본정보");
		System.out.println(bookdata.getBookName()+"\t"
				+bookdata.getBookPrice());
		
		System.out.println("변경된 정보");
		bookupdate = new BookUpdate(bookdata);
		bookupdate.updataBookPrice();
		System.out.println(bookupdate.getBookData().getBookName()+"\t"
				+bookupdate.getBookData().getBookPrice());
		
	}

}
