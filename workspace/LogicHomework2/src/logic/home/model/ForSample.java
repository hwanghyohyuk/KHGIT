package logic.home.model;

import java.util.Scanner;

public class ForSample {
	
	private Scanner sc = new Scanner(System.in);
	
	public void sum1To10(){
		int sum=0;
		System.out.println("1부터 10까지 정수들의 합계");
		for(int i = 1 ; i<10;i++){
			sum+=i;
		}
		System.out.println("합계 : "+sum);
	}	
	
	public void sumEven1To100(){
		int evenSum = 0;
		System.out.println("1부터 100까지 짝수들의 합계");		
		for(int i = 1;i<101;i++){
			if(i%2==0){
				evenSum+=i;
			}
		}
		System.out.println("합계 : "+evenSum);		
	}
	
	public void oneGugudan(){
		int input;
		System.out.print("구구단 중 출력할 단 입력 : ");
		input = sc.nextInt();
		for(int i = 1;i<10;i++){
			System.out.println(input+" X "+i+" = "+(input*i));
		}
	}
	
	public void sumMinToMax(){
		int min,max,temp,sum=0;
		
		System.out.println("입력한 두 수 사이의 정수(두 수 포함)의 합계 구하기");
		System.out.print("정수입력 : ");
		min = sc.nextInt();
		System.out.print("정수입력 : ");
		max = sc.nextInt();
		
		if(min>max){//스왑
			temp = min;
			min = max;
			max = temp;
		}
		for(int i = min;i<=max;i++){
			sum+=i;
		}
		System.out.println("합계 : "+sum);		
	}
	
	public void printStar(){
		int width,height;
		System.out.println("별찍기!");
		System.out.print("줄 수 입력 : ");
		height = sc.nextInt();
		System.out.print("칸 수 입력 : ");
		width = sc.nextInt();
		
		for(int i=0;i<height;i++){
			for(int j=0;j<width;j++){
				System.out.print("   *");
			}
			System.out.println();
		}
	}
	
	public void printNumberStar(){
		for(int i=1;i<8;i++){
			for(int j=1;j<8;j++){
				if(i==j){
					System.out.print("   "+i);
				}else{
					System.out.print("   *");
				}
			}
			System.out.println();
		}
	}
	
	public void printTriangleStar(){
		int height;
		System.out.println("직각(양수), 역(음수) 삼각형 별찍기!");
		System.out.print("줄 수 입력 : ");
		height = sc.nextInt();
		if(height>0){
		for(int i=0;i<height;i++){
			for(int j=1;j<height-i;j++){
				System.out.print("\t");
			}
			for(int j=0;j<i+1;j++){
				System.out.print("\t*");
			}
			System.out.println("\n");
		}
		}else if(height==0){
			System.out.println("0을 입력하셨습니다.");
		}else {
			height = -height;
			for(int i=0;i<height;i++){
				for(int j=0;j<i;j++){
					System.out.print("\t");
				}
				for(int j=1;j<height-i;j++){
					System.out.print("\t*");
				}
				for(int j=2;j<height-i;j++){
					System.out.print("\t*");
				}
				System.out.println("\n");
			}
		}
	}
	
	public void guguDan(){
		for(int i=2;i<10;i++){
			System.out.println("***** "+i+"단 *****");
			for(int j=1;j<10;j++){
				System.out.println(i+" X "+j+" = "+(i*j));
			}			
		}
	}
}
