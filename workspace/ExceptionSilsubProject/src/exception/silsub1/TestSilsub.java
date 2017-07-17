package exception.silsub1;

import java.util.Scanner;

public class TestSilsub {

	public void silsub1(){
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		System.out.print("영문자 체크용 문자열 입력 : ");
		inputString = sc.nextLine();
		sc.close();
		try {
			System.out.println(new CharacterProcess().countAlpha(inputString));
		} catch (CharCheckException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestSilsub().silsub1();
	}

}
