package exception.test;

import java.util.Scanner;
import exception.silsub1.CharCheckException;
import exception.silsub1.CharacterProcess;
import exception.silsub2.NumberProcess;
import exception.silsub2.NumberRangeException;

public class TestSilsub {
	Scanner sc = new Scanner(System.in);
	public void silsub1(){		
		System.out.print("영문자 체크용 문자열 입력 : ");
		String inputString = sc.nextLine();
		sc.close();
		try {
			System.out.println(new CharacterProcess().countAlpha(inputString));
		} catch (CharCheckException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

	public void silsub2(){
		System.out.print("첫번째 수 입력 : ");
		int inputNum1 = sc.nextInt();
		System.out.print("두번째 수 입력 : ");
		int inputNum2 = sc.nextInt();
		sc.close();
		boolean result;
		try {
			result = new NumberProcess().checkDouble(inputNum1, inputNum2);
			System.out.println(inputNum1+"은/는"+inputNum2+"의 "+((result==true)?"배수이다":"배수가 아니다"));
		} catch (NumberRangeException e) {
			System.out.println(e.getMessage());
		}		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new TestSilsub().silsub1();
		new TestSilsub().silsub2();
}

}
