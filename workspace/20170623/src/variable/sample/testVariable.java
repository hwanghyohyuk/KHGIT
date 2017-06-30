﻿package variable.sample;

import java.util.Scanner;

public class testVariable {
	
	byte bnum;
	int num;
	
	
	private void cast(){
		num = 1250;
		bnum = (byte)num; /*캐스트연산자*/
		/*
		 * 캐스트연산 int > byte
		 바이트 변수는 1바이트 정수 자료형
		 인트 변수는 4바이트 정수 자료형
		 
		 1바이트는 8비트, 비트는 0 또는 1
		 
		즉, byte 	=	0 		>> 0000 0000;
			int		=  0		>> 0000 0000 0000 0000 0000 0000 0000 0000;
						1250	>> 0000 0000 0000 0000 0000 0100 1110 0010;
						1250  >> 2^10 + 2^7 + 2^6 + 2^5 + 2^2
						1250  >> 1024 + 128 + 64 + 32 + 2
		따라서 바이트 변수 byte 에 저장되는 값은 가장 오른쪽 1바이트 값이다.
			
			byte = (byte)1250; 은 1110 0010 값이 저장되므로
							
					맨왼쪽 비트(최상위 비트)는 양수인지 음수인지 판별하는 비트
					자바는 2의 보수를 사용하기 때문에 
					
					최상위 비트가 음수 일때는 최상위 비트를 제외한 하위비트는 2의 보수를 취해주어야 한다.
						 				110 0010	
					0과 1 반전		001 1101	
					2의 보수를
					위해 1을 더함			+1
										001 1110		= 30
			
			따라서 1110 0010은 -30이다
			
		 */
			
		System.out.println("1250 이 저장된 bnum 의 값은 = "+bnum);
	}
	
	/*변수의 초기화 테스트용 메소드*/
	public void varInit(){
		//변수 선언과 동시에 초기값을 바로 기록하는 값
		// 자료형 변수명 = 초기값;
		boolean flag = true;
		byte bnum = 10;
		short snum = 100;
		int inum = 3570000;
		long lnum = 123L;
		float fnum = 3.44f;
		double dnum = 123.75;
		char grade = 'A';
		String name = "홍길동";
		
		//기록 출력확인
		System.out.println("flag : "+flag);
		System.out.println("bnum : "+bnum);
		System.out.println("snum : "+snum);
		System.out.println("inum : "+inum);
		System.out.println("lnum : "+lnum);
		System.out.println("fnum : "+fnum);
		System.out.println("dnum : "+dnum);
		System.out.println("grade : "+grade);
		System.out.println("name : "+name);
	}
	
	public void myInfo(){
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String name,email,phone,blood;
		int age;
		double height,weight;

		System.out.print("이름 : ");
		name = input.nextLine();
		System.out.print("나이 : ");
		age = input.nextInt();
		System.out.print("키 : ");
		height = input.nextDouble();
		System.out.print("몸무게 : ");
		weight = input.nextDouble();
		System.out.print("이메일 : ");		
		input.nextLine();
		email = input.nextLine();
		System.out.print("전화 : ");
		phone = input.nextLine();
		System.out.print("혈액형 : ");
		blood = input.nextLine();

		System.out.println("당신의 정보입니다.");
		System.out.println(name+", "+age+", "+height+", "+weight+", "+email+", "+phone+", "+blood.charAt(0)+".");
	}

	//정수 자료형 진법 확인용 메소드
	public void decimalTobit(){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String zo="";
		int mod,input,fourcond=0,count=0,temp=0;
		
		System.out.print("정수 하나 입력 : ");

		input = scan.nextInt();
		temp = input;
		System.out.printf("value : %d, %o, %x, ", input, input, input);
		/*
		while(input>0){
			mod = input %2;
			input /= 2;
			if(fourcond%4==0&&fourcond>0){
				zo += " ";
			}
			zo += String.valueOf(mod);
			fourcond++;
			if(mod==1){
				count++;
			}
		}
		
		for (int i = zo.length() -1; i>=0; i--) {
	         System.out.print(zo.charAt(i));
	         if(i==0){
	        	 System.out.print(", ");
	         }
	      }
		System.out.println("1의 개수 : "+count+"개");
		*/
		count=Integer.bitCount(temp);
		System.out.println("1의 개수 : "+count+"개");
	}

}
