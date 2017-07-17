package com.week4;

import java.util.Calendar;

public class TestWork1 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1;
		int date = today.get(Calendar.DATE);
		int hour = today.get(Calendar.HOUR);
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		int dow = today.get(Calendar.DAY_OF_WEEK);
		String dowString=null;
		switch (dow) {
		case 1:	dowString="일";		break;
		case 2:	dowString="월";		break;
		case 3:	dowString="화";		break;
		case 4:	dowString="수";		break;
		case 5:	dowString="목";		break;
		case 6:	dowString="금";		break;
		case 7:	dowString="토";		break;
		}
		System.out.println(year+"년 "+month+"월 "+date+"일 "+dowString+"요일");
	}

}
