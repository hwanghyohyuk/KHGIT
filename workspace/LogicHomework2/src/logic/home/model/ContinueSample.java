package logic.home.model;

import java.util.Random;

public class ContinueSample {
	public void sumJumpThree(){
		/*do while
		int i=0,sum=0;
		do{
			i++;
			if(i%3==0)continue;
			sum+=i;			
		}while(i<100);
		System.out.println("합계 : "+sum);
		*/
		/*while
		int i = 0,sum=0;
		while(i<100){
		i++;
		if(i%3==0)continue;
		sum+=i;		
		}
		System.out.println("합계 : "+sum);
		*/
		//for
		int sum = 0;
		for(int i=1;i<101;i++){
			if(i%3==0)continue;
			sum+=i;
		}
		System.out.println("합계 : "+sum);
	}
	public void rowColJump(){
		Random r = new Random();
		int arr[][]= new int[3][5];
		
		for(int i = 0;i<arr.length;i++){
			for(int j= 0;j<arr[i].length;j++){
				arr[i][j]=r.nextInt(100)+1;
			}
		}
		
		for(int i = 0;i<arr.length;i++){
			for(int j= 0;j<arr[i].length;j++){
				if(i!=0 || j<2){System.out.print(arr[i][j]+"\t");}
			}
			System.out.println();
		}
	}
}
