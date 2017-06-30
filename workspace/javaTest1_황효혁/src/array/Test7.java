package array;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		double sum = 0;
		for(int i = 0; i<array.length; i++){
			if(array[i]%2!=0){//배열의 인덱스를 방문하여 2로 나눈 나머지가 0이아닐때
				System.out.println(array[i]);
				sum+=array[i];//합계에 누적한다
			}
		}
		System.out.println("합계 : "+sum);
	}

}
