package 단어만들기;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<String> inputs = new ArrayList<String>();
		List<String> nines = new ArrayList<String>();
		
		while(true) {
			String input = scanner.nextLine();
			if(input.equals("-")) {
				break;
			}
			inputs.add(input);
		}
		
		while(true) {
			String nine = scanner.nextLine();
			if(nine.equals("#")) {
				break;
			}
			inputs.add(nine);
		}
		
		int[] inputsCheckList = new int[inputs.size()];
		for(String str : nines) {
			String[] arr = new String[9];
			
			for(int i=0; i<str.length(); i++) {
				arr[i] = str.charAt(i) + "";
			}
			
			for(int i=0; i<arr.length; i++) {
				
				for(String inputStr : inputs) {

					int[] checkList = new int[9];
					
					if(inputStr.indexOf(arr[0]) != -1) {
						for(int j=0; j<inputStr.length(); j++) {
							for(int k=0; k< checkList.length; k++) {
								
							}
						}
					}
				}
			}
			
		}
		
		
	}
}
