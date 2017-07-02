package logic.home.model;

import java.util.Scanner;

public class StaticMethodSample {
	private Scanner sc = new Scanner(System.in);
	public void testMathRandom(){
		int inum = (int)(Math.random()*45)+1;
		System.out.println("Math.random() : " + inum);		
	}
	public void testMathAbs(){
		double a;		
		System.out.print("Math.abs(int a) : a 변수에 들어갈 값 입력 : ");		
		a = sc.nextDouble();
		double dnum = Math.abs(a);
		System.out.println("입력된 a의 절대값은 : "+dnum);		
	}
	public void testMathMax(){
		int a,b;
		System.out.println("Math.max(int a, int b) : a와 b변수에 들어갈 값 입력");	
		System.out.print("a : ");
		a = sc.nextInt();
		System.out.print("b : ");
		b = sc.nextInt();
		int largerInt = Math.max(a, b);
		System.out.println(a+", "+b+" 중 더 큰 값은 "+largerInt+"입니다.");
	}
}
