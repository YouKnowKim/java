package homework02;

public class Homework09 {

	public static void main(String[] args) {

		int count = 0;
		for (int i = 9; i >= 1; i -= 2) {
			for (int j = 0; j < count; j++) {
				System.out.print(" ");
			}
			
			for(int k=0; k<i; k++) {
				System.out.print("*");
			}
			System.out.println();
			count++;
		}
	}
}
