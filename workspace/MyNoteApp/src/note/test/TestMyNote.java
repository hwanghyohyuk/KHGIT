package note.test;

import java.util.Scanner;

import note.controller.MyNote;

public class TestMyNote {
	public static void menu() {
		MyNote my = new MyNote();
		Scanner sc = new Scanner(System.in);
		
		do{
		System.out.print("******   MyNote  *******\n"
				+"1. 노트 새로 만들기\n"
				+"2. 노트 열기\n"
				+"3. 노트 열어서 수정하기\n"
				+"4. 끝내기\n"
				+"메뉴 선택 : ");
		int menu = sc.nextInt();
		sc.nextLine();
		switch (menu) {
		case 1:	my.fileSave();		break;
		case 2:	my.fileOpen();		break;
		case 3:	my.fileEdit();		break;
		case 4:	return;
		default:	System.out.println("잘못입력하셨습니다!");	break;
		}
		}while(true);		
	}
	
	public static void main(String[] args) {
		menu();
		System.out.println("프로그램을 종료합니다.");
	}
}
