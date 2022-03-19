package homework05;

import java.util.Scanner;

public class IcecreamTest {
	
	

	public static void main(String[] args) {
		
		int count = countIcecream();
		Icecream[] icecreamList = new Icecream[count];
		int sum = inputIcecreamOutputSum(icecreamList);
		printIcecreamList(icecreamList, sum);
	}
	
	public static int countIcecream() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몇 개의 아이스크림 구입? : ");
		return Integer.parseInt(scanner.nextLine());
	}
	
	public static int inputIcecreamOutputSum(Icecream[] icecreamList) {
		Scanner scanner = new Scanner(System.in);
		int sum=0;
		
		for(int i=0; i<icecreamList.length; i++) {
			icecreamList[i] = new Icecream();
			
			System.out.printf("*** %d번째 아이스크림 구매정보 ***\n", i+1);
			System.out.print("아이스크림명 : ");
			icecreamList[i].name = scanner.nextLine();
			
			System.out.print("아이스크림가격 : ");
			icecreamList[i].price = Integer.parseInt(scanner.nextLine());
			sum+=icecreamList[i].price;
		}
		
		return sum;
		
	}
	
	public static void printIcecreamList(Icecream[] icecreamList, int sum) {
		System.out.println();
		System.out.println("< 총 3개의 아이스크림 구매정보 출력 >");
		System.out.println("번호\t아이스크림명\t가격");
		
		for(int i=0; i<icecreamList.length; i++) {
			System.out.printf("%d\t%s\t\t%d\n", (i+1), icecreamList[i].name, icecreamList[i].price);
		}
		
		System.out.println();
		System.out.println("총 가격 : " + sum);
	}
	
	
	
}
