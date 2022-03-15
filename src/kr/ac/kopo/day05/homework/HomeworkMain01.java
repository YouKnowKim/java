package kr.ac.kopo.day05.homework;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkMain01 {

	public static void main(String[] args) {
		
		int[] nums = new int[10];
		int[] sum = new int[2];
		Scanner sc = new Scanner(System.in);
		
		int loc = 0;
		while(loc < nums.length) {
			System.out.println(loc + 1 + "번째 정수 입력 : ");
			nums[loc] = sc.nextInt();
			if(nums[loc] >= 0) {
				continue;
			}
			sum[nums[loc]%2] = nums[loc++];
		}
		
		/*
		for(int i=0; i<nums.length;) {
			System.out.println(i + 1 + "번째 정수 입력 : ");
		    nums[i] = sc.nextInt();
		    if(nums[i] >= 0) {
		    	sum[nums[i]%2] += nums[i];
		    	i++;
		    }
		}
		*/
		
		/*
		for(int i = 0; i < nums.length; i++) {
			do{
				System.out.print(i+1 + "번째 정수 입력 : ");
				nums[i] = sc.nextInt();
			}while(nums[i] < 0);
			sum[nums[i]%2] += nums[i];
		}
		*/
		System.out.println(Arrays.toString(sum));
		
		String[] title = {"짝수", "홀수"};
		for(int mod = 0; mod <=1; mod++) {
			System.out.println("< " + title[mod] + " >");
			for(int i=0; i<nums.length; i++) {
				if(nums[i]%2==mod) {
					System.out.print(nums[i] + "  ");
				}
			}
			System.out.println(title[mod] + "총합 : " + sum[mod]);
		}
	}
}
