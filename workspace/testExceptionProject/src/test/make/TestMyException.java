package test.make;

public class TestMyException {
	
	public void calculator(){
		int result =0;
		try {
			result = new ExceptionSample().divide(10, 0);
		} catch (MyException e) {
			System.out.println(e.getMessage());
			//return;
			Information();
		}
		
	}
	public void Information(){
		System.out.println("Information() 구동 중...");
	}
	
	public static void main(String[] args) {
		//사용자 정의 예외 클래스 사용 테스트
		new TestMyException().calculator();
	}
}
