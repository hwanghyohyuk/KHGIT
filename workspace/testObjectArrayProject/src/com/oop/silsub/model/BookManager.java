package com.oop.silsub.model;

import java.util.Scanner;

import com.oop.array3.model.Book;

public class BookManager {
	private Book[] bar = null;
	private Scanner sc = new Scanner(System.in);
	private int count = 0;

	{
		bar = new Book[10];
	}

	public void menu() {
		int menu;
		do {
			System.out.print("***** 도서 관리 메뉴 *****\n" + "1. 도서 정보 추가\n" + "2. 모두 출력\n" + "7. 끝내기\n" + "메뉴 번호 입력 : ");
			menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {
			case 1:
				bookInput();
				break;
			case 2:
				bookAllOutput();
				break;
			case 7:
				return;
			default:
				System.out.println("다시 입력해 주세요.");
				continue;
			}
		} while (true);

	}

	public void bookInput() {
		System.out.println("***** 도서 정보 추가 *****");
		bar[count]=new Book();
		System.out.print("도서명 : ");
		bar[count].setTitle(sc.nextLine());
		System.out.print("저자 : ");
		bar[count].setAuthor(sc.next());
		System.out.print("가격 : ");
		bar[count].setPrice(sc.nextInt());
		System.out.print("할인율 : ");
		bar[count].setDiscountRate(sc.nextDouble());
		count++;
		System.out.println("정상적으로 입력되었습니다.");
	}

	public void bookAllOutput() {
		System.out.println("***** 도서 정보 출력 *****");
		if(count>0){
			System.out.println("도서명, 저자, 가격, 할인율");
			for(int i=0;i<count;i++){
				System.out.println(bar[i].bookInformation());
			}
		}else{
			System.out.println("입력되어있는 정보가 없습니다.");
		}		
	}
}
