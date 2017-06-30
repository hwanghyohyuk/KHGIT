﻿package logic.view;

import java.util.Scanner;

import logic.controller.Function;

public class Menu {
	public static void displayMenu(){
		/*변수 선언부*/
		Scanner sc = new Scanner(System.in);
		int mnum;
		Function func = new Function();
		/*메뉴 출력부*/
		do{
			System.out.print("\n*** 지역변수/연산자/제어문 연습 프로그램 ***\n\n"
					+ "1. 간단 계산기\n" //calculator() 실행
					+ "2. 작은수에서 큰수까지 합계구하기\n" //totalCalculator() 실행
					+ "3. 신상정보 확인하기\n" //profile() 실행
					+ "4. 학생정보 확인하기\n" //sungjuk() 실행
					+ "5. 별과 숫자 출력하기\n" //printStarNumber() 실행
					+ "6. 난수까지의 합게 구하기\n" //sumRandomNumber() 실행
					+ "7. 구구단\n" //continueGugudan() 실행
					+ "8. 주사위 숫자 알아맞추기 게임\n" //shutNumber() 실행
					+ "9. 프로그램 종료\n\n" //
					+ "메뉴 번호 입력 (1-9) : "); //
			
			/*키보드 입력부*/
			mnum = sc.nextInt();
			func.printClear();
			/*입력값에 따른 프로그램 진행 또는 종료*/
			switch(mnum){
			case 1: //calculator() 실행
				func.calculator();
				break;
			case 2: //totalCalculator() 실행
				func.totalCalculator();
				break;
			case 3: //profile() 실행
				func.profile();
				break;
			case 4: //sungjuk() 실행
				func.sungjuk();
				break;
			case 5: //printStarNumber() 실행
				func.printStarNumber();
				break;
			case 6: //sumRandomNumber() 실행
				func.sumRandomNumber();
				break;
			case 7: //continueGugudan() 실행
				func.continueGugudan();
				break;
			case 8: //shutNumber() 실행
				func.shutNumber();
				break;
			case 9:
				System.out.println("프로그램 종료!");
				break;
			default:
				System.out.println("다시 입력해주세요!");
				break;				
			}			
			
		}while(mnum!=9);		
	}
}
