package test.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1 {

	public void run() {
		Socket socket = null;
		BufferedReader bufferedReader = null;

		try {
			// 소켓객체 생성
			socket = new Socket("192.168.30.34", 6000);

			// 입출력작업
			// 스트림 조회
			InputStream inputStream = socket.getInputStream();
			bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

			// 작업
			String instr = bufferedReader.readLine();
			System.out.println(instr);

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 연결해제
			// InputSteam 해제
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (socket != null) {
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
		// TODO Auto-generated method stub
		new Client1().run();
	}

}
