package homework01;

import java.util.Scanner;

public class Homework10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int a = scanner.nextInt();
		
		System.out.print("두번째 정수 : ");
		int b = scanner.nextInt();

		System.out.print("세번째 정수 : ");
		int c = scanner.nextInt();
		
		int first = a;
		int second=0, third=0;
		
		first = first > b ? first : b;
		first = first > c ? first : c;
		
		if((first-a) == 0) {
			if(b >= c) {
				second = b;
				third = c;
			} else {
				second = c;
				third = b;
			}
		} else if((first-b) == 0) {
			if(a >= c) {
				second = a;
				third = c;
			} else {
				second = c;
				third = a;
			}
		} else if((first-c) == 0) {
			if(a >= b) {
				second = a;
				third = b;
			} else {
				second = b;
				third = a;
			}
		}
		
		System.out.printf("%d %d %d",first, second, third);
		
		
	}
}
