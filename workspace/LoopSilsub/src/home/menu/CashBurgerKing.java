package home.menu;

import java.util.Scanner;

public class CashBurgerKing {
	private Scanner sc = new Scanner(System.in);
	public void selectMenu(){
		int input,order,totalPrise=0;
		char addorder;
		String tempmenu = null;
		
		//메뉴 선언 및 초기화
		String bulgogi = "불고기버거",
				chicken = "치킨버거",
				potato = "감자튀김",
				cheese = "치즈스틱",
				salad = "샐러드",
				cola = "콜라",
				ade = "에이드",
				coffee = "커피";
		//각 메뉴에 따른 가격 선언 및 초기화
		int bulgogiPrise = 3500,
			chickenPrise = 3200,
			potatoPrise = 1000,
			cheesePrise = 400,
			saladPrise = 2000,
			colaPrise = 700,
			adePrise = 1200,
			coffeePrise = 1000;
		//사용자의 입력을 받을 각 메뉴의 주문수량 변수 선언 및 초기화
		int bulgogiOrder = 0,
			chickenOrder = 0,
			potatoOrder = 0,
			cheeseOrder = 0,
			saladOrder = 0,
			colaOrder = 0,
			adeOrder = 0,
			coffeeOrder = 0;
		
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
		
		switch (input) {//사용자가 선택한 메뉴
		case 1:	tempmenu = bulgogi;		break;
		case 2:	tempmenu = chicken;		break;
		case 3:	tempmenu = potato;		break;
		case 4:	tempmenu = cheese;		break;
		case 5:	tempmenu = salad;		break;
		case 6:	tempmenu = cola;			break;
		case 7:	tempmenu = ade;			break;
		case 8:	tempmenu = coffee;		break;
		default:
			System.out.println("[메뉴선택오류]다시 입력해주세요.");
			return;
		}
		
		System.out.println(tempmenu +"를 선택하셨습니다.");
		System.out.print("수량은? ");
		order = sc.nextInt();
		
		switch (input) {//사용자가 입력한 메뉴의 수량을 누적시킴
		case 1:	bulgogiOrder += order;	break;
		case 2:	chickenOrder += order;	break;
		case 3:	potatoOrder += order; 	break;
		case 4:	cheeseOrder += order; 	break;
		case 5:	saladOrder += order; 		break;
		case 6:	colaOrder += order; 		break;
		case 7:	adeOrder += order; 		break;
		case 8:	coffeeOrder += order; 	break;
		}		
		
		System.out.print("추가 주문 하시겠습니까? (y/n) : ");
		addorder = sc.next().toLowerCase().charAt(0);
		}while(addorder=='y');
		
		//주문 결과 페이지
		System.out.println("          * 주문하신 정보는 다음과 같습니다. *         ");
		System.out.println("------------------------------------------------");
		if(bulgogiOrder>0){
			System.out.println(bulgogi+" : "+bulgogiOrder+"개 - "+(bulgogiOrder*bulgogiPrise)+"원");
			totalPrise += bulgogiOrder*bulgogiPrise;
		}
		if(chickenOrder>0){
			System.out.println(chicken+" : "+chickenOrder+"개 - "+(chickenOrder*chickenPrise)+"원");
			totalPrise += chickenOrder*chickenPrise;
		}
		if(potatoOrder>0){
			System.out.println(potato+" : "+potatoOrder+"개 - "+(potatoOrder*potatoPrise)+"원");
			totalPrise += potatoOrder*potatoPrise;
		}
		if(cheeseOrder>0){
			System.out.println(cheese+" : "+cheeseOrder+"개 - "+(cheeseOrder*cheesePrise)+"원");
			totalPrise += cheeseOrder*cheesePrise;
		}
		if(saladOrder>0){
			System.out.println(salad+" : "+saladOrder+"개 - "+(saladOrder*saladPrise)+"원");
			totalPrise += saladOrder*saladPrise;
		}
		if(colaOrder>0){
			System.out.println(cola+" : "+colaOrder+"개 - "+(colaOrder*colaPrise)+"원");
			totalPrise += colaOrder*colaPrise;
		}
		if(adeOrder>0){
			System.out.println(ade+" : "+adeOrder+"개 - "+(adeOrder*adePrise)+"원");
			totalPrise += adeOrder*adePrise;
		}
		if(coffeeOrder>0){
			System.out.println(coffee+" : "+coffeeOrder+"개 - "+(coffeeOrder*coffeePrise)+"원");
			totalPrise += coffeeOrder*coffeePrise;
		}
		System.out.println("------------------------------------------------");
		System.out.println("                                 총 가격 : "+totalPrise+"원");
	}
}
