package homework03;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int count = 0;
		int[] arr = new int[5];

		while (count < 5) {
			System.out.printf("%d's 정수 : ", count + 1);
			arr[count] = scanner.nextInt();
			if (arr[count] % 2 == 0) {
				count++;
			}
		}

		System.out.println("< 5개의 정수 출력>");
		for (int num : arr) {
			System.out.printf("%d\t", num);
		}
	}
}
