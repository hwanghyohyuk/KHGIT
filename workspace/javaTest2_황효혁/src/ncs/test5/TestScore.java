package ncs.test5;

import java.util.Scanner;

public class TestScore {

	public static void main(String[] args) {
		double[][] grade = new double[3][5];
		double dsum=0;
		Scanner sc =new Scanner(System.in);
		for(int i = 0; i<grade.length;i++){
			System.out.println("학생"+(i+1));
			for(int j = 0; j<3;j++){
				System.out.print("과목"+(j+1)+" : ");
				grade[i][j] = sc.nextDouble();
			}			
		}
		
		for(int i = 0; i<grade.length;i++){
			for(int j = 0; j<grade[i].length;j++){
						if(j<3){
							dsum+=grade[i][j];
						}else if(j==3){
							grade[i][j]=dsum;
						}else{
							grade[i][j]=dsum/3;
						}						
			}
			dsum=0;
		}
		System.out.println("index\t과목1\t과목2\t과목3\t총점\t평균");
		for(int i = 0; i<grade.length;i++){
			System.out.print(i+"\t");
			for(int j = 0; j<grade[i].length;j++){
				System.out.print(grade[i][j]+"\t");
			}
			System.out.println();
		}
		sc.close();
	}

}
