package homework09;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoUtil {

	public void start() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("게임 수 입력 : ");
		int cnt = Integer.parseInt(scanner.nextLine());
		for(int i=0; i< cnt; i++) {
			System.out.println("게임" + (i+1) + " : " + Arrays.toString(getNumbers()));
		}
	}
	
	private int[] getNumbers() {
		// 1~45 사이의 로또번호 6개 추출
		new Random();
		Math.random();
		
		return null;
	}
}
