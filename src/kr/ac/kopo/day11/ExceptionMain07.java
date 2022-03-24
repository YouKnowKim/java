package kr.ac.kopo.day11;

import java.util.Scanner;

class MismathEvenException extends Exception {

	public MismathEvenException() {
		super();
	}

	public MismathEvenException(String message) {
		super(message);
	}

}

public class ExceptionMain07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("짝수를 입력 : ");
			int num = sc.nextInt();

			if (num < 0 || num % 2 == 1) {
				throw new MismathEvenException(num + "은 짝수가 아닙니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

//		if(num < 0 || num %2==1) {
//			System.out.println("잘못입력했습니다.");
//		} else {
//			System.out.println("짝수 : " + num);
//		}
	}
}
