package test.date;


import java.util.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
public class TestDate2 {

	public static void main(String[] args) {
		// Data 처리방법
		//키보드 입력으로 입사일 날짜정보를 입력받음
		Scanner sc = new Scanner(System.in);
		GregorianCalendar hireDate = new GregorianCalendar();
		
		System.out.print("입사일 날짜를 입력하세요(yyyy-mm-dd) : ");
		String str = sc.next();
		String[] date = str.split("-");
		int[] hire = new int[3];
		for(int i=0;i<date.length;i++)
		hire[i] = Integer.parseInt(date[i]);

		hireDate.set(hire[0],hire[1]-1,hire[2]);
		
		java.util.Date hDate = hireDate.getTime();		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String fmtDate = sdf.format(hDate);
		Date sdate = Date.valueOf(fmtDate);
		
		System.out.println(sdate);
		
	}

}
