package array;

public class Test10 {

	public static void main(String[] args) {
		//변수 선언 및 초기화
		int [][] array =	{{12, 41, 36, 56},
							{82, 10, 12, 61}, 
							{14, 16, 18, 78}, 
							{45, 26, 72, 23}};
		
		int count = 0;
			//기존 배열의 3의배수 들을 카운트
		for(int i = 0; i<array.length;i++){
			for(int j = 0; j<array[i].length;j++){
			if(array[i][j]%3==0){
				count++;
			}
			}
		}
		int[] copyAr = new int[count];//카운트 한만큼 배열 선언(array배열변수안에 3의배수는 총 7개), 즉, int[] copyAr = new int[7]; 과 같은 의미 
		
		//2차원 배열의 3의 배수를 1차원 배열에 입력하는 부분
		count=0;//카운트를 초기화하여 입력받을 인덱스를 카운트로 한다.
		for(int i = 0; i<array.length;i++){
			for(int j = 0; j<array[i].length;j++){
			if(array[i][j]%3==0){
				copyAr[count]=array[i][j];
				count++;
			}
			}
		}
		
		//1차원 배열 출력부분
		System.out.print("copyAr : ");
		for(int i = 0; i<copyAr.length;i++){
			System.out.print(copyAr[i]+"  ");
		}
	}
}
	
