package homework08;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalendarMain {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		System.out.println();
		
		System.out.println(c.getActualMaximum(Calendar.DAY_OF_WEEK));
		MyCalendar.process();
		
	}
}
