package logic.home.model;

import java.util.Random;
import java.util.Scanner;

public class WhileSample {
	private Scanner sc = new Scanner(System.in);
	public void printUniCode(){
		char ch;
		while(true){		
		System.out.print("문자 하나 입력 : ");
		ch = sc.next().charAt(0);
		if(ch=='0')break;
		System.out.println("Unicode of '"+ch+"' : "+(int)ch);		
		}	
	}
	
	public void sum1To100(){
		int i=1,sum=0;
		while(i<101){
			sum+=i++;
		}
		System.out.println("1부터 100까지의 합 : "+sum);
	}
	
	public void numberGame(){
		Random r = new Random();
		int answer;
		int input;
		
		System.out.println("1부터 100사이의 숫자 알아 맞추기!");
		answer=r.nextInt(100)+1;
		System.out.print("답 입력 : ");
		input = sc.nextInt();
		System.out.println("출제된 수 :"+answer);
		if(answer == input){
			System.out.println("정답입니다.");
		}else{
			System.out.println("오답입니다.");
		}
	}
	public void countCharacter(){
		String instr;
		
		System.out.print("문자열 입력 : ");
		instr = sc.nextLine();
		
		System.out.println("입력하신 문자열의 글자 수는 "+instr.length()+"개 입니다.");
	}
	
	public void countInChar(){
		String str;
		char ch,ck;
		int count=0;
		
		System.out.print("문자열 입력 : ");
		str = sc.nextLine();
		
		for(int i = 0; i<str.length();i++){
			ck = str.charAt(i);
			if(('a'<=ck && ck <='z')||('A'<=ck && ck<='Z')||(ck==' ')){
			}else{
				System.out.println("영문자가 아닙니다.");
			}
		}
		
		System.out.print("문자 입력 : ");
		ch = sc.next().charAt(0);
			
		for(int i = 0; i<str.length();i++){
			if(str.charAt(i) == ch){
				count++;
			}
		}
		System.out.println("포함된 갯수 : "+count+"\n\n");
		
	}
}
