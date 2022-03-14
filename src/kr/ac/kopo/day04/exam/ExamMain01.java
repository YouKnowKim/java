package kr.ac.kopo.day04.exam;

import java.util.Scanner;

/*
 * ****-****
 * ***---***
 * **-----**
 * *-------*
 * ---------
 * *-------*
 * **-----**
 * ***---***
 * ****-****
 */
public class ExamMain01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("3~40 라인수 입력 : ");
		int line = scanner.nextInt();
		
		if(line %2 == 0) {
			line-=1;
		}
		
		int star = line/2;
		for(int i=1;i<=line ; i++) {
			
			for(int j=1; j<= line; j++) {
				
				if(j <= star || j>= (line+1-star)) {
					System.out.print("*");
				} else {
					System.out.print("-");
				}
				
				
			}
			System.out.println();
			
			if(i <= line/2) {
				star--;
			} else {
				star++;
			}
		}
	}
}













