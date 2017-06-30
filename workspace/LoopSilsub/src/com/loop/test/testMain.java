package com.loop.test;

import java.util.Scanner;

import com.loop.ForWhile;

import home.menu.CashBurgerKing;

public class testMain {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu;
		ForWhile fw = new ForWhile();
		CashBurgerKing cbk = new CashBurgerKing();
		do{
		System.out.println("**반복문 실습 메뉴**\n"
				+ "1. printStar1\n"
				+ "2. printStar2\n"
				+ "3. BugerKing\n"
				+ "4. countInputCharacter\n"
				+ "5. 프로그램 종료");
		System.out.print("메뉴번호 입력 : ");
		
		menu = sc.nextInt();
		
		switch (menu) {
		case 1:
			fw.printStar1();
			break;
		case 2:
			fw.printStar2();
			break;
		case 3:
			cbk.selectMenu();
			break;
		case 4:
			fw.countInputCharacter();
			break;
		case 5:
			System.out.println("프로그램을 종료합니다.");
			return;
		default:
			System.out.println("다시 입력해 주세요");
			testMain.main(null);
			break;
		}
		}while(menu!=5);
	}

}
