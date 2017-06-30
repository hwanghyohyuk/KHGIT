package test.controller;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1부터 100까지의 정수 중 하나 입력 : ");
		
		int num = sc.nextInt();
		
		if(1<= num && num <= 100){ //1부터 100사이의 수가 입력되면
			if(num%2 == 0){//입력된 수를 2로 나눈 나머지가 0이면, 즉, 2의 배수이면
				System.out.println("2의 배수입니다.");
			}else{//2로 나눈 나머지가 0이아니면, 즉, 2의 배수가 아니면
				System.out.println("2의 배수가 아닙니다.");
			}
		}else{
			System.out.println("1부터 100까지의 수 만 입력해주세요.");
		}
	}
}
