package logic.home.model;

import java.util.Scanner;

public class PrimitiveTypeSample {
	private Scanner sc = new Scanner(System.in);
	public void typeSize() {
		System.out.println("기본자료형 메모리 할당 크기 확인하기"
				+ "\n Byte : " + Byte.BYTES
				+ "\n Short : " + Short.BYTES
				+ "\n Int : " + Integer.BYTES
				+ "\n Long : " + Long.BYTES
				+ "\n Float : " + Float.BYTES
				+ "\n Double : " + Double.BYTES
				+ "\n Char : " + Character.BYTES);	
	}

	public void minMaxValue() {
		System.out.println("기본자료형 값의 최소값, 최대값 출력하기"
				+ "\n Byte : 최소 " + Byte.MIN_VALUE +", 최대 "+Byte.MAX_VALUE
				+ "\n Short : 최소 " + Short.MIN_VALUE +", 최대 "+Short.MAX_VALUE
				+ "\n Int : 최소 " + Integer.MIN_VALUE +", 최대 "+Integer.MAX_VALUE
				+ "\n Long : 최소 " + Long.MIN_VALUE +", 최대 "+Long.MAX_VALUE
				+ "\n Float : 최소 " + Float.MIN_VALUE +", 최대 "+Float.MAX_VALUE
				+ "\n Double : 최소 " + Double.MIN_VALUE +", 최대 "+Double.MAX_VALUE
				+ "\n Char(유니코드) : 최소 '" + (int)Character.MIN_VALUE +"', 최대 '"+(int)Character.MAX_VALUE+"'");	
	}

	public void bitSize() {
		// TODO Auto-generated method stub
		System.out.println("기본자료형 비트개수 확인하기"
				+ "\n Byte : " + Byte.SIZE
				+ "\n Short : " + Short.SIZE
				+ "\n Int : " + Integer.SIZE
				+ "\n Long : " + Long.SIZE
				+ "\n Float : " + Float.SIZE
				+ "\n Double : " + Double.SIZE
				+ "\n Char : " + Character.SIZE);	
	}

}
