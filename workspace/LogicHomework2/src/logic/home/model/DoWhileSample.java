package logic.home.model;

import java.util.Scanner;

public class DoWhileSample {
	private Scanner sc = new Scanner(System.in);
	public void addDashToken(){
		String instr;
		int index=0;
		
		System.out.println("문자 사이에 '-' 입력해주는 메소드");
		System.out.print("문자열 입력 : ");
		instr = sc.next();
		do{
			if(index==0)
				System.out.print(instr.charAt(index));
			else
			System.out.print("-"+instr.charAt(index));
			index++;
		}while(index<instr.length());
		System.out.println();
	}
	public void burgerKingMenu(){
		int input,order,tempOrder,tempPrise,totalPrise=0;
		char addOrder = 0;
		String tempMenu = null;
													//메뉴 이름 , 메뉴 가격 , 사용자의 주문갯수
		String menu[][] = new String[][]{	{"불고기버거","3500","0"},
													{"치킨버거","3200","0"},
													{"감자튀김","1000","0"},
													{"치즈스틱","400","0"},
													{"샐러드","2000","0"},
													{"콜라","700","0"},
													{"에이드","1200","0"},
													{"커피","1000","0"},};
		do{
		System.out.print("*** 메뉴를 선택하세요 ***\n"
				+ "****햄버거 **************\n"
				+ "1. 불고기버거\t3500원\n"
				+ "2. 치킨버거\t\t3200원\n"
				+ "****추가 ****************\n"
				+ "3. 감자튀김\t\t1000원\n"
				+ "4. 치즈스틱\t\t400원\n"
				+ "5. 샐러드\t\t2000원\n"
				+ "****음료수 **************\n"
				+ "6. 콜라\t\t700원\n"
				+ "7. 에이드\t\t1200원\n"
				+ "8. 커피\t\t1000원\n"
				+ "*************************\n");
		System.out.print("메뉴 선택 : ");
		input = sc.nextInt();
		
		if(0<input && input<9){
			tempMenu = menu[input-1][0];		
		}
		else{
			System.out.println("잘못입력하셨습니다.");
			continue;
		}
		
		System.out.println(tempMenu +"를 선택하셨습니다.");
		System.out.print("수량은? ");
		order = sc.nextInt();
		System.out.println(order +"개 주문하셨습니다.");
		
		tempOrder = Integer.parseInt(menu[input-1][2]);//선택한 메뉴의 기존 주문량을 정수로 가져옴
		tempOrder += order;//추가하고
		menu[input-1][2] = Integer.toString(tempOrder);//다시 문자열배열에 저장
		
		System.out.print("추가 주문 하시겠습니까? (y/n) : ");
		addOrder = sc.next().toLowerCase().charAt(0);
		}while(addOrder=='y');
		
		//주문 결과 페이지
		int i = 0;
		
		System.out.println("          * 주문하신 정보는 다음과 같습니다. *         ");
		System.out.println("------------------------------------------------");
		do{
			tempPrise = Integer.parseInt(menu[i][1]);//문자열을 정수로 가져옴
			tempOrder = Integer.parseInt(menu[i][2]);
			if(tempOrder>0){
			System.out.println(menu[i][0]+" : "+tempOrder+"개 - "+(tempOrder*tempPrise)+"원");
			totalPrise += tempPrise*tempOrder;
			}
			i++;
		}while(i<menu.length);
		System.out.println("------------------------------------------------");
		System.out.println("                                 총 가격 : "+totalPrise+"원");
	}
	
	public void isStringAlphabet(){
		String instr;
		char ck;//문자 하나하나를 비교할 변수
		int checkCount = 0;
		
		System.out.print("문자열 입력 : ");
		instr = sc.nextLine();
		
		//영문자 이외의 문자갯수를 구하는 부분
		int i =0;
		do{
			ck = instr.charAt(i);
			i++;
			if(!(('A'<=ck && ck <='Z')||('a'<=ck && ck <='z')||(ck == ' '))){//영문자가 아니면
				checkCount++;
			}
		}while(i<instr.length());
		/* 심화 : 영문자가 아닌경우 출력하고 갯수보이기
		//구한 수로 배열 선언
		char notAlphabet[]=new char[checkCount];
		//변수 초기화
		i =0;
		checkCount=0;
		//새로 만들어진 배열안에 영문자가 아닌 문자를 저장
		do{
			ck = instr.charAt(i);
			i++;
			if(!(('A'<=ck && ck <='Z')||('a'<=ck && ck <='z')||(ck == ' '))){//영문자가 아니면
				notAlphabet[checkCount]=ck;
				checkCount++;
			}			
		}while(i<instr.length());
		*/
		
		if(checkCount>0){
			/*
			System.out.print("영문자가 아닌 문자가 "+checkCount+"개 있습니다. (");
			for(i=0;i<checkCount;i++){
				System.out.print(notAlphabet[i]);
			}
			System.out.println(")");
			*/
			System.out.println("영문자가 아닙니다");
		}else{
			System.out.println("모든 글자가 영문자입니다.");
		}
	}
}
