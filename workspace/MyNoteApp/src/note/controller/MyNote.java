package note.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyNote {
	private Scanner sc = new Scanner(System.in);

	public MyNote() {
		super();
	}

	public void fileSave() {
		BufferedWriter bw = null;
		System.out.println("파일에 저장할 내용을 입력하시오");
		StringBuilder sb = new StringBuilder();
		String instr = null;
		do {
			instr = sc.nextLine();
			if (instr.equals("exit"))
				break;
			sb.append(instr + "\r\n");
		} while (true);
		System.out.print("저장하시겠습니까? (y/n) : ");
		char ch = sc.next().toUpperCase().charAt(0);
		sc.nextLine();
		if (ch == 'Y') {
			System.out.print("저장할 파일 명 : ");
			String fileName = sc.nextLine();
			try {
				bw = new BufferedWriter(new FileWriter(fileName + ".txt"));
				bw.write(sb.toString());
				bw.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(fileName + ".txt 파일에 성공적으로 저장하였습니다.");
			}
			return;
		}
	}

	public void fileOpen() {
		System.out.print("열기할 파일명 : ");
		String fileName = sc.nextLine();
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fileName + ".txt"));
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return;
	}

	public void fileEdit() {
		System.out.print("수정할 파일명 : ");
		String fileName = sc.nextLine();
		BufferedReader br = null;
		BufferedWriter bw = null;
		StringBuilder sb = new StringBuilder();
		try {
			br = new BufferedReader(new FileReader(fileName + ".txt"));
			String line = null;
			while ((line = br.readLine()) != null) {
				sb.append(line + "\r\n");
			}
			System.out.println("파일에 추가할 내용을 입력하시오");
			do {
				String instr = sc.nextLine();
				if (instr.equals("exit"))
					break;
				sb.append(instr + "\r\n");
			} while (true);
			System.out.print("변경된 내용을 파일에 추가하시겠습니까? (y/n) : ");
			char ch = sc.next().toUpperCase().charAt(0);
			sc.nextLine();
			if (ch == 'Y') {
				bw = new BufferedWriter(new FileWriter(fileName + ".txt"));
				bw.write(sb.toString());
				bw.flush();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println(fileName + ".txt 파일의 내용이 변경되었습니다.");
			try {
				br.close();
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return;
	}
}
