﻿package operator.sample;

import java.util.*;

import operator.test.TestMain;

public class Sample {
	Scanner sc = new Scanner(System.in);
	//단항연산자(2순위) : 부호(sign)연산자 +/-
	//삼항연산자(13순위) : 간단한 조건문의 형태
	//자료형 변수 = 조건식 ? 참일 때의 실행문 : 거짓일 때의 실행문
	
	//정수를 입력받아서, 음수이면(정수 < 0) 양수로 바꿔서 출력
	//정수의 절대값을 구하는 메소드 작성
	//정수의 절대값 : 양수와 0은 그대로 두고, 음수를 양수로 변환
	
	public void printAbsoluteNumber(){
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		
		int result = (num<0)?-num:num;
		
		System.out.println(num + "의 절대값 : " +result);
	}
	
	//증감연산자 : ++/-- (단항연산자 : 2순위)
	//변수와 단독사용시에는 변수 앞/뒤 위치구분 안해도됨
	//다른 식이나 문장의 일부분으로 사용될 경우
	//변수 앞/뒤의 위치에 따라서 계산결과의 순서가 달라짐
	//변수의 앞일경우 : 문장이 실행되기전에 계산됨
	//변수의 뒤일경우 : 문장이 실행된 후 계산됨
	
	public void testIncDec(){
		int num = 10;
		System.out.println("num : "+num);
		
		//변수의 단독 사용
		num++;
		System.out.println("num : "+num);
		num++;
		System.out.println("num : "+num);		
		num--;
		System.out.println("num : "+num);		
		num--;
		System.out.println("num : "+num);		

		//문장 내에서 사용할 경우

		System.out.println("선 증가 후 대입");
		int result = ++num;
		System.out.println("num : "+num);		
		System.out.println("num : "+ result); //선증가 후대입
		System.out.println("결과");
		System.out.println("num : "+num);		

		System.out.println("선 처리 후 증가");
		result = num++;
		System.out.println("num : "+num);		
		System.out.println("num : "+ result); //선처리 후증가
		System.out.println("결과");
		System.out.println("num : "+num);		

		System.out.println("출력 전 증가");
		System.out.println("num : "+num);	
		System.out.println("num : "+ ++num);	//출력 후 증가
		System.out.println("결과");
		System.out.println("num : "+num);		

		System.out.println("출력후 증가");
		System.out.println("num : "+num);	
		System.out.println("num : "+ num++);	//출력 후 증가
		System.out.println("결과");
		System.out.println("num : "+num);			
	}
	
	public void decimalPoint(){
		double pi = Math.PI;
		System.out.println("pi : "+pi);
		System.out.println("원하는 소숫점 아래 자릿 수 (0 ~ 15) : ");
		int point = sc.nextInt();
		
		//System.out.println(Math.pow(10, point));
		double result = (int)(pi * Math.pow(10, point))/Math.pow(10, point);
		System.out.println(result);
			
	}
	
	public void testMod(){
		//짝수,홀수,배수검사
		System.out.print("정수 : ");
		int num = sc.nextInt();
		System.out.println((num%2==0?"짝수입니다.":"홀수입니다."));
	}
	
	public void testMod2(){
		System.out.print("정수 : ");
		int num = sc.nextInt();
		System.out.print("조회할 배수 : ");
		int snum = sc.nextInt();
		
		System.out.println(num+((num % snum ==0)?"은 "+snum+"의 배수입니다.":"은 "+snum+"의 배수가 아닙니다."));
	}
	
	//비교연산자와 일반 논리 연산자를 사용하여
	//값의 범위를 조회할 수 있음
	public void testCompare(){
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		boolean result =(num>=1 && num<=100)?true:false;
		System.out.println(result ? "사용 가능" : "사용 불가");
	}
	public void testLogicOn(){
		System.out.print("맞으면 y, 틀리면 n 입력(종료 X 입력) : ");
		char answer = sc.next().toUpperCase().charAt(0);
		
		if(answer =='Y'){
			System.out.println("맞음 선택");
		}else if(answer == 'N'){
			System.out.println("틀림 선택");
		}else if(answer =='X'){
			System.out.println("프로그램 종료");
		}else{
			System.out.println("다른 문자를 입력하셨습니다.");
			new Sample().testLogicOn();
		}	
	}
}
