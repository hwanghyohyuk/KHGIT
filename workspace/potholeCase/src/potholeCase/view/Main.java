package potholeCase.view;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		String result = "";
		char ch;
		
	System.out.print("Camel Case의 문장을 입력하세요 : ");
	str = sc.next();
	sc.close();
	for (int i=0;i<str.length();i++){
		ch = str.charAt(i);
		if(ch>='A' && ch <='Z'){
			ch = str.toLowerCase().charAt(i);
			result+="_"+ch;
		}else if(ch>='0' && ch<='9'){
			result+="_"+ch;
		}else{
			result+=ch;
		}
	}
	System.out.println("Pothole_Case로 변환한 결과 : "+result);
	
	}
}
