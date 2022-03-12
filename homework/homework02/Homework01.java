package homework02;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1 - 100 사이의 정수 입력 : ");
		
		int num = scanner.nextInt();
		
		if(num >= 1 && num <= 100) {
			for(int i=1; i <= num; i++) {
				System.out.printf("%d ", i);
			}
		} else {
			System.out.println("ERROR");
		}
	}
}
