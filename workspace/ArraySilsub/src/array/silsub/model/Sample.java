package array.silsub.model;

import java.util.Scanner;

public class Sample {
public void munjae1() {
	int arr[][] = new int[4][4];
	
	//0,0 2,2 까지 랜덤 정수로 초기화 나머지는 0으로 초기화
	for(int i = 0; i<arr.length;i++){
		for(int j= 0; j<arr[i].length;j++){
			if(i<arr.length-1 && j<arr[i].length-1){
			arr[i][j] =(int)(Math.random()*100)+1;	
			}else{
				arr[i][j]=0;
			}
		}
	}

	//초기화 된 정수값들을 더하는 일련의 작업들
	for(int i = 0; i<arr.length-1;i++){
		for(int j= 0; j<arr[i].length-1;j++){
			arr[3][i] += arr[i][j];
			arr[i][3] += arr[i][j];
			
		}
		arr[3][3] += arr[i][3]+ arr[3][i];
	} 
	
	//출력
	for(int i = 0; i<arr.length;i++){
		for(int j= 0; j<arr[i].length;j++){
			System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
	} 
}
public void munjae2(){
	Scanner sc = new Scanner(System.in);
	int y;
	
	System.out.print("3행짜리 2차원 배열 선언을 위한 열의 갯수 입력 : ");
	y = sc.nextInt();
	
	int arr[][] = new int[3][y];
	int sum[]=new int[3];
	
	//초기화부분
	for(int i = 0;i<arr.length;i++){
		for(int j = 0;j<arr[i].length;j++){
			arr[i][j] = (int)(Math.random()*100)+1;
		}
	}
	//계산부분
	for(int i = 0;i<arr.length;i++){
		for(int j = 0;j<arr[i].length;j++){
			sum[i] += arr[i][j];
		}
	}
	//출력부분
	for(int i = 0;i<arr.length;i++){
		if(sum[i]%5==0){
			System.out.println("5로 나누어 떨어지는 행은 "+i+"번째 행");
			for(int j = 0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}		
	}	
}
}
