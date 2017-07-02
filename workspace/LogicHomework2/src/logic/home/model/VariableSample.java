﻿package logic.home.model;

import java.util.Scanner;

public class VariableSample {
	private Scanner sc = new Scanner(System.in);
	public void myProfile() {
		String name,email,phone;
		double height, weight;
		int age;
		char sex;
		
		name = "홍길동";
		age = 26;
		height = 180.2;
		weight = 78.3;
		sex = 'M';
		email = "honggildong@naver.com";
		phone = "010-5015-5015";
		
		System.out.println("당신의 신상 정보입니다."
				+ "\n이름 : " + name
				+ "\n나이 : " + age
				+ "\n키 : " + height
				+ "\n몸무게 : " + weight
				+ "\n성별 : " + sex
				+ "\nE-mail : " + email
				+ "\n전화 : "+ phone);
	}
	
	public void emplnformation() {
		String name,email,phone;
		double height, weight;
		int age;
		char sex;
		
		System.out.println("사원정보를 입력하세요.");
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("나이 : ");
		age = sc.nextInt();
		System.out.print("키 : ");
		height = sc.nextDouble();
		System.out.print("몸무게 : ");
		weight = sc.nextDouble();
		System.out.print("성별 : ");
		sex = sc.next().toUpperCase().charAt(0);
		System.out.print("E-mail : ");
		email = sc.next();
		System.out.print("전화 : ");
		phone = sc.next();
		
		System.out.println("입력된 사원정보 : "
				+ "\n이름 : "+ name
				+ "\n나이 :"+ age
				+ "\n키 : "+ height
				+ "\n몸무게 : "+ weight
				+ "\n성별 : "+ sex
				+ "\nE-mail : "+email
				+ "\n전화 : "+phone);		
	}
	
	public void defaultValue() {
		boolean flag = false;
		byte bnum = 0;
		short snum = 0;
		int inum = 0;
		long lnum = 0;
		float fnum = 0;
		double dnum = 0;
		char ch = 0;
		String str = null;
		
		System.out.println("기본 자료형 변수의 초기값 확인하기");
		System.out.println("\n boolean : " +flag
				+ "\n byte : "+bnum
				+ "\n short : "+snum
				+ "\n int : "+inum
				+ "\n long : "+lnum
				+ "\n float : "+fnum
				+ "\n double : "+dnum
				+ "\n char : '"+ch+"'"
				+ "\n name : "+str);
	}
}
