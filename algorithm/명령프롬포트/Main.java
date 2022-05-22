package 명령프롬포트;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input = Integer.parseInt(scanner.nextLine());
		List<String> lists = new ArrayList<String>();
		
		
		for(int i=0; i<input; i++) {
			String str = scanner.nextLine();
			lists.add(str);
		}
		
		char[] result = new char[lists.get(0).length()];
		
		for(int i=0; i<lists.get(0).length(); i++) {
			Set<Character> checkList = new HashSet<Character>();
			int checkListSize = checkList.size();
			
			for(String str : lists) {
				checkList.add(str.charAt(i));
			}
			if(checkList.size() == (checkListSize + 1)) {
				result[i] = lists.get(0).charAt(i);
			} else {
				result[i] = '?';
			}
		}
		
		for(char ch : result) {
			System.out.print(ch);
		}
	}
}












