package homework01;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int a = scanner.nextInt();
		
		System.out.print("나눌 수를 입력하세요 : ");
		int mod = scanner.nextInt();
		
		System.out.println("몫 : " + a/mod);
		System.out.println("나머지 : " + a%mod);
		
	}
}
