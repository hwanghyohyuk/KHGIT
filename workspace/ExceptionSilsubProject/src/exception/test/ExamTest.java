package exception.test;

import java.util.Scanner;

import com.week4.ExamString;

public class ExamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("영문자열 입력 : ");
		String str = sc.nextLine();
		System.out.print("찾을 영문자 입력 : ");
		char ch = sc.next().charAt(0);
		ExamString es = new ExamString();
		System.out.println("첫글자 대문자 변환 : "+es.preChar(str));
		System.out.println("찾은 영문자 갯수 : "+es.charSu(str, ch));
		
	}

}
