package 접두사;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int input = Integer.parseInt(scanner.nextLine());
		List<String> lists = new ArrayList<String>();
		
		for(int i=0; i<input; i++) {
			String str = scanner.nextLine();
			lists.add(str);
		}
		
		for(int i=0; i<lists.size(); i++) {
			String standard = lists.get(i);
			int check = 0;
			for(int j=0; j<lists.size(); j++) {
				if(lists.get(j).indexOf(standard) == 0){
					check++;
				}
			}
			if(check > 1) {
				lists.remove(i);
				i--;
			}
		}
		
		System.out.println(lists.size());
	}
}
















