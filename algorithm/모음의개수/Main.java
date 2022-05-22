package 모음의개수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		List<String> lists = new ArrayList<String>();
		
		while(true) {
			String str = scanner.nextLine().toLowerCase();
			if(str.equals("#")) {
				break;
			} else {
				lists.add(str);
			}
		}
		
		for(String str : lists) {
			int num = 0;
			for(int i=0; i<str.length(); i++) {
				if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ) {
					num++;
				}
			}
			System.out.println(num);
		}
	}
}













