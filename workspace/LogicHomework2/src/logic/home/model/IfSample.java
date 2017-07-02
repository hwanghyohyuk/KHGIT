package logic.home.model;

import java.util.Scanner;

public class IfSample {
	private Scanner sc = new Scanner(System.in);
	public void maxNumber() {
		// TODO Auto-generated method stub
		int num1,num2;
		System.out.println("입력 받은 두 수 중에서 더 큰 수가 무엇인지 찾아냅니다.");
		System.out.print("첫 번째 정수 입력 : ");
		num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		num2 = sc.nextInt();
	
		System.out.println("더 큰 수는 "+(num1>num2?num1:num2)+"입니다.");	
	}
	public void minNumber() {
		// TODO Auto-generated method stub
		int num1,num2;
		System.out.println("입력 받은 두 수 중에서 더 작은 수가 무엇인지 찾아냅니다.");
		System.out.print("첫 번째 정수 입력 : ");
		num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		num2 = sc.nextInt();
	
		System.out.println("더 작은 수는 "+(num1<num2?num1:num2)+"입니다.");	
	}
	public void threeMaxMin() {
		// TODO Auto-generated method stub
		int num1,num2,num3,min=0,max=0;
		System.out.println("입력 받은 두 수 중에서 더 작은 수가 무엇인지 찾아냅니다.");
		System.out.print("첫 번째 정수 입력 : ");
		num1 = sc.nextInt();
		System.out.print("두 번째 정수 입력 : ");
		num2 = sc.nextInt();
		System.out.print("세 번째 정수 입력 : ");
		num3 = sc.nextInt();
		
		min = num1;
		if(min>num2){min = num2;
			if(min>num3){min = num3;}
		}
		max = num1;
		if(max<num2){max = num2;
			if(max<num3){max = num3;}
		}
		
		System.out.println("가장 큰 수는 "+max+"이고, 가장 작은 수는 "+min+"입니다.");	
	}
	public void checkEven() {
		// TODO Auto-generated method stub
		int num1;
		
		System.out.print("정수 하나 입력 : ");
		num1 = sc.nextInt();
		
		System.out.println((num1%2==0)?"짝수":"홀수");
	}
	public void isPassFail() {
		// TODO Auto-generated method stub
		int kor,eng,mat,tot;
		double ave;
		
		//2.변수에 값 대입부
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		mat = sc.nextInt();
		
		//3. 변수에 저장된 값 계산부 (제어문 사용가능)
		tot = kor+eng+mat;
		ave = tot / 3.0;
		
		//4. 계산의 결과값에 대한 처리부
		System.out.println((kor>=40 && eng >=40 && mat >=40 && ave>=60.0)?"합격":"불합격");
	}
	public void scoreGrade() {
		// TODO Auto-generated method stub
		int score,temp;
		char grade;
		System.out.println("100점 이하, 90점 이상 A\n"
				+ "90점 미만, 80점 이상 B\n"
				+ "80점 미만, 70점 이상 C\n"
				+ "70점 미만, 60점 이상 D\n"
				+ "60점 미만 F\n");
		
		System.out.print("점수를 입력하세요 : ");
		score = sc.nextInt();
		temp = score/10;
		
		switch (temp) {
		case 10:
		case 9:grade = 'A';	break;
		case 8:grade = 'B';	break;
		case 7:grade = 'C';	break;
		case 6:grade = 'D';	break;
		default:grade = 'F';	break;
		}
		System.out.println("이 입력한 점수는 "+score+"으로 "+grade+"학점입니다.");
	}
	public void checkPlusMinusZero() {
		// TODO Auto-generated method stub
		int num1;
		String result;
		
		System.out.print("정수 하나 입력 : ");
		num1 = sc.nextInt();
		
		if(num1>0){
			result = "양수";
		}else if(num1 == 0){
			result = "0";			
		}else{
			result = "음수";			
		}
		System.out.println("입력하신 정수는 "+result+"입니다.");
	}
	public void whatCaracter() {
		// TODO Auto-generated method stub
		char ch;
		
		System.out.print("문자 하나 입력 : ");
		ch = sc.next().charAt(0);
		System.out.println((int)ch);
		
		if('a'<=ch && ch<='z'){//소문자일떄
			System.out.println("입력하신 문자는 소문자입니다.");
		}else if ('A'<=ch && ch<='Z'){
			System.out.println("입력하신 문자는 대문자입니다.");
		}else if('0'<=ch && ch <='9'){
			System.out.println("입력하신 문자는 숫자문자입니다.");
		}else if('ㄱ'<=ch && ch <='l') {
			System.out.println("입력하신 문자는 한글문자입니다");			
		}else {
			System.out.println("입력하신 문자는 기타문자입니다.");
		}
	}

}
