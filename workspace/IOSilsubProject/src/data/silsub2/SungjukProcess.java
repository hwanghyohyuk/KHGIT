package data.silsub2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SungjukProcess {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		SungjukProcess sp = new SungjukProcess();
		//sp.sungjukSave();
		sp.scoreRead();
	}

	public void sungjukSave() {
		int korean, english, mathmatic;
		int sum = 0;
		double ave = 0.0;

		do {
			System.out.print("국어 점수 : ");
			korean = sc.nextInt();
			System.out.print("수학 점수 : ");
			english = sc.nextInt();
			System.out.print("영어 점수 : ");
			mathmatic = sc.nextInt();

			sum = korean + english + mathmatic;
			ave = sum / 3.0;

			try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("score.dat", true))) {
				dos.writeInt(korean);
				dos.writeInt(english);
				dos.writeInt(mathmatic);
				dos.writeInt(sum);
				dos.writeDouble(ave);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.print("계속 하시겠습니까? (y/n) : ");
			if (sc.next().toUpperCase().charAt(0) != 'Y') break;

		} while (true);
		System.out.println("score.dat 에 저장 완료.");
	}

	public void scoreRead() {
		int korean, english, mathmatic;
		int sum = 0;
		double ave = 0.0;
		int count = 0;
		int totalsum = 0;
		double totalave = 0.0;

		try (DataInputStream dis = new DataInputStream(new FileInputStream("score.dat"))) {
			do {
				korean = dis.readInt();
				english = dis.readInt();
				mathmatic = dis.readInt();
				sum = dis.readInt();
				ave = dis.readDouble();
				totalsum += sum;
				count++;
				System.out.println(korean + "\t" + english + "\t" + mathmatic + "\t" + sum + "\t" + ave);
			} while (true);
		} catch (EOFException e) {
			totalave = totalsum / (count*3);
			System.out.println("---------------------------------------------------------------------------");
			System.out.printf("읽은 횟수 : %d회, 전체 총점 :  %d점, 전체 평균 : %.2f점",count,totalsum,totalave);
			System.out.println();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("score.dat 파일 읽기 완료.");
		}

}
