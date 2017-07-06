package oop.run;

import oop.model.vo.Book;

public class run {

	public static void main(String[] args) {
		
		Book[] b = new Book[3];
		b[0]=new Book("동의번쩍의정석", "홍길동", 20000, 0.2);

		b[1]=new Book("이것이거북선이다", "이순신", 40000, 0.25);

		b[2]=new Book("한글의정석", "세종", 200000, 0.3);
		
		for(int i=0;i<b.length;i++){
			System.out.println(b[i].bookInformation());
		}
		
		
	}

}
