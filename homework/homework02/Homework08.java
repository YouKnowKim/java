package homework02;

public class Homework08 {

	public static void main(String[] args) {
		
		for (int i = 1; i < 10; i++) {

			int originalI = i;

			if (i > 5) {
				i = 10 - i;
			}

			for (int j = 1; j <= 5; j++) {
				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}

			}

			i = originalI;

			System.out.println();
		}
	}
}
