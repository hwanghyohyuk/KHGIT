package com.test.practice;

import java.util.Scanner;

import operator.test.Example;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input;
		Example ex = new Example();
		
		System.out.print("실행할 메소드 번호를 입력하세요(1-4) : ");
		input = sc.nextInt();
		
		switch(input){
		case 1:
			ex.sample1();
			break;
		case 2:
			ex.sample2();
			break;
		case 3:
			ex.sample3();
			break;
		case 4:
			ex.sample4();
			break;
		default:
			System.out.println("[ERROR] : 다시 입력해주세요!");
			Test.main(null);
			break;
		}
	}
}
