package test.controller;

public class Test3 {

	public static void main(String[] args) {
		int i=0;
		double sum=0,ave = 0;
		do{
			sum+=++i;	
		}while(i<100);
		
		ave = sum/i;
		System.out.println("1부터 100까지");
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+ave);
	}

}
