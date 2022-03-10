package homework01;

import java.util.Scanner;

public class Homework11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("정수 4개 입력");
		int a=0, b=0, c=0, d=0;
		
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		d = scanner.nextInt();
		
		int max = a;
		
		max = max > b ? max : b;
		max = max > c ? max : c;
		max = max > d ? max : d;
		
		System.out.println("가장 큰수 :" + max);
	}
}
