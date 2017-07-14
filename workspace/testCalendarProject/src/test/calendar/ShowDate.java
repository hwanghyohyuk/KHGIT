package test.calendar;

public class ShowDate {
	public static void main(String[] args) {
		DateCalculator totalDay = new DateCalculator();
		System.out.println((totalDay.isLeapYear(2017))?"윤년":"평년");
		System.out.println("1년 1월 1일 부터 오늘까지의 총 일수는 : "+totalDay.getDays());
		
	}
}
