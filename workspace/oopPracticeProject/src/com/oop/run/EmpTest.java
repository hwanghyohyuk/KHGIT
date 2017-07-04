package com.oop.run;

import java.util.Scanner;

import com.oop.model.dto.Employee;

public class EmpTest {
	Scanner sc = new Scanner(System.in);
	public void mainMenu() {
		Employee e =null;
		int menu;
		do{
			System.out.print("******* 사원 정보 관리 프로그램 ************\n"
					+ "1. 새 사원 정보 입력\n"
					+ "2. 사원 정보 수정\n"
					+ "3. 사원 정보 삭제\n"
					+ "4. 사원정보 출력\n"
					+ "5. 보너스 포인트가 적용된 연봉 출력\n"
					+ "9. 끝내기\n"
					+ "메뉴 번호 입력 : ");
			menu = sc.nextInt();
			switch (menu) {
			case 1:	e = new Employee();
						e.empInput();	break;
			case 2:	if(e==null){
				System.out.println("입력된 사원정보가 없습니다.");
			}else{
				new EmpTest().modifyMenu(e);
			}	break;
			case 3:	if(e==null){
				System.out.println("입력된 사원정보가 없어서 지울 수 없습니다.");
			}else{
				e = null;
			}	break;
			case 4:	if(e==null){
				System.out.println("입력된 사원정보가 없어 출력할 수 없습니다.");
			}else{
				e.empOutput();
			}	break;
			case 5:	if(e==null){
				System.out.println("입력된 사원정보가 없어 출력할 수 없습니다.");
			}else{
				System.out.println("보너스 포인트 연봉 : "+e.payCalculator());
			}	break;
			case 9:	System.out.println("프로그램을 종료합니다.");	return;
			default:
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}while(menu!=9);
		
	}
	
	public void modifyMenu(Employee e) {
		int menu;
		do{
		System.out.print("**** 사원 정보 수정 메뉴 *****\n"
				+ "1. 이름 변경\n"
				+ "2. 급여 변경\n"
				+ "3. 부서 변경\n"
				+ "4. 직급 변경\n"
				+ "5. 이전 메뉴로 이동\n"
				+ "메뉴 번호 입력 : ");
		menu = sc.nextInt();
		
		switch (menu) {
		case 1:	System.out.print("변경할 이름 : "); 
					e.setEmpName(sc.next());
					break;
		case 2:	System.out.print("변경할 급여 : "); 
					e.setSalary(sc.nextInt());
					break;
		case 3:	System.out.print("변경할 부서 : "); 
					e.setDept(sc.next());
					break;
		case 4:	System.out.print("변경할 부서 : "); 
					e.setJob(sc.next());
					break;
		case 5:		return;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
		
		}while(menu!=5);
		
	}

}
