package test.run;

import java.util.Scanner;

import test.array.premitive.ArraySample;

public class Main {
	int no;
		Scanner sc = new  Scanner(System.in);
	public void displayMenu() {		
		ArraySample as = new ArraySample();		
		do{
		System.out.println("\n배열실습문제\n");
		System.out.println("1. 문제 1 ");
		System.out.println("2. 문제 2 ");
		System.out.println("3. 문제 3 ");
		System.out.println("4. 문제 4 ");
		System.out.println("5. 문제 5 ");
		System.out.println("6. 문제 6 ");
		System.out.println("8. 배열 초기화 ");		
		System.out.println("9. 끝내기");
		System.out.print("번호 선택 : ");
		no = sc.nextInt();			
		
		switch (no) {
		case 1: as.test1(); break;
		case 2: as.test2(); break;
		case 3: as.test3(); break;
		case 4: as.test4(); break;
		case 5: as.test5(); break;
		case 6: as.test6(); break;
		case 7: as.multiArray(); break;
		case 8: as.initArray(); break;
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
		new Main().displayMenu();
	}

}
