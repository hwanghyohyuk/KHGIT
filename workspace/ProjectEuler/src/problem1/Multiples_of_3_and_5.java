package problem1;

public class Multiples_of_3_and_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int m35sum =0;
		for(int i =1; i<10;i++){
			if(i%3==0 || i%5==0){
				m35sum +=i;
			}			
			
		}
		System.out.println("10보다 작은 수 중 3과 5의 배수의 합은 "+m35sum);
	
	}

}
