package array.run;

import java.util.Scanner;

import array.sample.*;

public class TestArray {
	private Scanner sc = new Scanner(System.in);
	
	public void displayMenu() {		
		int no;
		ArraySample1 as1 = new ArraySample1();
		ArraySample2 as2 = new ArraySample2();		
		do{
			System.out.println("\n기본자료형 배열 테스트\n");
			System.out.println("1. 정수 배열 테스트 1");
			System.out.println("2. 랜덤 정수 배열 테스트");
			
			System.out.println("9. 끝내기");
			System.out.print("번호 선택 : ");
			no = sc.nextInt();			
			
			switch (no) {
			case 1: as1.testArray1(); break;
			case 2: as1.testArray2(); break;

			case 9: System.out.print("정말로 끝내시겠습니까? (y/n) : ");
					if ((sc.next().toUpperCase().charAt(0))=='Y') {
						return;
					}
					break;
			default:
				System.out.print("다른 값을 입력하셨습니다.");
			}
		}while(true);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new TestArray().displayMenu();
			System.out.println("기본 자료형 배열 테스트 프로그램을 종료합니다.");
	}

}
