package homework01;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		
		final double PI = 3.141592;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("원의 반지름을 입력하세요 : ");
		int r = scanner.nextInt();
		
		System.out.printf("원의 면적은 %.4f 입니다.", PI * r * r);
	}
}
