﻿package com.kh.var.example;
import java.util.*;

/*기능제공용 클래스*/
public class Example {
	
	private Scanner scan = new Scanner(System.in);
	private String Stringbuffer;
	private int intbuffer;
	private double doublebuffer;
	
	public void example1() {
		int input1,input2;
		int total = 0;
		
		System.out.print("첫번째 정수를 입력하세요 : ");
		intbuffer = scan.nextInt();
		input1 = intbuffer;
		System.out.print("두번째 정수를 입력하세요 : ");
		intbuffer = scan.nextInt();
		input2 = intbuffer;
		/*
		if (input1>=0 && input2>=0) {
			if(input1>=input2){
		*/
				total=input1-input2;
		/*
				  	}else{
				total = input2-input1;
			}
		}else{
			total=input1-input2;
		}	
		*/
		System.out.println("입력한 두 수의 덧셈 값 : "+(input1+input2));
		System.out.println("입력한 두 수의 뺄셈 값 : "+total);		
		System.out.println("입력한 두 수의 곱셈 값 : "+(input1*input2));
		System.out.println("입력한 두 수의 나눗셈 값 : "+(input1/input2));
		System.out.println("입력한 두 수를 나눈 나머지 : "+(input1%input2));
	}
	
	public void example2(){
		double width,height;
		
		System.out.print("가로 : ");
		doublebuffer = scan.nextDouble();
		width =doublebuffer;
		System.out.print("세로 : ");
		doublebuffer = scan.nextDouble();
		height = doublebuffer;
		
		System.out.println("면적 : "+width*height);
		System.out.println("둘레 : "+2*(width+height));
	}
	
	public void example3(){
		String inputS;
	
		
		System.out.print("문자열을 입력하세요 : ");
		Stringbuffer = scan.next();
		
		inputS = Stringbuffer;
		for(int i=0;i<inputS.length();i++){
		System.out.println(i+1+"번째 글자 : "+inputS.charAt(i));
		}
	}
}
