package homework08;

import java.util.Scanner;

public class MyCalendarMain {

	public static void main(String[] args) {

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
