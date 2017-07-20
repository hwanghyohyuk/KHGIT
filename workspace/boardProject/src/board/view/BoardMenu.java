package board.view;

import java.util.Scanner;

import board.controller.BoardManager;

public class BoardMenu {

	private Scanner sc = new Scanner(System.in);
	private BoardManager bm = new BoardManager();
	public BoardMenu() {
		super();
	}

	public void mainMenu() {
		do {
			System.out.print("******* 게시글 서비스 프로그램 *******\n"
					+ "1. 게시글 쓰기\n"
					+ "2. 게시글 전체 보기\n"
					+ "3. 게시글 한개 보기\n"
					+ "4. 게시글 제목 수정\n"
					+ "5. 게시글 내용 수정\n"
					+ "6. 게시글 삭제\n"
					+ "7. 게시글 검색\n"
					+ "8. 파일에 저장하기\n"
					+ "9. 정렬하기\n"
					+ "0. 끝내기\n"
					+ "메뉴 번호 선택 : ");
					
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
			case 1: bm.writeBoard();	break;
			case 2: bm.displayAllList();		break;
			case 3: bm.displayBoard();		break;
			case 4: bm.modifyTitle();		break;
			case 5: bm.modifyContent();		break;
			case 6: bm.deleteBoard();		break;
			case 7: bm.searchBoard();		break;
			case 8: bm.saveListFile();		break;
			case 9: new BoardMenu().sortSubMenu();	break;
			case 0: System.out.println("프로그램을 종료합니다");	return;
			default:	System.out.println("다시 입력해주세요");	break;
			}
		}while(true);
	}

	public void sortSubMenu() {
		do {
			System.out.print("******* 게시글 서비스 프로그램 *******\n"
					+ "1. 글번호순 오름차순정렬\n"
					+ "2. 글번호순 내림차순정렬\n"
					+ "3. 작성날짜순 오름차순정렬\n"
					+ "4. 작성날짜순 내림차순정렬\n"
					+ "5. 글제목순 오름차순정렬\n"
					+ "6. 글제목순 내림차순정렬\n"
					+ "7. 이전 메뉴로 이동\n"
					+ "메뉴 번호 : ");					
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
			case 1: bm.sortList(1, false);	break;
			case 2: bm.sortList(1, true);		break;
			case 3: bm.sortList(2, false);		break;
			case 4: bm.sortList(2, true);		break;
			case 5: bm.sortList(3, false);		break;
			case 6: bm.sortList(3, true);		break;
			case 7:	return;
			default:	System.out.println("다시 입력해주세요");	break;
			}
		}while(true);
	}
}
