package ncs.test1;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input;
		int temp;
		double[] dscore = null;
		double dsum;
		
		System.out.print("공백으로 구분하여 5개 숫자 입력 : ");
		input = sc.nextLine();
		String[] score = input.split(" ");

		sc.close();
		if(score.length==5){
			dscore = new double[score.length];
			for(int i=0; i <score.length;i++){
				temp = Integer.parseInt(score[i]);
				if(temp>9 && temp<100){
					dscore[i]=temp;
				}else{
					System.out.println("다시 입력하세요.");
					return;
				}
			}	
			dsum = (((dscore[0]+dscore[1])/2)*0.6)
					+(((dscore[2]+dscore[3])/2)*0.2)
					+(dscore[4]*0.2);
			System.out.println("평가점수 : "+dsum+"점");
			System.out.print("class : ");
			switch ((int)dsum/10) {
			case 9:	System.out.println("Gold Class");	break;
			case 8:	System.out.println("Silver Class");	break;
			case 7:	System.out.println("Bronze Class");	break;
			default:	System.out.println("Normal Class");		break;
			}			
		}else{
			System.out.println("다시 입력하세요!");
			return;
		}
		return;
	}
}
