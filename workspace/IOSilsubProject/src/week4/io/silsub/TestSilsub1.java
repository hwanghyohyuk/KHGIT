package week4.io.silsub;

import java.io.*;

public class TestSilsub1 {

	public void fileSave(){
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("파일 생성에 필요한 이름을 입력해주세요 : ");
		//FileOutputStream fsave = null;
		FileWriter fw = null;
		String fileName =null;
		String contents =null;	
		int countLine = 0;
		try {
			fileName = inbr.readLine();
			// fsave = new FileOutputStream(fileName+".txt");
			fw = new FileWriter(fileName+".txt", true); //appendMode true
			System.out.println("파일에 저장할 내용을 입력하시오.(exit입력시 종료) : ");		
			do{
				countLine++;
				contents = null;
				System.out.print(countLine+" | ");
				contents = inbr.readLine();
				if(contents.equals("exit"))break;
				fw.write(contents+"\r\n");
			}while(true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("성공적으로 저장되었습니다.");
			try {
				//fsave.flush();
				fw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				//fsave.close();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void fileRead(){
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("읽을 파일명을 입력해주세요 : ");
		FileReader fr = null;
		StringBuilder sb = null;
		String fileName =null;
		char ch = 0;
		try {
			fileName = inbr.readLine();
			fr = new FileReader(fileName+".txt");
			sb = new StringBuilder();
			while((byte)(ch = (char)fr.read())!=-1){
				sb.append((char)ch);
			}
			String contents = sb.toString();
			System.out.println(contents);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new TestSilsub1().fileSave();
		new TestSilsub1().fileRead();
	}

}
