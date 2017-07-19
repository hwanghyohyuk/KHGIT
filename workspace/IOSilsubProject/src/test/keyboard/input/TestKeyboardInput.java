package test.keyboard.input;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestKeyboardInput {

	public static void main(String[] args) throws IOException {
		/*
		System.out.print("값 입력 : ");
		int value = System.in.read();
		System.out.println("value : "+value);
		System.out.println("value : "+(value-48));
		
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("정수 입력 : ");
		String line = inbr.readLine();
		long num = Long.parseLong(line);
		System.out.println(num);
		
		*/
		
		DataInputStream keyboard = new DataInputStream(System.in);
		System.out.print("정수 입력 : ");
		int score = keyboard.readInt();
		System.out.println(score);
	}
}
