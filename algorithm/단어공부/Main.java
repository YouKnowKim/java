package 단어공부;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine().toUpperCase();
		char[] alphabets = new char[30];
		int[] checkList = new int[30];
		Set<Character> set = new HashSet<Character>();
		char ab = 'A';
		int i=0;
		while(ab <= 'Z') {
			alphabets[i] = ab;
			i++;
			ab = (char)(ab+1);
		}
		
		for(int j=0; j<str.length(); j++) {
			set.add(str.charAt(j));
		}
		
		for(int k=0; k<str.length(); k++) {
			if(set.contains(str.charAt(k))){
				checkList[str.charAt(k) - 'A'] +=1;
			}
		}
		int[] tmpCheckList = Arrays.copyOf(checkList, checkList.length);
		Arrays.sort(tmpCheckList);
		if(tmpCheckList[tmpCheckList.length - 1] == tmpCheckList[tmpCheckList.length - 2]) {
			System.out.println("?");
		} else {
			int maxIndex = 0;
			for(int l=1; l<checkList.length; l++) {
				if(checkList[maxIndex] <= checkList[l]) {
					maxIndex = l;
				}
			}
			System.out.println(alphabets[maxIndex]);
		}
		
	}
}




