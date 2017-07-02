package logic.home.model;

import java.util.Scanner;

public class SwitchSample {
	private Scanner sc = new Scanner(System.in);
	public void calculator() {
		// TODO Auto-generated method stub
		int x,y,result=0;
		char op;
		System.out.print("첫번째 정수 : ");
		x = sc.nextInt();
		System.out.print("두번째 정수 : ");
		y = sc.nextInt();
		System.out.print("연산문자 : ");
		op = sc.next().toUpperCase().charAt(0);
		
		switch (op) {
		case '+':
			result = x+y;
			System.out.println(x+" "+op+" "+y+" = "+result);
			break;
		case '-':
			result = x-y;
			System.out.println(x+" "+op+" "+y+" = "+result);
			break;
		case 'X':
			result = x*y;
			System.out.println(x+" "+op+" "+y+" = "+result);
			break;
		case '/':
			if(y!=0){
				result = x/y;
				System.out.println(x+" "+op+" "+y+" = "+result);
			}else{
				result = 0;
				System.out.println("0으로 나눌 수 없습니다.");
			}
			break;		
		default:		
			System.out.println("연산문자를 잘못입력하셨습니다.");
			return;
		}
	}

	public void fruitPrice() {
		// TODO Auto-generated method stub
		/* 배열로 
		String fruit[][] = {	{"딸기","10000"},
								{"바나나","5000"},
								{"수박","15000"},
								{"사과","8000"},
								{"배","12000"},
								{"파인애플","20000"},
								{"망고","30000"},
								{"석류","20000"},
								{"포도","8000"},
								{"체리","15000"}};
		String input;
		
		System.out.print("과일 종류 : ");
		for(int i = 0 ; i < fruit.length ; i++){
			System.out.print(fruit[i][0]+", ");
		}
		System.out.println();
		
		System.out.print("과일 이름을 입력해주세요 : ");
		input = sc.next();
		for(int i = 0 ; i < fruit.length ; i++){
			if(fruit[i][0].equals(input))
			System.out.println(input+" 가격 : "+fruit[i][1]);
		}*/
		
		String input;
		
		System.out.println("과일 종류 : 딸기, 바나나, 수박, 사과, 배, 파인애플, 망고, 석류, 포도, 체리");
		System.out.print("과일 이름을 입력해주세요 : ");
		input = sc.next();
		switch (input) {
		case "딸기":	System.out.println("가격 : 10000");	break;
		case "바나나":	System.out.println("가격 : 5000");	break;
		case "수박":	System.out.println("가격 : 15000");	break;
		case "사과":	System.out.println("가격 : 8000");	break;
		case "배":		System.out.println("가격 : 12000");	break;
		case "파인애플":		System.out.println("가격 : 20000");	break;
		case "망고":	System.out.println("가격 : 30000");	break;
		case "석류":	System.out.println("가격 : 20000");	break;
		case "포도":	System.out.println("가격 : 8000");	break;
		case "체리":	System.out.println("가격 : 15000");	break;
		default:System.out.println("해당 과일은 없습니다.");	break;
		}
	}

}
