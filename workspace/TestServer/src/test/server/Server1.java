package test.server;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {

	public void run(){
		ServerSocket serverSocket = null;
		Socket socket = null;
		PrintWriter printWriter = null;
		
		try {
			//서버 소켓 객체 생성
			serverSocket = new ServerSocket(6000);
			System.out.println("------ 클라이언트의 연결을 기다립니다. ------");
			socket = serverSocket.accept();
			System.out.println("------ 클라이언트 연결 성공 ------");
			
			//입출력 작업
			//클라이언트에 대한 출력스트림 선언
			OutputStream outputStream = socket.getOutputStream();
			//출력스트림을 2차 스트림으로 연결
			printWriter = new PrintWriter(outputStream);
			//작업
			printWriter.println("서버와 성공적으로 연결되었습니다.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//연결해제
			if(printWriter != null){//출력할 내용이 없다면
				printWriter.close(); //OutputStream 해제
			}
			if(socket != null){//소켓이 연결 해제된다면
				try {
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public static void main(String[] args) {
		new Server1().run();
		//서버는 클라이언트의 연결을 기다리고 연결될 시 한 번의 메시지 전송이 이루어진다.
		//즉, 서버와 클라이언트의 짧은 통신 때 사용할 수 있음
	}
}
