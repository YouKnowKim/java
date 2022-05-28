package 이상한곱셈;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		solution();
	}

	public static void solution() {

		Scanner scanner = new Scanner(System.in);

		int[] result = new int[1000000];
		String input = scanner.nextLine();
		String[] arr = input.split(" ");
		
		plus(arr, result);

	}

	public static void plus(String[] arr, int[] result) {
		int sum = 0;
		int idx = 0;

		for (int i = 0; i < arr[0].length(); i++) {
			for (int j = 0; j < arr[1].length(); j++) {

				String arr0 = String.valueOf(arr[0].charAt(i));
				
				String arr1 = String.valueOf(arr[1].charAt(j));
				
				int tmp = Integer.parseInt(arr0) * Integer.parseInt(arr1);
				
				result[0] += tmp%10;
				tmp /= 10;
				result[1] += tmp;
				
				for(int k=0; k < result.length; k++) {
					
					if(result[k] >=10 ) {
						result[k+1] += result[k]/10;
						result[k] %= 10;
					}
				}
			}
		}
		
		for (int i = result.length-1; i>=0; i--) {
			if(result[i] != 0) {
				idx = i;
				break;
			}
		}
		
		for (int i=idx; i>=0; i--) {
			System.out.print(result[i]);
		}
		
	}
}




