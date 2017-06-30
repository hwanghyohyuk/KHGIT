﻿package test.string;

import java.util.Scanner;

public class TestString {
	
	public void testCharValue(){
		char ch1 = 'A';
		char ch2 = (char)100;
		char ch3 = '\u0041';		
		char ch4 = '\t';
		System.out.println(ch1+","+ch2+","+ch3+","+ch4);
		
	}
	public void testStringValue() {
		/* 자바에서는 문자열 취급용을로 String 클래스를 제공함
		 * 클래스 사용의 기본은
		 * 클래스명 참조 변수명=new 클래스명();
		 * 참조변수명.클래스가 가진 메소드명();
		 */
		String str = new String("apple");
		String str2 = "banana";
		String str3 = "";
		String str4 = null;
		String str5 = "green" + "melon"; 
		String str6 = 7 + 7 + "up"; //14up
		String str7 = "top"+7+7; //문자열 합치기 top77
		
		System.out.println(str + str2 + str3 + str4 + str5 + str6 + str7);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestString test = new TestString();
		//test.testCharValue();
		test.testStringValue();
		
		java.util.Scanner sc = new  java.util.Scanner(System.in);
		
	}

}
