package kr.ac.kopo.day06;

import java.util.Scanner;

public class MethodMain04 {

	public static void main(String[] args) {
		Gugudan gu = new Gugudan();
		
		System.out.print("2 - 9 사이의 단을 입력 : ");
		int dan = gu.getDan();
		
		gu.print();
		
		System.out.print("시작단 입력 : ");
		int startDan = gu.getDan();
		
		System.out.print("종료단 입력 : ");
		int endDan = gu.getDan();
		
		System.out.println(startDan + " : " + endDan);
		
		gu.print(4,5);
	}
}
