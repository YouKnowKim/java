package 팰린드롬만들기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		List<Character> lists = new ArrayList<Character>();
		
		
		for(int i=0; i<input.length(); i++) {
			lists.add(input.charAt(i));
		}
		
		int originalSize = lists.size();
		int j = 0;
		while(j <= originalSize) {
			List<Character> tmpLists = new ArrayList<Character>();
			for(Character ch : lists) {
				tmpLists.add(ch);
			}
			
			for(int k = j-1; k >= 0; k--) {
				tmpLists.add(tmpLists.get(k));
			}
			
			boolean check = true;
			for(int i=0; i<tmpLists.size(); i++) {
				if(tmpLists.get(i) != (tmpLists.get(tmpLists.size()-1-i))) {
					check = false;
				}
			}
			if(check) {
				System.out.println(tmpLists.size());
				break;
			}
			j++;
			
		}
		
	}
}











