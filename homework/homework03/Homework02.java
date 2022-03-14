package homework03;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d's num : ",i+1);
			arr[i] = scanner.nextInt();
		}
		
		int sum = 0;
		System.out.println("<짝수>");
		for(int num : arr) {
			if(num%2==0) {
				System.out.printf("%d ",num);
				sum+=num;
			}
			
		}
		System.out.println();
		System.out.printf("짝수의 총합 : %d \n", sum);
		
		sum =0;
		System.out.println("<홀수>");
		for(int num : arr) {
			if(num%2==1) {
				System.out.printf("%d ",num);
				sum+=num;
			}
			
		}
		System.out.println();
		System.out.printf("홀수의 총합 : %d ", sum);
	}
}
