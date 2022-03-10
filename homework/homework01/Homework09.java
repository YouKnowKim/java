package homework01;

import java.util.Scanner;

public class Homework09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("보유하고 있는 책 권수 : ");
		int count = scanner.nextInt();
		
		if(count <0) {
			System.out.println("잘못 입력했습니다.");
		} else if(count == 0) {
			System.out.println("보유하고 있는 책 없음");
		} else if(count == 1) {
			System.out.println("1 book");
		} else {
			System.out.printf("%d books", count);
		}
	}
}
