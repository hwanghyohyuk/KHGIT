package com.week4;

public class ExamString {

	public String preChar(String s){
		char[] chArr=s.toCharArray();
		char ch = chArr[0];
		if( ch >='a' && ch <='z'){
			chArr[0] = (char)((int)ch - 32);
		}else{
			System.out.println("첫글자가 이미 영문자 소문자가 아닙니다.");
		}
		String result = String.valueOf(chArr);		
		return result;
	}
	
	public int charSu(String s, char ch){
		int count=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==ch) count++;
		}
		return count;
	}
	
}
