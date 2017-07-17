package com.week4;

import java.util.StringTokenizer;

public class TestWork2 {
public static void main(String[] args) {
	String str = "J a v a  P r o g r a m ";
	StringTokenizer st = new StringTokenizer(str);
	int ct = st.countTokens();
	char[] charr = new char[ct];
	for(int i=0;i<charr.length;i++){
		charr[i] = st.nextToken().charAt(0);
	}
	System.out.println("문자열 : "+str);
	System.out.println("문자열의 모든 글자 갯수 : "+str.length());
	System.out.println("토큰 처리후 글자 갯수: "+ct);

	System.out.print("char[] 값 출력 : ");
	for(char c : charr){
		System.out.print(c);
	}System.out.println();

	String result = String.valueOf(charr);
	System.out.println("String으로 바꾼 후 모두 대문자 변환 : "+result.toUpperCase());
	
}
}
