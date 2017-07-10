package ncs.test6;

import java.util.Scanner;

public class CalcTest {

	public static void main(String[] args) {
		Calculate calc = new Calculate();
		Scanner sc = new Scanner(System.in);
		int inum1,inum2;
	
		System.out.println("정수 두 개 입력");
		System.out.print("첫번째 정수 : ");
		inum1 = sc.nextInt();
		if(!(inum1>0&&inum1<10)){
			System.out.println("1부터 9까지만 입력해주세요");
		}
		System.out.print("두번째 정수 : ");
		inum2 = sc.nextInt();
		if(!(inum2>0&&inum2<10)){
			System.out.println("1부터 9까지만 입력해주세요");
		}
		
		System.out.println("합 : "+calc.sum(inum1, inum2));
		System.out.println("차 : "+calc.subtract(inum1, inum2));
		System.out.println("곱 : "+calc.multiply(inum1, inum2));
		System.out.println("나누기 : "+calc.divide(inum1, inum2));
		sc.close();
	}

}
