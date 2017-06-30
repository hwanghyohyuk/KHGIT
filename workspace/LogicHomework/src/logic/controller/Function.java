﻿package logic.controller;

import java.util.Scanner;

public class Function {
	private static Scanner sc = new Scanner(System.in);
	
	public void printClear() {
		for(int i = 0; i<40;i++){
			System.out.println();
		}
	}
	
	public void calculator() {
		int x,y,result=0;
		char op;
		System.out.print("첫번째 정수 : ");
		x = sc.nextInt();
		System.out.print("두번째 정수 : ");
		y = sc.nextInt();
		System.out.print("연산문자 : ");
		op = sc.next().toUpperCase().charAt(0);
		
		switch (op) {
		case '+':
			result = x+y;
			System.out.println(x+" "+op+" "+y+" = "+result);
			break;
		case '-':
			result = x-y;
			System.out.println(x+" "+op+" "+y+" = "+result);
			break;
		case 'X':
			result = x*y;
			System.out.println(x+" "+op+" "+y+" = "+result);
			break;
		case '/':
			if(y!=0){
				result = x/y;
				System.out.println(x+" "+op+" "+y+" = "+result);
			}else{
				result = 0;
				System.out.println("0으로 나눌 수 없습니다.");
			}
			break;		
		default:		
			System.out.println("연산문자를 잘못입력하셨습니다.");
			return;
		}
	}
	
	public void totalCalculator() {
		int x,y,result=0;
		System.out.print("첫번째 정수 : ");
		x = sc.nextInt();
		System.out.print("두번째 정수 : ");
		y = sc.nextInt();
		
		for(int i = x;i<=y;i++){
			result += i;
		}
		
		System.out.println(x+"부터 "+y+"까지 정수들의 합계 : "+result);
	}
	
	public void profile() {
		String name,pers;
		int age;
		char sex;
		
		name = "홍길동";
		age = 26;
		sex = 'M';
		pers = "고집불통";

		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age+"세");
		System.out.println("성별 : "+((sex=='M')?"남":"여"));
		System.out.println("성격 : "+pers);
		
	}
	
	public void sungjuk() {
		String sname;
		int sgrader,sclass,snum;
		char sex,grade;
		double score;
		
		System.out.print("학생이름 : ");
		sname = sc.next();
		System.out.print("학년 : ");
		sgrader = sc.nextInt();
		System.out.print("반 : ");
		sclass = sc.nextInt();
		System.out.print("번호 : ");
		snum = sc.nextInt();
		System.out.print("성별(M/F) : ");
		sex = sc.next().toUpperCase().charAt(0);
		System.out.print("성적 : ");
		score = sc.nextInt();
		
		if(score<=100&&score>=90){
			grade = 'A';
		}else if(score<90&&score>=80){
			grade = 'B';
		}else if(score<80&&score>=70){
			grade = 'C';
		}else if(score<70&&score>=60){
			grade = 'D';
		}else{//100점이상이고 60점미만
			grade = 'F';
		}

		System.out.println(sgrader+"학년 "+sclass+"반 "+snum+"번 "+((sex=='M')?"남":"여")+"학생 "+sname+"의 점수는 "+score+" 점이고, "
				+ grade+" 학점입니다.");
	}

	public void printStarNumber() {
		int input;
		System.out.print("정수 하나 입력 : ");
		input = sc.nextInt();
		if(input>0){
		for(int i = 1; i<=input;i++){
			for(int j = 1; j<i;j++){
				System.out.print("*");
			}
			System.out.println(i);
		}
		}else{
			System.out.println("양수가 아닙니다.");
		}	
	}

	public void sumRandomNumber() {
		int rnum = (int)(Math.random()*99)+1;
		int result = 0;
		System.out.println("임의로 뽑힌 수 : " + rnum);
		 for(int i=1;i<=rnum;i++){
			 result +=i;
		 }
		 System.out.println("1부터 "+rnum+"까지의 합계는 : "+result);
	}

	public void continueGugudan() {
		int num,except,result;
		
		System.out.print("단수 : ");
		num = sc.nextInt();
		System.out.print("제외할 배수 : ");
		except = sc.nextInt();
		
		if(num>0){
		for(int i = 1; i<=9;i++){
			result = num*i;
			if(result%except!=0){
				System.out.println(num+" * "+i +" = "+result );
			}
		}
		}else{
			System.out.println("양수가 아닙니다.");
		}	
	}

	public void shutNumber() {
		int dice1,dice2,input;
		char exit;
		do{
			System.out.println("임의의 두 주사위의 합 맞추기!!");
			System.out.print("값 입력 : ");
			input = sc.nextInt();			
			
			dice1 = (int)(Math.random()*5)+1;
			dice2 = (int)(Math.random()*5)+1;
			
			System.out.println("주사위 1의 값 : "+dice1);
			System.out.println("주사위 2의 값 : "+dice2);
			System.out.println("두 주사위의 합 : "+(dice1+dice2));
			
			
			if(input == dice1+dice2){
				System.out.println("맞췄습니다.");
			}else {
				System.out.println("틀렸습니다.");
			}
			System.out.print("계속 하시겠습니까? (Y/N)");
			exit = sc.next().toUpperCase().charAt(0);
		}while(exit!='N');		
	}
	
}
