package test.exception1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestTryCatch {

	public void methodA() {
		FileReader fr = null;

		try {
			fr = new FileReader("sample.txt");
			int ch;
			while ((ch = fr.read()) != -1) {
				System.out.print((char) ch);
			}
			System.out.println("\n파일읽기완료");
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			// TODO: handle exception
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("파일 읽기에 대한 반납오류");
			}
		}
		//상속관계를 생각해서 최하위 예외 상황부터 catch한다.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestTryCatch ttc = new TestTryCatch();
		ttc.methodA();
	}

}
