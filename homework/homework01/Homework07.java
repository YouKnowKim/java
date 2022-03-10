package homework01;

import java.util.Scanner;

public class Homework07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력(알파벳) : ");
		char alphabet = scanner.nextLine().charAt(0);
		
		if(alphabet >= 65 && alphabet <97) {
			alphabet += 32;
			System.out.println("변경된 값 : " + alphabet);
		} else if(alphabet >= 97) {
			alphabet -= 32;
			System.out.println("변경된 값 : " + alphabet);
		} else {
			System.out.println("ERROR");
		}
		
	}
}
