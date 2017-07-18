package week4.io.silsub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestSilsub1 {

	public void fileSave(){
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("파일 생성에 필요한 이름을 입력해주세요 : ");
		try {
			String fileName = inbr.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
