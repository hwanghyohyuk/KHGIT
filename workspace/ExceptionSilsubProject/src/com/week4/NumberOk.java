package com.week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class NumberOk {
	
	private static int rNum = (int)(Math.random()*100+1);
	private static int count = 0;
	
	public int getNumber(){
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("정수 입력 : ");
		int num=0;
		try {
			num = Integer.parseInt(inbr.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("숫자입력오류");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("입력오류");
		}
		return num;
	}
	
	public int questionNumber(int num){
		if(num>rNum){
			System.out.println("작다");
			count++;
			return 1;
		}else if(num == rNum){
			System.out.println("맞혔습니다.("+count+"번)\n");
			return 0;
		}else{//num<rNum
			System.out.println("크다");
			count++;
			return -1;
		}
	}
	
public static void main(String[] args) {
	BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
	NumberOk no = new NumberOk();
	int answer = 0;
	char more = 0;
	do{
		answer = no.getNumber();
		if(no.questionNumber(answer)==0){
			System.out.print("계속 하시겠습니까?(y/n) : ");
			try {
				more = inbr.readLine().toUpperCase().charAt(0);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("입력오류");
			}
			if(more=='Y'){
				rNum = (int)(Math.random()*100+1);
				count=0;
			}
		}		
	}while(more != 'N');
	
	
}
}
