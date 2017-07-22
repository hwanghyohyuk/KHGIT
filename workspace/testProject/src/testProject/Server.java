package testProject;

import java.io.*;
import java.net.*;

public class Server {
	public static void run() {
		/*
		 * Server Socket 생성 Client 연결 대기 > Socket 생성 Server Thread를 Start
		 */
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(6000);
			System.out.println("서버 정상 구동!");
			while (true) {
				Socket socket = serverSocket.accept();
				if (socket != null) {
					ServerThread serverThread = new ServerThread(socket);
					Thread thread = new Thread(serverThread);
					thread.start();
					ServerThreadPool.add(serverThread);
				}
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		run();
		System.out.println("서버가 종료되었습니다.");
	}
}
