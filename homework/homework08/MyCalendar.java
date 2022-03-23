package homework08;

import java.util.Calendar;

public class MyCalendar {

	private static int year;
	private static int month;
	private static Calendar calendar = Calendar.getInstance();
	

	public static void createCalendar(int year) {
		for(int i=1; i<=12; i++) {
			MyCalendar.createCalendar(year, i);
		}
	}
	
	public static void createCalendar(int year, int month) {
		MyCalendar.calendar.set(Calendar.YEAR, year);
		MyCalendar.calendar.set(Calendar.MONTH, month-1);
		MyCalendar.calendar.set(Calendar.DATE, 1);
		
		int maxDay = MyCalendar.calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		int firstDayOfWeek = MyCalendar.calendar.get(Calendar.DAY_OF_WEEK);
		
		System.out.printf("<%d년 %d월>\n",year, month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for(int i=1; i<firstDayOfWeek; i++) {
			System.out.print(" \t");
		}
		for(int i=1; i<=maxDay; i++) {
			System.out.printf("%d\t",i);
			
			if(firstDayOfWeek%7 == 0) {
				System.out.println();
			}
			firstDayOfWeek++;
		}
		System.out.println();
	}
}
