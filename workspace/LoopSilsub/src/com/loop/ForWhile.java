﻿package com.loop;

import java.util.Scanner;

public class ForWhile {
	private Scanner sc = new Scanner(System.in);
	public void printStar1(){
		int num;
		System.out.print("정수 하나 입력 : ");
		num = sc.nextInt();
		
		if(num>0){
			for (int i = 1; i <=num; i++) {
				for	(int j = 1;j < i; j++) {
					System.out.print("*");
				}
				System.out.println(i);
			}
		}
	}
	public void printStar2(){
		int num;
		System.out.print("정수 하나 입력 : ");
		num = sc.nextInt();
		
		if(num>0){
			for (int i = 0; i<num; i++) {
				for	(int j = 0;j<i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}else if(num == 0){
			System.out.println("출력 기능이 없습니다.");
		}else{
			num=-num;
			for (int i = 0; i<num; i++) {
				for	(int j = 0;j<i; j++) {
					System.out.print(" ");
				}
				for	(int j = 0;j<num-i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
			
	}
	public void countInputCharacter(){
	String str;
	char ch,ck;
	int count=0;
	
	System.out.print("문자열 입력 : ");
	str = sc.nextLine();
	
	for(int i = 0; i<str.length();i++){
		ck = str.charAt(i);
		if(('a'<=ck && ck <='z')||('A'<=ck && ck<='Z')||(ck==' ')){
		}else{
			System.out.println("영문자가 아닙니다.");
		}
	}
	
	System.out.print("문자 입력 : ");
	ch = sc.next().charAt(0);
		
	for(int i = 0; i<str.length();i++){
		if(str.charAt(i) == ch){
			count++;
		}
	}
	System.out.println("포함된 갯수 : "+count+"\n\n");
	
	}
}
