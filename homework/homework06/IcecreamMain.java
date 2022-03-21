package homework06;

import java.util.Scanner;

public class IcecreamMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		IcecreamMarket market = new IcecreamMarket();
		String decision;

		do {
			Icecream[] iceList = market.countAndSaveIcecreamList();
			market.addIcecreamlist(iceList);
			market.printIcecreamList();
			
			System.out.print("계속 주문하시겠습니까? (Yes:Y/y, No:N/n)");
			decision = scanner.nextLine().trim();
		}while(decision.equals("Y") || decision.equals("y"));
		
		market.printTotalCountAndPrice();
		
	}
}
