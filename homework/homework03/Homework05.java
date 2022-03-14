package homework03;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 5 };

		Scanner scanner = new Scanner(System.in);

		System.out.print("Left(-), Right(+) : ");
		String direction = scanner.nextLine().trim();

		System.out.print("Start Index(0-4) : ");
		int startIndex = scanner.nextInt();

		System.out.println("<PRINT>");
		if (direction.equals("+")) {
			for (int i = startIndex; i < startIndex + nums.length; i++) {

				if (i < nums.length) {
					System.out.printf("%d ", nums[i]);
				} else {
					System.out.printf("%d ", nums[i - 5]);
				}
			}

		} else if (direction.equals("-")) {
			for (int i = startIndex; i > startIndex - nums.length; i--) {

				if (i >= 0) {
					System.out.printf("%d ", nums[i]);
				} else {
					System.out.printf("%d ", nums[i + 5]);
				}
			}
		} else {
			System.out.println("ERROR");
		}
	}
}
