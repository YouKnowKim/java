package kr.ac.kopo.day10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		
		String pattern = "yyyy-MM-dd HH:mm:ss(E)";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(new Date()));
		
		Calendar c = Calendar.getInstance();
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int date = c.get(Calendar.DAY_OF_MONTH);
		int day = c.get(Calendar.DAY_OF_WEEK); // 1(일) ~ 7(토)
		String[] week = {"","일","월","화","수","목","금","토"};
		
		System.out.println("오늘은 " + year + "년" + month + "월" + date + "일(" + week[day] + ")입니다.");
		
		// 2020년 5월 20일 요일
		c.set(2020, 5-1, 20);
		day = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("2020년 5월 20일 " + week[day] + "요일");
		
		int lastday = c.getActualMaximum(Calendar.DAY_OF_WEEK);
		System.out.println(lastday);
		
		Date d = c.getTime();
		System.out.println(d);
		
//		Date d = new Date();
//		System.out.println(d.toString());
//	
//		
//		int year = d.getYear()+1900;
//		int month = d.getMonth()+1;
//		int date = d.getDate();
//		int day = d.getDay(); 
//		
//		String[] week = {"일,","월","화","수","목","금","토"};
//		System.out.println(" 오늘은" + year + " 년" + month + "월" + date + "일(" + week[day] + ")입니다");
		
	}
}
