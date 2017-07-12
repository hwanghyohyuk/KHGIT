package com.practice1.controller;

import com.practice1.model.vo.Book;

public class TestSilsub1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("수학의 정석","수학자",30000);
		Book b2 = new Book("이것은 과학","과학자",50000);
		
		System.out.println(b1.toString());
		System.out.println(b2);

		System.out.println(b1.equals(b2));
		
		Book c1 = (Book) b1.clone();
		
		System.out.println(b1.hashCode()==c1.hashCode());
		System.out.println(b1.equals(c1));
	}

}
