package test.controller;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int gob = 0;
		
		System.out.print("첫 번째 정수 입력: ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력: ");
		int num2 = sc.nextInt();
		
		if((1<=num1 && num1<=9)&&(1<=num2 && num2<=9)){
			gob = num1*num2;
			gob /= 10;
			switch (gob) {
			case 0://한자리수일때
				System.out.println("한 자리 수 입니다.");
				break;	
			default://10이상 99이하 9X9=81인것을 감안
				System.out.println("두 자리 수 입니다.");
				break;
			}
		}
		
		
	}

}
