package member.view;

import java.util.Scanner;

import member.model.dao.MemberManager;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	MemberManager mManager = new MemberManager();

	public MemberMenu() {
		// TODO Auto-generated constructor stub
	}

	public void mainMenu() {
		int menu;
		do {
			System.out.println("----------------------------------------------------------------");
			System.out.println("최대 등록 가능한 회원 수는 " + mManager.SIZE + "명입니다.");
			System.out.println("현재 등록된 회원수는 " + mManager.getMemberCount() + "명 입니다.");
			System.out.println("----------------------------------------------------------------");
			System.out.print("***** 회원 관리 프로그램 *****\n" + "1. 새 회원 등록\n" + "2. 회원 조회\n" + "3. 회원 정보 수정\n"
					+ "4. 회원 정보 정렬\n" + "5. 회원 삭제\n" + "6. 모두 출력\n" + "9. 끝내기\n" + "메뉴 선택 : ");
			menu = sc.nextInt();
			System.out.println("----------------------------------------------------------------");
			switch (menu) {
			case 1:
				mManager.memberInput();
				break;
			case 2:
				searchMenu();
				break;
			case 3:
				modifyMenu();
				break;
			case 4:
				sortMenu();
				break;
			case 5:
				mManager.deleteMember();
				break;
			case 6:
				mManager.printAllMember();
				break;
			case 9:
				System.out.print("정말로 끝내시겠습니까? (y/n) : ");
				if (sc.next().toUpperCase().charAt(0) == 'Y')
					return;
				else
					continue;
			default:
				System.out.println("다시 입력해주세요.");
				continue;
			}
		} while (true);

	}

	public void searchMenu() {
		int menu;
		int index;
		do {
			System.out.print("***** 회원 관리 프로그램 *****\n" + "1. 아이디로 검색\n" + "2. 이름으로 검색\n" + "3. 이메일로 검색\n"
					+ "9. 끝내기\n" + "메뉴 선택 : ");
			menu = sc.nextInt();
			System.out.println("----------------------------------------------------------------");

			switch (menu) {
			case 1:
				System.out.print("아이디 입력 : ");
				index = mManager.searchMemberId(sc.next());
				break;
			case 2:
				System.out.print("이름 입력 : ");
				index = mManager.searchMemberName(sc.next());
				break;
			case 3:
				System.out.print("이메일 입력 : ");
				index = mManager.searchMemberEmail(sc.next());
				break;
			case 9:
				System.out.println("메인 메뉴로 화면 이동합니다.");
				return;
			default:
				System.out.println("다시 입력해주세요.");
				continue;
			}
			System.out.println("-----------------------------결과------------------------------");
			mManager.printMember(index);
			System.out.println("----------------------------------------------------------------");
		} while (true);
	}

	public void sortMenu() {
		int menu;
		do {
			System.out.print("***** 회원 정보 정렬 출력 메뉴 *****\n" + "1. 아이디 오름차순 정렬 출력\n" + "2. 아이디 내림차순 정렬 출력\n"
					+ "3. 나이 오름차순 정렬 출력\n" + "4. 나이 내림차순 정렬 출력\n" + "5. 성별 내림차순 정렬 출력(남여순)\n" + "9. 이전 메뉴로 가기\n"
					+ "메뉴 선택 : ");
			menu = sc.nextInt();
			System.out.println("----------------------------------------------------------------");
			switch (menu) {
			case 1:
				mManager.sortIDAsc();
				break;
			case 2:
				mManager.sortIDDes();
				break;
			case 3:
				mManager.sortAgeAsc();
				break;
			case 4:
				mManager.sortAgeDes();
				break;
			case 5:
				mManager.sortGenderDes();
				break;
			case 9:
				System.out.println("메인 메뉴로 화면 이동합니다.");
				return;
			default:
				System.out.println("다시 입력해주세요.");
				continue;
			}
		} while (true);
	}

	public void modifyMenu() {
		int menu;
		int index;
		do {
			System.out.print("***** 회원 정보 수정 메뉴 *****\n" + "1. 암호 변경\n" + "2. 이메일 변경\n" + "3. 나이 변경\n"
					+ "9. 이전 메뉴로 가기\n" + "메뉴 선택 : ");
			menu = sc.nextInt();
			System.out.println("----------------------------------------------------------------");

			switch (menu) {
			case 1:
				System.out.print("변경할 회원의 아이디 입력 : ");
				index = mManager.searchMemberId(sc.next());
				System.out.println("----------------------------------------------------------------");
				mManager.printMember(index);
				System.out.println("----------------------------------------------------------------");
				if (index != -1) {
					System.out.print("변경할 암호 입력 : ");
					mManager.findMember(index).setPassword(sc.next());
					System.out.println("----------------------------------------------------------------");
					System.out.println("회원정보가 변경되었습니다.");
				}
				System.out.println("----------------------------------------------------------------");
				break;
			case 2:
				System.out.print("변경할 회원의 아이디 입력 : ");
				index = mManager.searchMemberId(sc.next());
				System.out.println("----------------------------------------------------------------");
				mManager.printMember(index);
				System.out.println("----------------------------------------------------------------");
				if (index != -1) {
					System.out.print("변경할 이메일 주소 입력 : ");
					mManager.findMember(index).setEmail(sc.next());
					System.out.println("----------------------------------------------------------------");
					System.out.println("회원정보가 변경되었습니다.");
				}
				System.out.println("----------------------------------------------------------------");
				break;
			case 3:
				System.out.print("변경할 회원의 아이디 입력 : ");
				index = mManager.searchMemberId(sc.next());
				System.out.println("----------------------------------------------------------------");
				mManager.printMember(index);
				System.out.println("----------------------------------------------------------------");
				if (index != -1) {
					System.out.print("변경할 나이 입력 : ");
					mManager.findMember(index).setAge(sc.nextInt());
					System.out.println("----------------------------------------------------------------");
					System.out.println("회원정보가 변경되었습니다.");
				}
				System.out.println("----------------------------------------------------------------");
				break;
			case 9:
				System.out.println("메인 메뉴로 화면 이동합니다.");
				return;
			default:
				System.out.println("다시 입력해주세요.");
				continue;
			}
		} while (true);
	}

}
