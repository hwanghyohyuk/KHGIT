package test.string;

public class TestString {
 
	public static void main(String[] args){
		
		String str = "red apples";
		String result1 = str.substring(4);
		String result2 = str.substring(0,3);//두번째 파라미터 값-1한 값까지만 추출
		System.out.println(result1);
		System.out.println(result2);	
	}
}
