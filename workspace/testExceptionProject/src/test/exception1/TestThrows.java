package test.exception1;

import java.io.*;


public class TestThrows {
	
	public void methodA() throws FileNotFoundException{
		methodB();
	}
	public void methodB() throws FileNotFoundException{
		methodC();
	}
	public void methodC() throws FileNotFoundException{
					FileReader fileReader = new FileReader("sample.txt");
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		TestThrows tt = new TestThrows();
		tt.methodA();
	}

}
