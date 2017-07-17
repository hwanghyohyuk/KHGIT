package test.make;

public class ExceptionSample {

	public ExceptionSample(){}

	public int divide(int x, int y) throws MyException{
		
		int result = 0;
		if (y==0) {
			throw new MyException("0으로 나눌 수 없습니다.");
		}else {
			return  x / y;
		}
	}
	
}
