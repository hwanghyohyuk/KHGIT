package month;

public class MonthsTest {

	public static void main(String[] args) {
		int months =Integer.parseInt(args[0]);
		if (months>0&&months<=12) {
			System.out.println("입력받은 월 : "+months+"월");
			System.out.println("마지막일자 : "+new Months().getDays(months)+"일");			
		}else{
			System.out.println("입력한 값이 잘못되었습니다.");
		}
	}
}
