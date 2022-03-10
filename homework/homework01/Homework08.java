package homework01;

import java.util.Scanner;

public class Homework08 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		final int MONEY = 10000;
		
		System.out.print("물건값을 입력 : ");
		int price = scanner.nextInt();
		
		if(price <= 10000) {
			System.out.println("지불한 돈의 액수 : " + MONEY);
			
			int change = MONEY - price;
			
			System.out.printf("거스름돈 : %d 원 \n", change);
			System.out.printf("1000 원 : %d개 \n", change/1000);
			System.out.printf("500 원 : %d개 \n", change%1000/500);
			System.out.printf("100 원 : %d개 \n", change%1000%500/100);
			System.out.printf("50 원 : %d개 \n", change%1000%500%100/50);
			System.out.printf("10 원 : %d개 \n", change%1000%500%100%50/10);
		} else {
			System.out.println("돈이 부족해요");
		}
		
	}
}
