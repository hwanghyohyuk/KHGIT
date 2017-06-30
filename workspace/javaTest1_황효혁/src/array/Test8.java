package array;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] array = 	{{12, 41, 36, 56}, 
							 {82, 10, 12, 61}, 
							 {14, 16, 18, 78}, 
							 {45, 26, 72, 23}};
		int visitcount = 0;//배열의 각 인덱스를 방문할때마다 카운트한다. 즉 총 배열의 인덱스 갯수를 저장
		double sum=0,
				ave=0;
		
		for(int i = 0; i<array.length;i++){
			for(int j = 0; j<array[i].length;j++){
				sum+=array[i][j];
				visitcount++;
			}
		}
		ave = sum / visitcount; //배열의 인덱스를 방문해서 각각의 값들을 누적저장한 변수를 방문한 횟수로 나눔 = 평균
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+ave);
	}

}
