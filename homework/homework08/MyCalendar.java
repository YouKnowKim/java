package homework08;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar {

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
	
	public static void process() {
		int choice;
		int year;
		int month;
		boolean check = true;
		Scanner scanner = new Scanner(System.in);
		
		while(check) {
			System.out.print("1. 년도\t 2. 월\t3.종료");
			choice = Integer.parseInt(scanner.nextLine());
			
			if(choice == 1) {
				System.out.print("해당 년도를 입력하세요 : ");
				year = Integer.parseInt(scanner.nextLine());
				MyCalendar.createCalendar(year);
				
			} else if(choice == 2) {
				System.out.print("해당 년도를 입력하세요 : ");
				year = Integer.parseInt(scanner.nextLine());
				System.out.print("해당 월을 입력하세요 : ");
				month = Integer.parseInt(scanner.nextLine());
				MyCalendar.createCalendar(year, month);
				
			} else if(choice == 3) {
				System.out.println("종료합니다.");
				check = false;
				
			} else {
				System.out.println("오류");
				check = false;
			}
		}
	}
}
