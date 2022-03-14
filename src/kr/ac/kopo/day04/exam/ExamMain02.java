package kr.ac.kopo.day04.exam;

import java.util.Scanner;

/*
 * *********
 * -*******-
 * --*****--
 * ---***---
 * ----*----
 * ---***---
 * --*****--
 * -*******-
 * *********
 */
public class ExamMain02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("라인 수 입력 : ");
		int line = scanner.nextInt();
		
		int space = 0;

		for (int i = 0; i < line; i++) {

			for (int j = 0; j < line; j++) {

				if (j < space || j >= line-space) {
					System.out.print("-");
				} else {
					System.out.print("*");
				}
			}

			System.out.println();

			if(i < line/2) {
				space++;
			}else {
				space--;
			}
		}
	}
}
