package practice3;

import java.util.Scanner;

import practice2.Book;

public class TestBookManagerMap {

	private static Scanner sc = new Scanner(System.in);
	public static void menu(){

		BookManagerMap bm = new BookManagerMap();
		
		do{
			System.out.print("*** 도서 관리 프로그램 ***\n"
					+ "1. 새 도서 추가\n"
					+ "2. 도서정보 정렬후 출력\n"
					+ "3. 도서 삭제\n"
					+ "4. 도서 검색출력\n"
					+ "5. 전체 출력\n"
					+ "6. 끝내기\n"
					+ "메뉴선택 : ");
			int menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {
			case 1:	bm.putBook(inputBook());	break;
			case 2:	bm.printBookMap(bm.sortedBookMap());	break;
			case 3:	
				System.out.print("삭제할 도서명 입력 : ");
				bm.removeBook(bm.searchBook(inputBookTitle()));
				break;
			case 4:	
				System.out.print("검색할 도서명 입력 : ");
				bm.printBook(bm.searchBook(inputBookTitle()));
				break;
			case 5:	bm.displayAll();	break;
			case 6:	return;
			default:
				System.out.println("다시 입력하세요");
				continue;
			}
		}while(true);
	}
	
	public static Book inputBook() {
		System.out.print("도서 번호 : ");
		String bNo = sc.next();
		sc.nextLine();
		System.out.print("카테고리 : ");
		int category = sc.nextInt();
		sc.nextLine();
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		System.out.print("저자 : ");
		String author = sc.next();
		sc.nextLine();
				
		return new Book(bNo, category, title, author);
	}
	
	public static String inputBookTitle() {
		String title = sc.nextLine();
		return	 title;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
		System.out.println("프로그램을 종료합니다.");
	}

}
