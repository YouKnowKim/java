package homework02;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("시작단을 입력 : ");
		int startNumber = scanner.nextInt();

		System.out.print("종료단을 입력 : ");
		int endNumber = scanner.nextInt();

		if(startNumber >= endNumber) {
			int tem = startNumber;
			startNumber = endNumber;
			endNumber = tem;
		}

		for (int i = startNumber; i <= endNumber; i++) {
			System.out.printf("*** %d단 ***\n", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d \n", i, j, i * j);
			}
		}
	}
}
