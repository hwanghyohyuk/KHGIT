﻿package operator.test;

import java.util.Scanner;

public class Example {
	//접근 제한자 public, private, protected,
	//기본 접근제한자는 package private
	//객체지향의 기본 3가지중 하나인 캡슐화를 이루기 위해
	//외부에서 접근할 수 없도록 해야한다.
	private Scanner sc = new Scanner(System.in);
	
	public void sample1(){		
		//1. 변수선언부
		int kor,eng,mat,tot;
		double ave;
		
		//2.변수에 값 대입부
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		mat = sc.nextInt();
		
		//3. 변수에 저장된 값 계산부 (제어문 사용가능)
		tot = kor+eng+mat;
		ave = tot / 3.0;
		
		//4. 계산의 결과값에 대한 처리부
		System.out.println((kor>=40 && eng >=40 && mat >=40 && ave>=60.0)?"합격":"불합격");
	}
	public void sample2(){
		String name;
		double grade;
		int grader,cnum,snum,temp;
		char sex;
		
		System.out.print("학생 이름 : ");
		name = sc.next();
		System.out.print("학년 : ");
		grader = sc.nextInt();
		System.out.print("반 : ");
		cnum = sc.nextInt();
		System.out.print("번호 : ");
		snum = sc.nextInt();
		System.out.print("성별(M/F) : ");
		sex = sc.next().toUpperCase().charAt(0);
		System.out.print("성적 : ");
		grade = sc.nextDouble();
		
		temp = (int)(grade * 100);
		grade = temp /100.0;
		
		System.out.println(grader+"학년 "+cnum+"반 "+snum+"번 "+((sex=='M')?"남":"여")+"학생 "+name+"은 성적이 "+grade+" 점이다.");		
	}
	public void sample3(){
		int input;
		
		System.out.print("정수 하나 입력 : ");
		input = sc.nextInt();
		
		System.out.println((input>0)?"양수다.":"양수가 아니다.");
	}
	public void sample4(){
		int input;
		String temp;
		
		System.out.print("정수 하나 입력 : ");
		input = sc.nextInt();
		
		temp = (input%2 == 0)?"짝수다":"홀수다";
		
		System.out.println(temp);
		
		
	}
}
