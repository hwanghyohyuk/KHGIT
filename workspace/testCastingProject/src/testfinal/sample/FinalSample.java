package testfinal.sample;

public final class FinalSample {

	public static final int VALUE = 123; //멤버 변수(Field)
	private double dnum;
	
	public final void testFinalVariable(){
		//지역변수 Local
		//메소드 안에서 선언되 변수
		//RAM의 stack 영역에 할당됨
		//stack 은 해당 메소드가 실행될 때 변수공간에 만들어지고
		//해당 메소드가 종료되면 자동으로 변수공간이 없어짐
		//지역변수는 반드기 직접 초기화 처리해야 함
		
		//지역변수 자료형앞에 final 키워드 사용가능함
		final int NUM = 100; //값 변경 불가
		System.out.println("num : " + NUM);
		//num = 200;
		System.out.println("dnum : " + dnum);
		
	}
	
	public static void main(String[] args) {
		//final 예약어 테스트

		new FinalSample().testFinalVariable();
	}

}
