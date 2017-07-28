package testChattingProject;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {
	/*
	 * Thread 클래스 Socket을 받아 그에 연결된 클라이언트가 보내는 패킷을 분석하여 작업을 진행한다. Server의 패킷을 받는
	 * 부분
	 */

	private Socket socket;

	public ServerThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		System.out.println("서버쓰레드 실행중");
		InputStream input=null;
		try {
			input = socket.getInputStream();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		BufferedReader br=null;
		String receiveString = "";
		String sendString = null;	
		try {
			System.out.println("1");
			br = new BufferedReader(new InputStreamReader(input));
			//bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			receiveString = br.readLine();
			System.out.println("2");
			while(true){
				System.out.println("3");
				receiveString = br.readLine();
				if(!(receiveString.equals(""))&& !(receiveString.equals("quit"))){
					sendString = receiveString;
					System.out.println(sendString);
				//	bw.write(sendString);
				//	bw.flush();
				}				
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("연결이 종료되었습니다.");
		}finally {
			try {
				br.close();
			//	bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
				
	}

}
