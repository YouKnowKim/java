package homework03;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d's num : ",i+1);
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("<PRINT>");
		
		for(int num : arr) {
			System.out.printf("%d\t",num);
		}
	}
}
