package test.date;

import java.util.*;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar calendar;
		calendar = Calendar.getInstance();
		
		System.out.println(calendar.toString());
		
		GregorianCalendar gregorianCalendar = new GregorianCalendar();

		System.out.println(gregorianCalendar);
		
		GregorianCalendar future = new GregorianCalendar(2020, 10-1,20);

		System.out.println(future);
		System.out.println(future.get(Calendar.YEAR)+"년");
		System.out.println(future.get(Calendar.MONTH)+1+"월");
		System.out.println(future.get(Calendar.DATE)+"일");
		
		int date = future.get(Calendar.DAY_OF_WEEK);
		String dateString=null;
		
		switch (date) {
		case 1: dateString="일"; break;
		case 2: dateString="월"; break;
		case 3: dateString="화"; break;
		case 4: dateString="수"; break;
		case 5: dateString="목"; break;
		case 6: dateString="금"; break;
		case 7: dateString="토"; break;
		}
		System.out.println(dateString+"요일");
		
	}

}
