package homework02;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("2 - 9 단을 입력 : ");
		int dan = scanner.nextInt();
		
		System.out.printf("*** %d단 ***\n", dan);
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d \n", dan, i, dan * i);
		}
	}
}
