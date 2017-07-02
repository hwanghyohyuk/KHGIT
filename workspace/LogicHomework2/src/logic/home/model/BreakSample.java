package logic.home.model;

public class BreakSample {
	public void sumBreak(){
		int i = 1,sum=0;
		while(true){
			if(i>100){
				break;
			}
			sum +=i++;
		}
		System.out.println("1부터 100까지 합계 : "+sum);
	}
	public void guguDanBreak(){
		for(int i=1;i<10;i++){
			System.out.println(i+"단");
			for(int j=1;j<10;j++){
				if(j==5){
					break;
				}
				System.out.println(i+" X "+j+" = "+i*j);
			}
			System.out.println();
		}
	}
}
