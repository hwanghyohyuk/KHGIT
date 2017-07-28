package testChattingProject;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private static void run() {
		try {
			ServerSocket serverSocket =new ServerSocket(6000);
			System.out.println("서버 구동 시작");
			while (true) {
				System.out.println("클라이언트의 접속을 기다리고있습니다.");
				Socket socket = serverSocket.accept();
				System.out.println(socket.getInetAddress()+"에서 입장");
				if (socket != null) {
					ServerThread serverThread = new ServerThread(socket);
					Thread thread = new Thread(serverThread);
					thread.start();
					ServerThreadPool.add(serverThread);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		run();
	}

}
