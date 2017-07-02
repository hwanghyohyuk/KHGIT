﻿package logic.home.view;

import java.util.Scanner;

import logic.home.model.*;

public class Menu {

	private static Scanner sc = new Scanner(System.in);
	
	public static void mainMenu(){
		char exit='N';
		int input;
		do{
			System.out.print("***** 프로그래밍 기본 기능 테스트 프로그램 *****\n\n"
					+ "\t\t1. 변수 테스트\n"
					+ "\t\t2. 기본 자료형 테스트\n"
					+ "\t\t3. if문 테스트\n"
					+ "\t\t4. switch문 테스트\n"
					+ "\t\t5. for문 테스트\n"
					+ "\t\t6. while문 테스트\n"
					+ "\t\t7. do~while문 테스트\n"
					+ "\t\t8. break문 테스트\n"
					+ "\t\t9. continue문 테스트\n"
					+ "\t\t10. static 메소드 사용 테스트\n"
					+ "\t\t11. non-static 메소드 사용 테스트\n"
					+ "\t\t12. 프로그램 종료\n"
					+ "\t\t메뉴 번호 입력 : ");
			input = sc.nextInt();
						
			switch(input){
			case 1:subVarMenu();
				break;
			case 2:subPTypeMenu();
				break;
			case 3:subIfMenu();
				break;
			case 4:subSwitchMenu();
				break;
			case 5:subForMenu();
				break;
			case 6:subWhileMenu();
				break;
			case 7:subDoWhileMenu();
				break;
			case 8:subBreakMenu();
				break;				
			case 9:subContinueMenu();				
				break;
			case 10:subStaticMethodMenu();
				break;
			case 11:subNonStaticMethodMenu();
				break;
			case 12:
				System.out.print("정말로 종료하시겠습니까? (예:y/아니오:n)");
				exit = sc.next().toUpperCase().charAt(0);
				break;
			default:
				System.out.println("잘못된 값을 입력하셨습니다.");
			}
			
		}while(exit!='Y');
		System.out.println("프로그램을 종료합니다.");
		return;
	}
	 public static void subVarMenu(){
		 int no;
		 VariableSample vs = new VariableSample();
		 do{
		 System.out.print("*** 변수 테스트 부메뉴 ***\n\n"
					+ "1. 내 신상정보 변수에 담아 출력하기\n"
					+ "2. 사원정보를 키보드로 입력받아 출력하기\n"
					+ "3. 기본 자료형 변수의 초기값 확인하기\n"
					+ "4. 이전 메뉴로 돌아가기\n"
					+ "메뉴 선택 : ");
		 no = sc.nextInt();
		 
		 switch (no) {
		case 1:vs.myProfile();break;
		case 2:vs.emplnformation();break;
		case 3:vs.defaultValue();break;
		case 4:System.out.println("메인 메뉴로 돌아갑니다."); break;
		default:
			System.out.println("잘못된 값을 입력하셨습니다.");
			subVarMenu();
			return;
		}
		}while(no!=4);
		return;
	 }
	 public static void subPTypeMenu(){
		 int no;
		 PrimitiveTypeSample pts = new PrimitiveTypeSample();
		 do{
		 System.out.print("*** 기본자료형 테스트 부메뉴 ***\n\n"
					+ "1. 기본자료형 메모리 할당크기 확인하기\n"
					+ "2. 기본자료형 값의 최소값, 최대값 출력하기\n"
					+ "3. 기본자료형 비트갯수 확인하기\n"
					+ "4. 이전 메뉴로 돌아가기\n"
					+ "메뉴 선택 : ");
		 no = sc.nextInt();
		 
		 switch (no) {
		case 1:pts.typeSize();break;
		case 2:pts.minMaxValue();	break;	
		case 3:pts.bitSize();	break;		
		case 4:System.out.println("메인 메뉴로 돌아갑니다."); break;
		default:
			System.out.println("잘못된 값을 입력하셨습니다.");
			subVarMenu();
			return;
		}
		}while(no!=4);
		return;
	 }
	 public static void subIfMenu(){
		 int no;
		 IfSample is = new IfSample();
		 do{
		 System.out.print("*** if문 테스트 부메뉴 ***\n\n"
					+ "1. 두 개의 정수를 입력받아, 두 수 중 큰 값 출력하기\n"
					+ "2. 두 개의 정수를 입력받아, 두 주 중 작은 값 출력하기\n"
					+ "3. 세 개의 정수를 입력받아, 세 수중 가장 큰 수와 가장 작은 수 출력하기\n"
					+ "4. 한 개의 정수를 입력받아, 짝수인지 홀수인지 출력하기\n"
					+ "5. 국, 영, 수 세 과목의 점수를 입력받아, 합격/불합격 확인하기\n"
					+ "6. 점수를 입력받아 학점 확인하기\n"
					+ "7. 한 개의 정수를 입력받아, 양수인지 0인지 음수인지 확인하기\n"
					+ "8. 문자 하나를 입력받아, 영어 대문자인지 소문자인지 숫자문자인지 기타문자인지 확인하기\n"
					+ "9. 이전 메뉴로 돌아가기\n"
					+ "메뉴 선택 : ");
		 no = sc.nextInt();
		 
		 switch(no)
			{
			case 1:	is.maxNumber(); break;
			case 2:	is.minNumber(); break;
			case 3:	is.threeMaxMin(); break;
			case 4:	is.checkEven(); break;
			case 5:	is.isPassFail(); break;
			case 6:	is.scoreGrade(); break;
			case 7:	is.checkPlusMinusZero(); break;
			case 8:	is.whatCaracter(); break;
			case 9:	System.out.println("메인 메뉴로 돌아갑니다."); break;
			default:
				System.out.println("잘못된 값을 입력하셨습니다.");
				subIfMenu();
				return;
			}
		 }while(no!=9);
		 return;
	 }
	 public static void subSwitchMenu(){
		 int no;
		 SwitchSample ss = new SwitchSample();
		 do{
		 System.out.print("*** switch문 테스트 부메뉴 ***\n\n"
					+ "1. 두 개의 정수와 한 개의 연산문자를 입력받아 계산한결과 확인하기\n"
					+ "2. 과일 이름을 문자열로 입력받아, 그과일의 가격 출력하기\n"
					+ "3. 이전 메뉴로 돌아가기\n"
					+ "메뉴 선택 : ");
		 no = sc.nextInt();
		 
		 switch(no)
			{
			case 1:	ss.calculator(); break;
			case 2:	ss.fruitPrice(); break;
			case 3:	System.out.println("메인 메뉴로 돌아갑니다."); break;
			default:
				System.out.println("잘못된 값을 입력하셨습니다.");
				subSwitchMenu();
				return;
			}
		 }while(no!=3);
		 return;
	 }
	 public static void subForMenu(){
		 int no;
		 ForSample fs = new ForSample();
		 do{
		 System.out.print("*** for문 테스트 부메뉴 ***\n\n"
					+ "1. 1~10까지 정수들의 합계 구하기\n"
					+ "2. 1~100사이의 짝수들의 합게 구하기\n"
					+ "3. 정수 하나 입력받아, 그 수의 구구단 출력하기\n"
					+ "4. 두 개의 정수를 입력받아, 두 수중 작은 값에서 큰 값까지의 합계 구하기\n"
					+ "5. 줄수와 칸수 입력받아, 입력된 줄수/칸수만큼 별표문자 출력하기\n"
					+ "6. 7줄에 7칸에 별표문자 출력하되, 각 줄에 줄번호와 같은 칸에 숫자\n"
					+ "7. 줄수를 입력받아, 삼각형 모양으로 별표문자 출력하기\n"
					+ "8. 구구단 2단부터 9단까지 출력하기\n"
					+ "9. 이전 메뉴로 돌아가기\n"
					+ "메뉴 선택 : ");
		 no = sc.nextInt();
		 
		 switch(no)
			{
			case 1:	fs.sum1To10(); break;
			case 2:	fs.sumEven1To100(); break;
			case 3:	fs.oneGugudan(); break;
			case 4:	fs.sumMinToMax(); break;
			case 5:	fs.printStar(); break;
			case 6:	fs.printNumberStar(); break;
			case 7:	fs.printTriangleStar(); break;
			case 8:	fs.guguDan(); break;
			case 9:	System.out.println("메인 메뉴로 돌아갑니다."); break;
			default:
				System.out.println("잘못된 값을 입력하셨습니다.");
				subForMenu();
				return;
			}
		 }while(no!=9);
		 return;
		 
	 }
	 public static void subWhileMenu(){
		 int no;
		 WhileSample ws = new WhileSample();
		 do{
		 System.out.print("*** while문 테스트 부메뉴 ***\n\n"
					+ "1. 문자 하나 입력받아, 그 문자의 유니코드 출력 반복\n"
					+ "2. 1~100까지 정수들의 합계 출력하기\n"
					+ "3. 1~100사이의 임의의 정수를 발생시켜, 숫자 알아맞추기\n"
					+ "4. 문자열을 입력받아, 글자 갯수 알아내어 출력하기\n"
					+ "5. 문자열값과 문자 하나를 입력받아, 문자열에 문자가 몇 개 있는지 확인하기\n"
					+ "6. 이전 메뉴로 가기\n"
					+ "메뉴 선택 : ");
		 no = sc.nextInt();
		 
		 switch(no)
			{
			case 1:	ws.printUniCode(); break;
			case 2:	ws.sum1To100(); break;
			case 3:	ws.numberGame(); break;
			case 4:	ws.countCharacter(); break;
			case 5:	ws.countInChar(); break;
			case 6:	System.out.println("메인 메뉴로 돌아갑니다."); break;
			default:
				System.out.println("잘못된 값을 입력하셨습니다.");
				subWhileMenu();
				return;
			}
		 }while(no!=6);
		 return;
	 }
	 
