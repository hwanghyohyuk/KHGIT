package testChattingProject;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Client {
	
	public static void main(String[] args) {
		try {
			//Socket client = new Socket("192.168.30.2",5000);
			Socket client = new Socket("192.168.30.34",6000);
			System.out.println("서버와 연결되었습니다.");
			
			Scanner sc = new Scanner(System.in);
			String str="";
			while(!str.equals("quit")){
				System.out.print("보낼 메시지 입력 : ");
				str = sc.nextLine();
				
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
				bw.write(str);
				System.out.println("send");
			}			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
