package homework02;

public class Homework10 {

	public static void main(String[] args) {

		int properValue = 9;

		for (int i = 1; i <= properValue; i++) {

			int originalI = i;

			if (i > properValue / 2) {
				i = properValue - i;
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			for (int k = properValue - 2 * i; k > 0; k--) {
				System.out.print("-");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}

			i = originalI;

			System.out.println();
		}
	}
}
