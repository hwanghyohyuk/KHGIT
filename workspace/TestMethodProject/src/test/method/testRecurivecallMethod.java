package test.method;

public class testRecurivecallMethod {

	// 재귀호출
	public int factorial(int num) {
		int result = 1;
		System.out.println("전달값 : " + num);

		if (num > 0)
			result = num * factorial(--num);

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testRecurivecallMethod trm = new testRecurivecallMethod();
		System.out.println(trm.factorial(10));

	}

}
