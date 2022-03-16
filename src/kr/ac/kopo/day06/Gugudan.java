package kr.ac.kopo.day06;

import java.util.Scanner;

public class Gugudan {
	
	int getDan(){
		Scanner sc = new Scanner(System.in);
		int dan = sc.nextInt();
		return dan;
	}

	void print(int dan) {
		System.out.println("*** " + dan + "단 ***");
		for(int i=0; i<=9; i++) {
			System.out.println(dan + " * " + i + " = " + (dan*i));
		}
	}
	
	void print() {
		
		for(int dan=2; dan<=9; dan++) {
			System.out.println("*** " + dan + "단 ***");
			for(int i=1;i<=9;i++) {
				System.out.printf("%d * %d = %d\n", dan, i, dan*i);
			}
		}
	}
}
