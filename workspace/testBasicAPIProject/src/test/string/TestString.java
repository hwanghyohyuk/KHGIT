package test.string;

public class TestString {

	public static void main(String[] args) {
		// String 클래스 테스트
		// 자바에서는 문자열 값을 다루기 위해 String 클래스 제공
		// 클래스의 사용 : 클래스형 레퍼런스 = new 생성자(초기값);
		String st1 = new String( "java" );
		
		//String 클래스만 예외로 기본 자료형처럼 사용가능
		//자료형 변수명 = 초기값;
		String st2 = "oracle";
		
		//자바는 모든 문자열값을 힙영역의 문자열 저장소에 기록함
		//문자열 저장소에 기록되는 문자열값은 한번만 기록됨
		String st3 = "java"; //이미 기록된 문자열의 주소리턴

		System.out.println("st1 : "+st1.hashCode());
		System.out.println("st2 : "+st2.hashCode());
		System.out.println("st3 : "+st3.hashCode());
		System.out.println("주소가 같은가? : "+st1 == st3);
		//hashcode 상으로는 같은 주소(최종 참조 주소가 같음)이지만 내부적으로 가르키는 주소는 다르다
		
		//String is immutable. 문자열 값은 불변이다.
		//문자열 저장소에 기록된 문자열 값은 수정할 수 없음
		//문자열 값을 수정하면, 원래 문자열은 그대로 있고
		//변경된 문자열을 문자열 저장소에 새로 기록함
		String st4 = st3.toUpperCase();
		System.out.println("st1 : "+st1);
		System.out.println("st4 : "+st4);
		System.out.println("st1 : "+st1.hashCode());
		System.out.println("st4 : "+st4.hashCode());
		String st5 = "javb";
		System.out.println("st5 : "+st5.hashCode());
		
		String st6 = "aa";
		String st7 = "ab";

		System.out.println("st6 : "+st6.hashCode());
		System.out.println("st7 : "+st7.hashCode());
	}
}
