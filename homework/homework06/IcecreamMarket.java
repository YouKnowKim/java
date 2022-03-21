package homework06;

import java.util.Scanner;

public class IcecreamMarket {

	private int sum = 0;
	private Icecream[] iceList;

	public IcecreamMarket(int sum) {
		super();
		this.sum = sum;
	}

	public IcecreamMarket() {

	}

	public IcecreamMarket(Icecream[] iceList) {
		this.iceList = iceList;
	}

	public Icecream[] getIceList() {
		return iceList;
	}

	public void setIceList(Icecream[] iceList) {
		this.iceList = iceList;
	}

	public int getSum(Icecream[] iceList) {
		sum = 0;
		for (Icecream icecream : iceList) {
			sum += icecream.getPrice();
		}

		return sum;
	}
	

	public Icecream[] countAndSaveIcecreamList() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("아이스크림 몇개 입력 ? ");
		int count = Integer.parseInt(scanner.nextLine());
		Icecream[] iceList = new Icecream[count];

		for (int i = 0; i < count; i++) {
			System.out.print("아이스크림 이름 : ");
			String name = scanner.nextLine();
			System.out.print("아이스크림 가격 : ");
			int price = Integer.parseInt(scanner.nextLine());
			Icecream icecream = new Icecream(name, price);
			iceList[i] = icecream;
		}

		return iceList;

	}

	public void addIcecreamlist(Icecream[] iceList) {
		if(this.iceList != null) {
			Icecream[] newIceList = new Icecream[this.iceList.length + iceList.length];
			System.arraycopy(this.iceList, 0, newIceList, 0, this.iceList.length);
			System.arraycopy(iceList, 0, newIceList,this.iceList.length,iceList.length);
			this.iceList = newIceList;
		}else {
			this.iceList = iceList;
		}
		
	}

	public void printIcecreamList() {
		System.out.println("번호\t이름\t가격");
		for (int i = 0; i < this.iceList.length; i++) {
			System.out.printf("%d\t%s\t%d\n", i + 1, this.iceList[i].getName(), this.iceList[i].getPrice());
		}
	}

	public void printTotalCountAndPrice() {
		System.out.println("총 판매개수 : " + this.iceList.length);
		System.out.println("총 판매액 : " + this.getSum(this.iceList) +"원");
	}

}
