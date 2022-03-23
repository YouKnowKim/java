package homework08;

import java.util.Calendar;

public class MyCalendar {

	private static int year;
	private static int month;
	private static Calendar calendar = Calendar.getInstance();
	

	public static void print(int year, int month) {
		
	}
	
	public static void print(int year) {
		
	}
	
	public static void myMonth(int year, int month) {
		System.out.printf("<%d년 %d월>",year, month);
		System.out.println("일  월  화  수  목  금  토");
		
	}
}
