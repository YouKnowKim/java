package kr.ac.kopo.day06;

import java.util.Scanner;

public class ScannerMain01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num1 = Integer.parseInt(sc.nextLine());
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.print("세번째 정수 : ");
		int num3 = sc.nextInt();
	}
}
