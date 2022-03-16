package kr.ac.kopo.day06;

public class MethodMain01 {

	static int printStar(char ch, int cnt) {

		for (int i = 0; i < cnt; i++) {
			System.out.print(ch);
		}
		System.out.println();
		
		return ch + cnt;
	}
	
	static void aaa() {
		boolean bool = true;
		System.out.println("A");
		System.out.println("B");
		
		if(bool) {
			return;
		}
		
		System.out.println("C");
		System.out.println("D");
		return;
	}
	
	String[] getSingList() {
		return new String[3];
	}

	public static void main(String[] args) {

		int code = printStar('A', 10);
		printStar('B', 20);
		printStar('C', 5);
		printStar('D', 8);
		System.out.println("Hello");
	}
}
