package kr.ac.kopo.day05.homework;

import java.util.Scanner;

public class HomeworkMain02 {

	public static void main(String[] args) {

		int[] nums = new int[5];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < nums.length; i++) {
			System.out.println(i + 1 + "번째 정수 입력 : ");
			nums[i] = sc.nextInt();
			
			if (i > 0 && nums[i] < nums[i - 1]) {
				
				for (int j = 0; j < i; j++) {
					System.out.print(nums[j] + " ");
				}
				
				System.out.println("보다 큰수여야 합니다");
				i--;
			}
		}
		
		System.out.println("< PRINT >");
		for(int num : nums) {
			System.out.print(num + "\t");
		}
		System.out.println();
		
		System.out.println("< REVERSE >");
		for(int i = nums.length-1; i>=0; i--) {
			// nums[i] = 25 => 52
			int n10 = nums[i] / 10;
			int n1 = nums[i] %10;
			System.out.print(n1*10 + n10 + "");
		}
		System.out.println();
	}
}
