package 팔진수이진수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		List<Integer> binaryLists1 = new ArrayList<Integer>();
		
		System.out.println();
		
//		solution();
	}

	public static void solution() {

		Scanner scanner = new Scanner(System.in);
		List<Integer> binaryLists = new ArrayList<Integer>();
		

		String input = scanner.nextLine();

		String decimal = change10(input);

		// 2로 계속 나누어 나머지를 lists에 넣는다.
		


		for (int i = binaryLists.size() - 1; i >= 0; i--) {
			System.out.print(binaryLists.get(i));
		}
		
		if(binaryLists.size() == 0) {
			System.out.print(0);
		}
	}

	// 8진법을 10진법으로 바꾸는 메소드
	public static String change10(String input) {

		StringBuilder tmp = new StringBuilder();
		int i = 0;

		while (i < input.length()) {
			int exp8 = 1;
			// 8의 멱승을 만드는 for 문
			for (int j = 1; j <= i; j++) {
				exp8 *= 8;
			}

			tmp.append(String.valueOf(Integer.parseInt(input.charAt(i) + "") * exp8));
			System.out.println(Integer.parseInt(input.charAt(i) + "") * exp8);
			i++;
		}
		
		return tmp.toString();
	}
}
