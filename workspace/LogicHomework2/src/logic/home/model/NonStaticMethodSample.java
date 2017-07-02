package logic.home.model;

import java.sql.Date;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class NonStaticMethodSample {
	public void testScanner(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 하나 입력 : ");
		char ch = sc.next().charAt(0);
		System.out.print("byte 숫자 입력 : ");
		byte bnum = sc.nextByte();
		System.out.print("short 숫자 입력 : ");
		short snum = sc.nextShort();
		System.out.print("int 숫자 입력 : ");
		int  inum = sc.nextInt();
		System.out.print("long 숫자 입력 : ");
		long lnum = sc.nextLong();
		System.out.print("float 숫자 입력 : ");
		float fnum = sc.nextFloat();
		System.out.print("double 숫자 입력 : ");
		double dnum = sc.nextDouble();
		System.out.print("문자열 입력 : ");
		String str = sc.next();

		System.out.println("입력된 문자는 "+ch+" 입니다.");
		System.out.println("입력된 byte는 "+bnum+" 입니다.");
		System.out.println("입력된 short는 "+snum+" 입니다.");
		System.out.println("입력된 int는 "+inum+" 입니다.");
		System.out.println("입력된 long은 "+lnum+" 입니다.");
		System.out.println("입력된 float는 "+fnum+" 입니다.");
		System.out.println("입력된 double은 "+dnum+" 입니다.");
		System.out.println("입력된 String은 "+str+" 입니다.");	
		
	}
	public void testDate(){
		//Date 클래스는 JDK가 버전업되면서 사라짐
		
		Calendar today = Calendar.getInstance();
		 
		System.out.println(today.getTime());	
		
	}
	public void testRandom(){
		Random r = new Random();
		int i = r.nextInt(Integer.MAX_VALUE)+1;
		double d = r.nextDouble()*Double.MAX_VALUE;

		System.out.println("정수 난수 출력 : "+ i);

		System.out.println("실수 난수 출력 : "+ d);
		
	}
}
