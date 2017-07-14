package test.calendar;

import java.util.Calendar;

public class DateCalculator {
	private long sumDays = 0L;
	private Calendar today = Calendar.getInstance();
	
	public long getDays(){
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH) + 1;
		//기준 연도부터 직전 연도까지 날짜를 더함
		for(int i=1;i<year;i++){//1~2016
			if(isLeapYear(i)){//윤년일때
				sumDays+=366;
			//	System.out.println(i+", +366");
			}else{//윤년이 아닐때
				sumDays+=365;
			//	System.out.println(i+", +365");
			}
		//	System.out.println(sumDays);
		}
		//System.out.println(sumDays);
		//올해 당월의 직전달까지 날짜 수 더함
		for(int j=1;j<month;j++){
			if(j==2){
				if(isLeapYear(year)){//올해가 윤년이라면
				sumDays+=29;
				}else{//올해가 윤년이 아니라면
				sumDays+=28;	
				}
			}
			else if(j==4 || j==6 || j==9 || j==11){sumDays+=30;}
			else{sumDays+=31;}
	
		}	
		int date = today.get(Calendar.DATE); //오늘의 일수
		sumDays+=date;
		//System.out.println(year+", "+month+", "+date);
		
		return sumDays;
	}
	
	public boolean isLeapYear(int year){
		if(year%4==0 && year %100!=0 || year % 400 ==0){
			return true;
		}
		return false;
	}
}
