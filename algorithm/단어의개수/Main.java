package 단어의개수;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		if (str.length() == 0) {
			System.out.println(0);
		} else {
			try {
				String[] list = str.split(" ");
				int realLength = list.length;
				if (list[0].equals("")) {
					realLength -= 1;
				}
				if (list[list.length - 1] == "") {
					realLength -= 1;
				}
				System.out.println(realLength);
			} catch (Exception e) {
				System.out.println(0);
			}
			
		}

	}
}
