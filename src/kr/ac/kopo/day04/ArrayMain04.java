package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain04 {

	public static void main(String[] args) {

		int[] arr = new int[] { 10, 20, 30, 40, 50 };
		
//		arr = {5,4,3}; 에러발생
		arr = new int[] {5,4,3};

		System.out.println("arr : " + Arrays.toString(arr));
	}
}
