package member.model.dao;

import java.util.Scanner;

import member.model.dto.Member;

public class MemberManager {
	public static final int SIZE = 10;
	private int memberCount = 0;
	private Scanner sc = new Scanner(System.in);
	private Member[] mar = new Member[SIZE];

	// 초기화블럭
	{
		mar[0] = new Member("kim12*3", "김유신", "pwkkk34!", "kim123@naver.com", 'M', 35);
		mar[1] = new Member("hhh618", "황효혁", "123456", "hhhwang618@naver.com", 'M', 26);
		mar[2] = new Member("hhb228", "황효빈", "123456", "hhb228@naver.com", 'M', 23);
		mar[3] = new Member("leekh", "이경희", "123456", "leekh@naver.com", 'F', 23);
		mar[4] = new Member("yksrose77#", "윤경숙", "yksrose77#", "yksrose77@daum.net", 'F', 29);
		memberCount = 5;
	}

	public int getMemberCount() {
		return memberCount;
	}

	public void memberInput() {
		mar[memberCount] = new Member();
		System.out.println("***** 새 회원 정보 입력 *****");
		System.out.print("아이디 : ");
		mar[memberCount].setId(sc.next());
		System.out.print("이름 : ");
		mar[memberCount].setName(sc.next());
		System.out.print("비밀번호 : ");
		mar[memberCount].setPassword(sc.next());
		System.out.print("이메일 : ");
		mar[memberCount].setEmail(sc.next());
		System.out.print("성별 : ");
		mar[memberCount].setGender(sc.next().toUpperCase().charAt(0));
		System.out.print("나이 : ");
		mar[memberCount].setAge(sc.nextInt());
		System.out.println("정상적으로 입력되었습니다.");
		memberCount++;
	}

	public void deleteMember() {
		System.out.print("삭제할 회원 아이디 : ");
		int index = searchMemberId(sc.next());
		printMember(index);
		if (index > -1) {
			System.out.print("정말로 삭제하시겠습니까? (y/n) : ");
			char delete = sc.next().toUpperCase().charAt(0);
			if (delete == 'Y') {
				if (index < memberCount - 1) {// 0또는 중간위치
					for (int i = index; i < memberCount - 1; i++) {
						mar[i] = mar[i + 1]; // 현재인덱스값에 다음인덱스 값을 채워넣음
					}
					mar[memberCount] = null; // 모든 이동이 종료되면 마지막인덱스의 값을 비운다.
				} else {// 마지막인덱스일경우
					mar[index] = null;
				}
				System.out.println("정상적으로 삭제되었습니다.");
				memberCount--; // 회원수를 감소시킴
			} else {
				System.out.println("이전 메뉴로 돌아갑니다.");
				return;
			}
		}
	}

	public void printMember(int index) {
		if (index > -1) {
			System.out.println("아이디\t비밀번호\t이름\t이메일\t성별\t나이");
			System.out.println(mar[index].memberInfo());
		} else {
			System.out.println("회원정보가 존재하지 않습니다.");
		}
	}

	public void printAllMember() {
		System.out.println("아이디\t비밀번호\t이름\t이메일\t성별\t나이");
		for (int i = 0; i < memberCount; i++) {
			System.out.println(mar[i].memberInfo());
		}
	}

	public int searchMemberId(String next) {
		for (int i = 0; i < memberCount; i++) {
			if (next.equals(mar[i].getId()))
				return i;
		}
		return -1;
	}

	public int searchMemberName(String next) {
		for (int i = 0; i < memberCount; i++) {
			if (next.equals(mar[i].getName()))
				return i;
		}
		return -1;
	}

	public int searchMemberEmail(String next) {
		for (int i = 0; i < memberCount; i++) {
			if (next.equals(mar[i].getEmail()))
				return i;
		}
		return -1;
	}

	public void sortIDAsc() {// 아이디 오름차순 정렬
		Member[] cmar = new Member[memberCount];
		Member temp = null;
		System.arraycopy(mar, 0, cmar, 0, memberCount);
		for (int i = 0; i < memberCount; i++) {
			for (int j = i + 1; j < memberCount; j++) {
				if (cmar[i].getId().compareTo(cmar[j].getId()) > 0) {// 알파벳순
					temp = cmar[i];
					cmar[i] = cmar[j];
					cmar[j] = temp;
				}
			}
		}
		for (int i = 0; i < memberCount; i++) {
			System.out.println(cmar[i].memberInfo());
		}
		System.out.println("----------------------------------------------------------------");
	}

	public void sortIDDes() {// 아이디 내림차순
		Member[] cmar = new Member[memberCount];
		Member temp = null;
		System.arraycopy(mar, 0, cmar, 0, memberCount);
		for (int i = 0; i < memberCount; i++) {
			for (int j = i + 1; j < memberCount; j++) {
				if (cmar[i].getId().compareTo(cmar[j].getId()) < 0) {// 알파벳순
					temp = cmar[i];
					cmar[i] = cmar[j];
					cmar[j] = temp;
				}
			}
		}
		for (int i = 0; i < memberCount; i++) {
			System.out.println(cmar[i].memberInfo());
		}
		System.out.println("----------------------------------------------------------------");
	}

	public void sortAgeAsc() {// 나이 오름차순
		Member[] cmar = new Member[memberCount];
		Member temp = null;
		System.arraycopy(mar, 0, cmar, 0, memberCount);
		for (int i = 0; i < memberCount; i++) {
			for (int j = i + 1; j < memberCount; j++) {
				if (cmar[i].getAge() > cmar[j].getAge()) {
					temp = cmar[i];
					cmar[i] = cmar[j];
					cmar[j] = temp;
				}
			}
		}
		for (int i = 0; i < memberCount; i++) {
			System.out.println(cmar[i].memberInfo());
		}
		System.out.println("----------------------------------------------------------------");
	}

	public void sortAgeDes() {// 나이 내림차순
		Member[] cmar = new Member[memberCount];
		Member temp = null;
		System.arraycopy(mar, 0, cmar, 0, memberCount);
		for (int i = 0; i < memberCount; i++) {
			for (int j = i + 1; j < memberCount; j++) {
				if (cmar[i].getAge() < cmar[j].getAge()) {
					temp = cmar[i];
					cmar[i] = cmar[j];
					cmar[j] = temp;
				}
			}
		}
		for (int i = 0; i < memberCount; i++) {
			System.out.println(cmar[i].memberInfo());
		}
		System.out.println("----------------------------------------------------------------");
	}

	public void sortGenderDes() {// 성별 내림차순
		Member[] cmar = new Member[memberCount];
		Member temp = null;
		System.arraycopy(mar, 0, cmar, 0, memberCount);
		for (int i = 0; i < memberCount; i++) {
			for (int j = i + 1; j < memberCount; j++) {
				if (cmar[i].getGender() < cmar[j].getGender()) {// M > F (UNICODE 값)
					temp = cmar[i];
					cmar[i] = cmar[j];
					cmar[j] = temp;
				}
			}
		}
		for (int i = 0; i < memberCount; i++) {
			System.out.println(cmar[i].memberInfo());
		}
		System.out.println("----------------------------------------------------------------");
	}

	public Member findMember(int index) {
		return mar[index];
	}

}
