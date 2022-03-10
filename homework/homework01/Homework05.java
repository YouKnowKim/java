package homework01;

import java.util.Scanner;

public class Homework05 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		final double USD = 1092.50;
		
		System.out.print("달러를 입력하세요 : ");
		double myMoney = scanner.nextDouble();
		
		System.out.printf("원화 : %.2f원",myMoney * USD);
		
	}
}
