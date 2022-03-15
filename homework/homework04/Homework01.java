package homework04;


import java.util.Scanner;

class Icecream{
	String name;
	int price;
}

public class Homework01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("몇 개의 아이스크림 구입? : ");
		int count = scanner.nextInt();
		int sum = 0;
		Icecream[] list = new Icecream[count];
		scanner.nextLine();
		
		for(int i=0; i<list.length; i++) {
			list[i] = new Icecream();
			
			System.out.printf("*** %d번째 아이스크림 구매정보 ***\n", i+1);
			System.out.print("아이스크림명 : ");
			list[i].name = scanner.nextLine();
			
			System.out.print("아이스크림가격 : ");
			list[i].price = scanner.nextInt();
			sum+=list[i].price;
			scanner.nextLine();
		}
		
		System.out.println();
		System.out.println("< 총 3개의 아이스크림 구매정보 출력 >");
		System.out.println("번호\t아이스크림명\t가격");
		
		for(int i=0; i<list.length; i++) {
			System.out.printf("%d\t%s\t\t%d\n", (i+1), list[i].name, list[i].price);
		}
		
		System.out.println();
		System.out.println("총 가격 : " + sum);
	
	}
}
