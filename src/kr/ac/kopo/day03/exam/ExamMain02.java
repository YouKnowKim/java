package kr.ac.kopo.day03.exam;

public class ExamMain02 {

	public static void main(String[] args) {

		System.out.println("1번");
		// 1.
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {

				System.out.print(i);
			}

			System.out.println();
		}

		System.out.println();
		System.out.println("2번");
		// 2.
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= 5; j++) {

				System.out.print(j);
			}

			System.out.println();
		}

		System.out.println();
		System.out.println("3번");
		// 3.
		for (int i = 1; i <= 5; i++) {

			for (int j = 0; j < 5; j++) {

				System.out.print(i + j);
			}

			System.out.println();
		}

		System.out.println();
		System.out.println("4번");
		// 4.
		for (int i = 5; i >= 1; i--) {

			for (int j = 0; j < 5; j++) {

				System.out.print(i + j);
			}

			System.out.println();
		}

		System.out.println();
		System.out.println("5번");
		// 5.
		for (int i = 1; i <= 5; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println();
		System.out.println("6번");
		// 6.
		for (int i = 5; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {

				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println();
		System.out.println("7번");
		// 7.
		for (int i = 5; i >= 1; i--) {

			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < i; k++) {

				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println();
		System.out.println("7+번");
		// 7+.
		for (int i = 5; i > 0; i--) {

			for (int j = 5; j > 0; j--) {
				if (j > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}

			System.out.println();
		}

		System.out.println();
		System.out.println("8번");
		// 8.
		for (int i = 5; i > 0; i--) {

			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k <= 5 - i; k++) {

				System.out.print("*");
			}

			System.out.println();
		}

		System.out.println();
		System.out.println("8+번");
		// 8+.
		for (int i = 5; i > 0; i--) {

			for (int j = 1; j < 6; j++) {
				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}

			System.out.println();
		}
		
		System.out.println();
		System.out.println("9번");
		int properValue = 10;
		// 9.
		for (int i = 1; i < properValue; i++) {

			int originalI = i;
			
			if(i>properValue/2) {
				i=properValue-i;
			}
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			
			i=originalI;
			
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("10번");
		// 10.
		for (int i = 1; i < 10; i++) {
			
			int originalI = i;
			
			if(i>5) {
				i=10-i;
			}
			
			for(int j=5; j>=i; j--) {
				System.out.print("*");
			}
			
			i=originalI;
			
			System.out.println();
		}
		
		
		System.out.println();
		System.out.println("11번");
		// 11.
		for (int i = 1; i < 10; i++) {
			
			int originalI = i;
			
			if(i>5) {
				i=10-i;
			}
			
			for(int j=1; j<=5; j++) {
				if(j<i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
				
			}
			
			i=originalI;
			
			System.out.println();
		}
		
		System.out.println();
		System.out.println("12번");
		// 12.
		for (int i = 1; i < 10; i++) {
			
			int originalI = i;
			
			if(i>5) {
				i=10-i;
			}
			
			for(int j=5; j>=1; j--) {
				if(j>=i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				
			}
			
			for(int j=1; j<=5; j++) {
				if(j<i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
				
			}
			
			i=originalI;
			
			System.out.println();
		}

	}

}
