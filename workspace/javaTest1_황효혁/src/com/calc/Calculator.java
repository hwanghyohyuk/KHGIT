package com.calc;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==2){//입력을 두개만 받을때
		int arr[] = new int[args.length];
		for(int i=0;i<args.length;i++){
			arr[i]=Integer.parseInt(args[i]);
		}
		System.out.println("합 : "+(arr[0]+arr[1]));
		System.out.println("차 : "+(arr[0]-arr[1]));
		System.out.println("곱 : "+(arr[0]*arr[1]));
		if(arr[0]!=0 && arr[1]!=0){
		System.out.println("나누기 : "+ arr[0]/arr[1]);	
		}else{
			System.out.println("0으로 나눌할 수 없습니다.");	
		}		
		}else{//입력이 하나 또는 세개 이상일때
			System.out.println("두 개의 정수만 입력하세요!");
		}
		
	}
}


