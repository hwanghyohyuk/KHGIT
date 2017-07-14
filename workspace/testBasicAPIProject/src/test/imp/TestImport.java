package test.imp;

//import api.sample.*;
//import api.sample.Sample;
//임포트 하고자하는 클래스가 가진 모든 멤버가 static일때
import static api.sample.Sample.*;

public class TestImport {

	public void importStatic(){
		System.out.println(sum(10, 20));
		System.out.println(divide(15, 3));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TestImport().importStatic();
	}

}
