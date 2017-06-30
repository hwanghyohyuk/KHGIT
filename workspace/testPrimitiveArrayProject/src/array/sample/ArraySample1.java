package array.sample;

import java.util.Random;

//기본 자료형 1차원 배열 테스트 샘플 제공용
public class ArraySample1 {

	public void testArray1() {
		// TODO Auto-generated method stub
		//같은 자료형 변수가 여러 개 필요한 경우
		
		int[] iar = new int[5];
		System.out.println("iar이 가진 주소 : "+iar.hashCode());
	}

	public void testArray2() {
		int[] random = new int[10];
		Random r = new Random();
		
		for(int i = 0; i<random.length;i++){
			random[i] = (int)(Math.random()*99)+1;
			System.out.println("random["+i+"] 랜덤 출력 : "+random[i]);
		}
		
	}
}