	 public static void subDoWhileMenu(){
		 int no;
		 DoWhileSample dws = new DoWhileSample();
		 do{
		 System.out.print("*** do~while문 테스트 부메뉴 ***\n\n"
					+ "1. 문자열값 입력받아, 문자 사이에 '-' 끼워넣어 출력하기\n"
					+ "2. 버거킹 메뉴 주문 테스트\n"
					+ "3. 문자열 입력받아, \"모든 글자 영문자다\"/\"영문자 아니다.\" 출력하기\n"
					+ "4. 이전 메뉴로 가기\n"
					+ "메뉴 선택 : ");
		 no = sc.nextInt();
		 
		 switch(no)
			{
			case 1:	dws.addDashToken(); break;
			case 2:	dws.burgerKingMenu(); break;
			case 3:	dws.isStringAlphabet(); break;
			case 4:	System.out.println("메인 메뉴로 돌아갑니다."); break;
			default:
				System.out.println("잘못된 값을 입력하셨습니다.");
				subDoWhileMenu();
				return;
			}
		 }while(no!=4);
		 return;
	 }
	 public static void subBreakMenu(){
		 int no;
		 BreakSample bs = new BreakSample();
		 do{
		 System.out.print("*** break문 테스트 부메뉴 ***\n\n"
					+ "1. 1~100까지 정수들의 합계 출력하기\n"
					+ "2. 구구단 1단~9단까지 출력하되, * 5 계산에서 반복문 빠지기\n"
					+ "3. 이전 메뉴로 가기\n"
					+ "메뉴 선택 : ");
		 no = sc.nextInt();
		 
		 switch(no)
			{
			case 1:	bs.sumBreak(); break;
			case 2:	bs.guguDanBreak(); break;
			case 3:	System.out.println("메인 메뉴로 돌아갑니다."); break;
			default:
				System.out.println("잘못된 값을 입력하셨습니다.");
				subBreakMenu();
				return;
			}
		 }while(no!=3);
		 return;		 
	 }
	 public static void subContinueMenu(){
		 int no;
		 ContinueSample cs = new ContinueSample();
		 do{
		 System.out.print("*** continue문 테스트 부메뉴 ***\n\n"
					+ "1. 1~100까지의 정수 중 3의 배수를 뺀 정수들의 합계 출력하기\n"
					+ "2. 3행 5열의 행열값 출력하되, 1행 3열부터 1행 5열까지 생략하고 출력하기\n"
					+ "3. 이전 메뉴로 가기\n"
					+ "메뉴 선택 : ");
		 no = sc.nextInt();
		 
		 switch(no)
			{
			case 1:	cs.sumJumpThree(); break;
			case 2:	cs.rowColJump(); break;
			case 3:	System.out.println("메인 메뉴로 돌아갑니다."); break;
			default:
				System.out.println("잘못된 값을 입력하셨습니다.");
				subContinueMenu();
				return;
			}
		 }while(no!=3);
		 return;		
	 }
	 public static void subStaticMethodMenu(){
		 int no;
		 StaticMethodSample sms = new StaticMethodSample();
		 do{
		 System.out.print("*** static 메소드 사용 테스트 부메뉴 ***\n\n"
					+ "1. Math 클래스의 랜덤값 구하는 메소드\n"
					+ "2. Math 클래스의 실수값에 대한 절대값 구하는 메소드\n"
					+ "3. Math 클래스의 두 정수중 큰값 구하는 메소드\n"
					+ "4. 이전 메뉴로 가기\n"
					+ "메뉴 선택 : ");
		 no = sc.nextInt();
		 
		 switch(no)
			{
			case 1:	sms.testMathRandom(); break;
			case 2:	sms.testMathAbs(); break;
			case 3:	sms.testMathMax(); break;
			case 4:	System.out.println("메인 메뉴로 돌아갑니다."); break;
			default:
				System.out.println("잘못된 값을 입력하셨습니다.");
				subStaticMethodMenu();
				return;
			}
		 }while(no!=4);
		 return;	
	 }
	 public static void subNonStaticMethodMenu(){
		 int no;
		 NonStaticMethodSample nsms = new NonStaticMethodSample();
		 do{
		 System.out.print("*** non-static 메소드 사용 테스트 부메뉴 ***\n\n"
					+ "1. Scanner 클래스 사용 : 자료형 종류별로 값 입력받아 출력하기\n"
					+ "2. Date 클래스 사용 : 오늘 날짜, 현재 시간 정보 출력하기\n"
					+ "3. Random 클래스 사용 : 정수와 실수에 대한 난수 출력하기\n"
					+ "4. 이전 메뉴로 가기\n"
					+ "메뉴 선택 : ");
		 no = sc.nextInt();
		 
		 switch(no)
			{
			case 1:	nsms.testScanner(); break;
			case 2:	nsms.testDate(); break;
			case 3:	nsms.testRandom(); break;
			case 4:	System.out.println("메인 메뉴로 돌아갑니다."); break;
			default:
				System.out.println("잘못된 값을 입력하셨습니다.");
				subNonStaticMethodMenu();
				return;
			}
		 }while(no!=4);
		 return;	
	 }
	
}
