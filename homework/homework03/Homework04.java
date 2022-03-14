package homework03;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] arr = new int[5];
		int count = 0;

		while (count < 5) {
			System.out.printf("%d번째 정수 : ", count + 1);
			arr[count] = scanner.nextInt();

			boolean check = false;

			for (int i = 0; i < count; i++) {
				if (arr[count] < arr[i]) {
					check = true;
				}
			}

			if (check) {
				for (int i = 0; i < count; i++) {
					if (i != (count - 1)) {
						System.out.printf("%d, ", arr[i]);
					} else {
						System.out.printf("%d", arr[i]);
					}

				}
				System.out.print("보다 큰 수가 와야합니다.\n");
			} else {
				count++;
			}

		}

		System.out.println("<PRINT>");

		for (int num : arr) {
			System.out.printf("%d ", num);
		}
		System.out.println();

		System.out.println("<REVERSE>");
		int[] reverseArray = new int[5];
		for (int i = 0; i < arr.length; i++) {
			reverseArray[arr.length - 1 - i] = arr[i];
		}

		for (int num : reverseArray) {
			int result = 0;
			while (num != 0) {
				result = result * 10 + num % 10;
				num /= 10;
			}
			System.out.printf("%d ", result);
		}

	}
}
